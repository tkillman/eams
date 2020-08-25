<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
파 일 명 : default_template.jsp
작 성 자 : syan
작성일자 : 2020.07.27
처리내용 : 업무 공통 Template
History : 2020.07.27. 최초 작성 (syan)
--%>
<jsp:include page="/WEB-INF/jsp/cpa/cmn/common.jsp"/>

<!-- wrap -->
<div id="wrap" class="sub">
 <%-- ================================================================================
* 화면 header
================================================================================ --%>
<!-- header -->
    <header class="header">
        <tiles:insertAttribute name="header" />
    </header>
<!-- //header -->
<%-- ================================================================================
* body 영역
================================================================================ --%>
   <!-- container -->
    <div id="container">
        <tiles:insertAttribute name="body" />
    </div>
    <!-- //container -->
<%-- ================================================================================
* 화면 footer
================================================================================ --%>
<!-- footer -->
    <footer id="footer">
        <tiles:insertAttribute name="footer"/>
    </footer>
<!-- //footer -->
</div>
<!-- //wrap -->
</body>
</html>
<%-- ================================================================================
* 화면 layout 정의 끝
================================================================================ --%>