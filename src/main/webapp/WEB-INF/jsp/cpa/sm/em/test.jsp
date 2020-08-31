<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator"%>


<validator:javascript formName="crqfcAcqsUploadVO" staticJavascript="false" xhtml="true" cdata="false" />

<script type="text/javascript">
<validator:javascript dynamicJavascript="false" staticJavascript="true"/>
</script>

<script type="text/javascript" src="<c:out value='${pageContext.request.contextPath}/js/jquery-1.5.min.js'/>"></script>
<script type="text/javascript" src="<c:out value='${pageContext.request.contextPath}/js/xlsx.full.min.js'/>"></script>

<script type="text/javascript">
	function excelExport(event){
	    var input = event.target;
	    var reader = new FileReader();
	    reader.onload = function(){
	        var fileData = reader.result;
	        var wb = XLSX.read(fileData, {type : 'binary'});
	        wb.SheetNames.forEach(function(sheetName){
		        var rowObj =XLSX.utils.sheet_to_json(wb.Sheets[sheetName]);
		        console.log(JSON.stringify(rowObj));
		        console.log(rowObj);
	        })
	    };
	    reader.readAsBinaryString(input.files[0]);
	}
</script>

<form:form commandName="entschMngVO" name="entschMngVO" id="entschMngVO" method="post" enctype="multipart/form-data">
	파일 : <input type="file" id="excelFile" onchange="excelExport(event)"/>
</form:form>
