<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script type="text/javascript" src="<c:out value='${pageContext.request.contextPath}/js/jquery-1.5.min.js'/>"></script>
<script type="text/javascript" src="<c:out value='${pageContext.request.contextPath}/js/xlsx.full.min.js'/>"></script>
<script type="text/javascript" src="<c:out value='${pageContext.request.contextPath}/js/excelCommon.js'/>"></script>

<p>hello world crqfcAcqsUpload2.jsp</p>
<form name="crqfcAcqsUploadVO" id="crqfcAcqsUploadVO" method="post">
	기수 : <input type="text" name="cno" id="cno"/>
			<br/>
	자격증 파일 : <input type="file" name="stdntQuflcnExcelAtchmnflFile" id="stdntQuflcnExcelAtchmnflFile" style="width: 50%"/>
				<br/><br/>
	<input type="button" value="저장" onClick="fnUpdateCrqfcAcqsUploadExcel(); return false;" /> <br/><br/><!-- 저장 -->
</form>
	<br/><br/>
	<a href='#none'>자격취득업로드샘플 다운로드</a>
	
	
<script type="text/javascript">
//CpaExcelDataProcessOption 
var CpaExcelDataProcessOption = {
	headerInfo : {
		"교번" : "stdntNo"
		, "이름" : "fnm"
		, "자격증코드" : "quflcnCode"
		, "자격면허번호" : "crqfcNo"
		, "취득일" : "acqsDe"
	},
	fileEl : document.getElementById('stdntQuflcnExcelAtchmnflFile')
}

var cpaExcelStateData = CpaExcelDataProcess(CpaExcelDataProcessOption.fileEl, CpaExcelDataProcessOption.headerInfo);

function fnUpdateCrqfcAcqsUploadExcel () {

	var isExcelFileLoadEnd = cpaExcelStateData.getIsExcelFileLoadEnd();
	if (!isExcelFileLoadEnd) {
		alert('파일이 로딩중입니다.');
		return;
	}
	
	var excelFileJsonData = cpaExcelStateData.getExcelFileJsonData();
	console.log('excelFileJsonData', excelFileJsonData);
	var url, type, async, data, callback;
	//url = '<c:url value="/sa/ts/updateCrqfcAcqsUploadExcel.do"/>';
	url = '<c:url value="/sa/ts/updateCrqfcAcqsUploadExcel2.do"/>';
	type = 'post';
	async = true;
	data = {
		excelFileJsonData : excelFileJsonData
		, crseCode : '00'
		, year : '2020'
	}
	
	data2 = {
			cno : '1'
			, crseCode : '00'
			, year : '2020'
	}
	callback = fnUpdateCrqfcAcqsUploadExcelCallback;
	cfnCallAjax(url, type, async, data, callback);
}

function fnUpdateCrqfcAcqsUploadExcelCallback(){
	console.log('fnUpdateCrqfcAcqsUploadExcelCallback exec');
}
</script>