//excel 파싱
function CpaExcelDataProcess(fileEl, headerInfo) {
	if(!fileEl) throw Error('fileEl is empty');

	//excel 상태값 관리 Obj
	var cpaExcelStateData = {
		isExcelFileLoadEnd : false //엑셀파일로딩종료
		, excelFileJsonData : {} //엑셀파일jsonData
		, getIsExcelFileLoadEnd() {
			return this.isExcelFileLoadEnd;
		}
		, getExcelFileJsonData() {
			return this.excelFileJsonData;
		}
	}
	
	//excel parse Obj
	var processObj = {
		excelExportCommon(event){
			cpaExcelStateData.isExcelFileLoadEnd = false;
		    var input = event.target;
		    var reader = new FileReader();
		    reader.onload = function(){
		        var fileData = reader.result;
		        var wb = XLSX.read(fileData, {type:'binary',cellDates:true, dateNF:"yyyymmdd"});
		        var sheetNameList = wb.SheetNames; // 시트 이름 목록 가져오기 
		        var firstSheetName = sheetNameList[0]; // 첫번째 시트명
		        var firstSheet = wb.Sheets[firstSheetName]; // 첫번째 시트 
		        processObj.changeHeader(firstSheet, headerInfo);
		        processObj.excelExportCallback(firstSheet, cpaExcelStateData);      
		    };
		    reader.readAsBinaryString(input.files[0]);
		},
		excelExportCallback(sheet, cpaExcelStateData){ //callback function
			cpaExcelStateData.excelFileJsonData = XLSX.utils.sheet_to_json(sheet,{raw : false});
			cpaExcelStateData.isExcelFileLoadEnd = true;
		},
		changeHeader(sheet, headerInfo){ //header 정보를 바꾼다.
			if (!headerInfo) return;
			
			var range = XLSX.utils.decode_range(sheet['!ref']);
			for(var C = range.s.r; C <= range.e.r; ++C) {
				  var address = XLSX.utils.encode_col(C) + "1"; // <-- first row, column number C
				  if(!sheet[address]) continue;
				  var initHeaderName = sheet[address].w;
				  sheet[address].w = headerInfo[initHeaderName] || sheet[address].w;
			}
		}
	}
	
	//이벤트 binding
	fileEl.addEventListener('change', e => {
		processObj.excelExportCommon(e);
	})
	
	return cpaExcelStateData;
}