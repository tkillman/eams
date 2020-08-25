<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<%--
/************************************************************************************
* 프로그램명             : 업무 EMPTY Template
* 프로그램 내용       : 화면 layout 정의
* 작성자               : syan
* 작성일자              : 2020-07-27
*************************************************************************************
* 수정자   수정일자    수정내용
*************************************************************************************
* syan    2020-07-27  최초작성
************************************************************************************/
--%>

<%-- ================================================================================
* 공통 상단 include
* 공통 tag library 및 tld 등록 (/WEB-INF/jsp/cpa/cmn/common.jsp)
================================================================================ --%>
<jsp:include page="/WEB-INF/jsp/cpa/cmn/common.jsp"/>

<%-- ================================================================================
* body 영역
================================================================================ --%>
<tiles:insertAttribute name="body" />

</body>
</html>
<%-- ================================================================================
* 화면 layout 정의 끝
================================================================================ --%>