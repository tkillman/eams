<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script type="text/javascript" src="/js/jquery-1.5.min.js"></script> 
<script type="text/javascript">
<c:if test="isSuccess">
alert("업로드에 성공하였습니다.");
</c:if>

function fnSubmit () {
	console.log('fnSubmit');
	var frm = document.getElementById("crqfcAcqsUploadVO");
	frm.action = "/sa/ts/updateCrqfcAcqsUploadExcel.do";
	frm.submit();
}

function fnSheejsSubmit () {
//	console.log('fnSheejsSubmit');
//	var frm = document.getElementById("crqfcAcqsUploadVO2");
//	console.log(frm);
//	frm.submit();
	//var frm = document.getElementById("crqfcAcqsUploadVO2");
	var frmData = $("#crqfcAcqsUploadVO2").serialize();
	console.log('frmData');
	console.log(frmData);
	$.ajax({
	    url: "/sa/ts/updateSheetjsExcel.do",
	    type: "POST",
	    cache: false,
	    dataType: "json",
	    contentType: "application/json;charset=UTF-8",
	    data: frmData,
	    success: function(data){
	    	console.log('success :: ' + data);
	    	
	    },
	    error: function (request, status, error){
	    	console.log('error');
	    	console.log(error);
	    	console.log(request);
	    	console.log(status);
	    }
	  });

}
</script>

<form:form commandName="crqfcAcqsUploadVO" name="crqfcAcqsUploadVO" id="crqfcAcqsUploadVO" method="post" enctype="multipart/form-data">
<input type="file" name="stdntQuflcnExcelAtchmnflFile"/>
<form:errors path="stdntQuflcnExcelAtchmnflFile"></form:errors>
<input type="button" onclick="fnSubmit()" value="저장"/>
</form:form>

<a href="/sa/ts/writeCrqfcAcqsSampleUploadExcel.do">자격증업로드샘플다운로드</a>

<a href='<c:url value="/upload/자격증엑셀업로드샘플.xlsx"/>'>자격증업로드샘플다운로드222</a>
<br/><br/><br/>
===========================
javscript sheetjs
<form:form commandName="crqfcAcqsUploadVO2" name="crqfcAcqsUploadVO2" id="crqfcAcqsUploadVO2" method="post" action="/sa/ts/updateSheetjsExcel.do">
	<input type="text" name="cno2"/>
	<input type="button" onclick="fnSheejsSubmit()" value="저장"/> json 데이터 보내보기
</form:form>