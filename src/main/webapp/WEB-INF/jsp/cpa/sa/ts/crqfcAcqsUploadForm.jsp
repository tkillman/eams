<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  
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
</script>

<form:form commandName="crqfcAcqsUploadVO" name="crqfcAcqsUploadVO" id="crqfcAcqsUploadVO" method="post" enctype="multipart/form-data">
<input type="file" name="stdntQuflcnExcelAtchmnflFile"/>
<form:errors path="stdntQuflcnExcelAtchmnflFile"></form:errors>
<input type="button" onclick="fnSubmit()" value="저장"/>
</form:form>

<a href="/sa/ts/writeCrqfcAcqsSampleUploadExcel.do">자격증업로드샘플다운로드</a>

<a href='<c:url value="/upload/자격증엑셀업로드샘플.xlsx"/>'>자격증업로드샘플다운로드222</a>