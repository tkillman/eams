<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<p>Main</p>
<script>
$(function(){
	fnTestJson();
});

function fnTestJson() {
    var url = "/co/ma/testJson";
    var type = "POST";
    var param = {};

    cfnCallAjax(url, type, true, param, fnTestJsonCallBack);
}

function fnTestJsonCallBack(response) {
	var result = response.result;
    //alert(result.data);
}
</script>