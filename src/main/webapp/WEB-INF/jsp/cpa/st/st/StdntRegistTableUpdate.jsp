<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="validator" uri="http://www.springmodules.org/tags/commons-validator"%>

<html>
	<head>
		<style>
			button {
				width: 100px;
				height: 50px;
				font-size: 1.3em;
				margin: 30px;
				background-color: #bbb
			}
		</style>
		<script type="text/javascript">
			$(document).ready(function() {
			});
		</script>
	</head>
	<body>
		<c:choose>
		    <c:when test="${stdntRegistTableVO.tabUnit == '1' }">
		    	<input type="text" value="${tabDataVO.fnm }">
		    	<input type="text" value="${tabDataVO.brthdy }" disabled>
		    	<input type="text" value="${tabDataVO.moblphon }">
		    	<input type="text" value="${tabDataVO.entschSttusCodeNm }" disabled>
		    	<input type="text" value="${tabDataVO.chcrtFnm }">
		    	<input type="text" value="${tabDataVO.engFnm }">
		    	<select>
		    	</select>
		    	<input type="text" value="${tabDataVO.mail }">
		    	<input type="text" value="${tabDataVO.ownhomCttpc }">
		    	<input type="text" value="${tabDataVO.inschCttpc }">
		    	
		    	<input type="text" value="${tabDataVO.zip }">
		    	<input type="text" value="${tabDataVO.adres }">
		    	
		    	<input type="text" value="${tabDataVO.cno }" disabled>
		    	<input type="text" value="${tabDataVO.clasNm }" disabled>
		    	<input type="text" value="${tabDataVO.stdntNo }" disabled>
		    	<select></select>
		    	<select></select>
		    	<select></select>
		    	<select></select>
		    	<select></select>
		    </c:when>
		    <c:when test="${stdntRegistTableVO.tabUnit == '2' }">
		    	<input type="text" value="${tabDataVO.height }">
		    	<input type="text" value="${tabDataVO.bdwgh }">
		    	<input type="text" value="${tabDataVO.leftCrrcVspr }">
		    	<input type="text" value="${tabDataVO.rghtCrrcVspr }">
		    </c:when>
		    <c:when test="${stdntRegistTableVO.tabUnit == '3' }">
		    	3
		    </c:when>
		    <c:when test="${stdntRegistTableVO.tabUnit == '4' }">
		    	4
		    </c:when>
		    <c:when test="${stdntRegistTableVO.tabUnit == '5' }">
		    	5
		    </c:when>
		    <c:when test="${stdntRegistTableVO.tabUnit == '6' }">
		    	6
		    </c:when>
		    <c:when test="${stdntRegistTableVO.tabUnit == '7' }">
		    	7
		    </c:when>
		    
		</c:choose>
	</body>
</html>