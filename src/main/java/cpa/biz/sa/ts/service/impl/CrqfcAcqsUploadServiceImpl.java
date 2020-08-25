package cpa.biz.sa.ts.service.impl;

import java.util.Optional;
import java.util.stream.IntStream;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import cpa.biz.sa.ts.dao.CrqfcAcqsUploadDAO;
import cpa.biz.sa.ts.model.CrqfcAcqsUploadExcelEnum;
import cpa.biz.sa.ts.model.CrqfcAcqsUploadVO;
import cpa.biz.sa.ts.service.CrqfcAcqsUploadService;
import egovframework.rte.fdl.excel.EgovExcelService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadServiceImpl.java
* 클래스 설명 : 자격증취득내역업로드
* 		
* @author 김동규
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   김동규	최초 생성
* </pre>
*/
@Service("CrqfcAcqsUploadService")
public class CrqfcAcqsUploadServiceImpl implements CrqfcAcqsUploadService{
	
	private static final Logger Logger = LoggerFactory.getLogger(CrqfcAcqsUploadServiceImpl.class);
	
	@Autowired
	CrqfcAcqsUploadDAO crqfcAcqsUploadDAO;
	
	@Resource(name = "crqfcAcqsUploadExcelService")
	private EgovExcelService crqfcAcqsUploadExcelService;
	
	private static final String errorField = "stdntQuflcnExcelAtchmnflFile";
	
	@Override
	public int updateCrqfcAcqsUploadExcel(CrqfcAcqsUploadVO crqfcAcqsUploadVO) {
		return crqfcAcqsUploadDAO.updateCrqfcAcqsUploadExcel(crqfcAcqsUploadVO);
	}

	public String returnAMethod() {
		return "a";
	}

	@Override
	public void validate(CrqfcAcqsUploadVO crqfcAcqsUploadVO, BindingResult bindingResult) {
		
		MultipartFile uploadFile = crqfcAcqsUploadVO.getStdntQuflcnExcelAtchmnflFile();	
		Workbook wbT = null;
				
		//excelFile인지 확인
		if (!(uploadFile.getOriginalFilename().endsWith(".xls") || uploadFile.getOriginalFilename().endsWith(".XLS")
				|| uploadFile.getOriginalFilename().endsWith(".xlsx") || uploadFile.getOriginalFilename().endsWith(".XLSX"))) {
			bindingResult.rejectValue(errorField, "stdntQuflcnExcelAtchmnflFile.notExcel"); //엑셀파일이 아닙니다.
			return;
		}
		
		try {
			
			if (uploadFile.getOriginalFilename().endsWith(".xls") || uploadFile.getOriginalFilename().endsWith(".XLS")) {
				wbT = crqfcAcqsUploadExcelService.loadWorkbook(uploadFile.getInputStream());
			} else if (uploadFile.getOriginalFilename().endsWith(".xlsx") || uploadFile.getOriginalFilename().endsWith(".XLSX")) {
				wbT = crqfcAcqsUploadExcelService.loadWorkbook(uploadFile.getInputStream(), new XSSFWorkbook());
			}

			Sheet sheet = wbT.getSheetAt(0);
			Logger.debug("sheet.getLastRowNum() ::" + sheet.getLastRowNum());
			
			if (uploadFile.getSize() == 0 || sheet.getLastRowNum() == 0 || sheet.getLastRowNum() == 1) {
				bindingResult.rejectValue(errorField, "stdntQuflcnExcelAtchmnflFile.emptyFile"); // 엑셀이 빈 파일입니다.
				return;
			}
			
			IntStream.range(1, sheet.getLastRowNum() + 1)
						.forEach(i -> {
							Row row = sheet.getRow(i);
							Logger.debug("CrqfcAcqsUploadExcelEnum.values().length :" + CrqfcAcqsUploadExcelEnum.values().length);
							IntStream.range(0, CrqfcAcqsUploadExcelEnum.values().length)
										.forEach(j -> {
											Cell cell = row.getCell(j);
											if (cell == null) {
												Integer[] excelRowAndColIndexInfo = {i + 1, j + 1};
												bindingResult.rejectValue(errorField,"stdntQuflcnExcelAtchmnflFile.cell.empty", excelRowAndColIndexInfo,"");
											} else {
												Logger.debug("i : " + i + " j :" + j + "cell type: " + cell.getCellType());
												validateCellTypeAndValue(cell, bindingResult);
											}
											
										});
						});
		} catch (Exception e) {
			bindingResult.rejectValue(errorField, "stdntQuflcnExcelAtchmnflFile.notKnowError");
			e.printStackTrace();
		}
	}
	
	//cell 유효성 체크
	public void validateCellTypeAndValue(Cell cell, BindingResult bindingResult) {
		int colIndex = cell.getColumnIndex();
		if (colIndex == CrqfcAcqsUploadExcelEnum.STDNT_NO.getCrqfcAcqsUploadExcelCellNum()
				|| colIndex == CrqfcAcqsUploadExcelEnum.ACQS_DE.getCrqfcAcqsUploadExcelCellNum()) { //교번, 취득일
			validateNumericCellTypeAndValue(cell, bindingResult);	
		} else if (colIndex == CrqfcAcqsUploadExcelEnum.FNM.getCrqfcAcqsUploadExcelCellNum()
					|| colIndex == CrqfcAcqsUploadExcelEnum.QUFLCN_CODE.getCrqfcAcqsUploadExcelCellNum()
					|| colIndex == CrqfcAcqsUploadExcelEnum.CRQFC_NO.getCrqfcAcqsUploadExcelCellNum()
					) { //이름, 자격면허코드, 자격면허번호, 취득일
			validateStringCellTypeAndValue(cell, bindingResult);
		} 
	}
	
	public void validateNumericCellTypeAndValue(Cell cell, BindingResult bindingResult) {
		if (!(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)) { //숫자형식이 아닌경우
			bindingResult.rejectValue(errorField, "stdntQuflcnExcelAtchmnflFile.cell.notNumeric", getRowAndColIndexByCell(cell), "");
		} 
	}
	
	public void validateStringCellTypeAndValue(Cell cell, BindingResult bindingResult) {
		if (!(cell.getCellType() == Cell.CELL_TYPE_STRING)) { //문자형식이 아닌경우
			bindingResult.rejectValue(errorField, "stdntQuflcnExcelAtchmnflFile.cell.notString", getRowAndColIndexByCell(cell), "");
		} else if(StringUtils.isEmpty(cell.getStringCellValue())){ //숫자형식이지만 값이 없는 경우	
			bindingResult.rejectValue(errorField, "stdntQuflcnExcelAtchmnflFile.cell.empty", getRowAndColIndexByCell(cell), "");
		}
	}
	
	public Integer[] getRowAndColIndexByCell(Cell cell) {
		Integer[] excelRowAndColIndexInfo = new Integer[2];
		excelRowAndColIndexInfo[0] = cell.getRowIndex() + 1;
		excelRowAndColIndexInfo[1] = cell.getColumnIndex() + 1;
		return excelRowAndColIndexInfo;
	}
}
