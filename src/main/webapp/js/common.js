/******************************************************************************
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* 파 일 명 : common.js
* 설 명 : 공통 화면 로직에 대한 JavaScript
* 작 성 자 : syan
* 작 성 일 : 2020.07.27
* History : 2020.07.27 최초작성(syan)
******************************************************************************/

/* 
	ajax 호출
	url : 경로
	type : POST, GET
	async : true(비동기), false(동기)
	data : {"data" : "test"}
	callback : ajax 호출 success 시 호출하는 함수
	ex) cfnCallAjax(url, type, async, param, fnInsertCallBack);
/*/
function cfnCallAjax(url, type, async, data, callback) {
	$.ajax({
		url: url
		, type : type
		, contentType : "application/json"
		, dataType : "json"
		, async : async
		, data : JSON.stringify(data)
		, success : function(response) {
			//var result = response.result;
			callback(response);
		}
		, error : function(xhr, option, error) {
			alert("서버와 통신 중 장애가 발생 하였습니다.");
		}
	});
}

/*
	숫자 천자리 구분
	cfnPrettyNumber(숫자)
	ex) cfnPrettyNumber(10000) -> 10,000
/*/
function cfnPrettyNumber(num) {
    var minusVal = "";
    var pointval = "";

    if ($.isEmpty(num)) {
        return 0;
    }

    var val = num.toString();

    // 마이너스 값일 경우 마이너스 제거
    if (num < 0) {
        minusVal = "-";
        val = val.substring(1);
    }

    // 소수점 이하 값이 있을 경우 소수점 제거
    var iIdx = val.lastIndexOf(".");
    if (iIdx != -1) {
        pointval = val.substring(iIdx);
        val = val.substring(0, iIdx);
    }
    var delimiter = ",";
    return minusVal + val.replace(new RegExp("(^\\d{"+(val.length%3||-1)+"})(?=\\d{3})"),"$1"+delimiter).replace(/(\d{3})(?=\d)/g,"$1"+delimiter) + pointval;
}

/*
	전화번호 (-) 처리
	cfnTelNoFormat(전화번호)
	ex) cfnTelNoFormat('0212345678') -> 02-1234-5678
/*/
function cfnTelNoFormat(strValue) {
    if ($.isEmpty(strValue)) return "";

    return strValue.replace(/(^02.{0}|^01.{1}|[0-9]{3})([0-9]+)([0-9]{4})/,"$1-$2-$3");
}

/*
	날짜 변환처리
	cfnDashDate(날짜문자열)
	ex) cfnDashDate('20200101') -> 2020-01-01
	    cfnDashDate('20200101', '.') -> 2020.01.01
/*/
function cfnDashDate(strValue, strDateMark) {
    var strResult = "";
    var strDate = strValue;
    if ($.isEmpty(strDateMark)) {
        strDateMark = "-";
    }

    if ($.isEmpty(strDate)) {
        return strResult;
    }

    if(strDate.indexOf("-") > -1){
        strDate = strDate.replace(/-/gi,'');
    }

    var yy = '';
    var mm = '';
    var dd = '';

    if(strDate.length >= 4) {
    	yy = strDate.substring(0,4);
    }
    if(strDate.length >= 6) {
    	mm = strDate.substring(4,6);
    }
    if(strDate.length >= 8) {
    	dd = strDate.substring(6,8);
    }
    if(strDate.length == 6) {
      strResult = yy + strDateMark + mm;
    } else if(strDate.length == 8) {
      strResult = yy + strDateMark + mm + strDateMark + dd;
    }

     return strResult;
}

/*
	날짜시간 변환처리
	cfnDashDateTime(날짜시간문자열)
	cfnDashDateTime('20200101131110') -> 2020-01-01 13:11:10
	cfnDashDateTime('20200101131110', '/', '/') -> 2020/01/01 13/11/10
/*/
function cfnDashDateTime(strValue, separatorDate, separatorTime) {

    if (!separatorDate) {
        separatorDate = "-";
    }

    if (!separatorTime) {
        separatorTime = ":";
    }

    var rtnStr = strValue.replace(/[^0-9]/g, "");

    if (rtnStr.length < 14) {
        rtnStr = rtnStr.substring(0, 14);
    }

    if (rtnStr.length >= 14) {
        rtnStr = rtnStr.substring(0, 4) + separatorDate
            + rtnStr.substring(4, 6) + separatorDate + rtnStr.substring(6, 8)
            + " " + rtnStr.substring(8, 10) + separatorTime
            + rtnStr.substring(10, 12) + separatorTime
            + rtnStr.substring(12, 14);
    } else if (rtnStr.length >= 12) {
        rtnStr = rtnStr.substring(0, 4) + separatorDate
            + rtnStr.substring(4, 6) + separatorDate + rtnStr.substring(6, 8)
            + " " + rtnStr.substring(8, 10) + separatorTime
            + rtnStr.substring(10, 12);
    } else if (rtnStr.length >= 10) {
        rtnStr = rtnStr.substring(0, 4) + separatorDate
            + rtnStr.substring(4, 6) + separatorDate + rtnStr.substring(6, 8)
            + " " + rtnStr.substring(8, 10);
    } else if (rtnStr.length >= 8) {
        rtnStr = rtnStr.substring(0, 4) + separatorDate
            + rtnStr.substring(4, 6) + separatorDate + rtnStr.substring(6, 8);
    } else if (rtnStr.length > 6) {
        rtnStr = rtnStr.substring(0, 4) + separatorDate
            + rtnStr.substring(4, 6);
    } else if (rtnStr.length > 4) {
        rtnStr = rtnStr.substring(0, 4);
    }

    return rtnStr;
}

/*
	주민등록번호 (*)처리
	fnIdnoCnvr(주민등록번호)
	ex) cfnIdnoCnvr('9001011234567') -> 900101 - *******
/*/
function cfnIdnoCnvr(idno) {
    if ($.isNotEmpty(idno)) {
        idno = idno.replace(/[^0-9]/g, '');

        if (idno.length == 13) {
            idno = idno.substring(0,6) + " - *******";
        }
    }
    return idno;
}

/*
	스크롤 상단으로 위치이동
	cfnScrollTop()
/*/
function cfnScrollTop() {
    $("html").scrollTop(0);
}

/*
	null, undefined 처리
	ex) cfnEmpty(null) -> ""
/*/
function cfnEmpty(str) {
    if ($.isEmpty(str)) {
        str = "";
    } else if ("NULL" == str) {
        str = "";
    } else if ("null" == str) {
        str = "";
    }
    return str;
}

/*
	숫자 처리(빈값인 경우 0 처리, 음수, 소수 포함)
	ex) cfnNumber('') -> 0
	    cfnNumber('11') -> 11
/*/
function cfnNumber(number) {
    if ($.isEmpty(number)) {
        number = "0";
    } else {
        number = String(number).replace(/[^-0-9\.]/g, '');
    }
    return parseFloat(number);
}

/*
	String형 숫자 처리(빈값인 경우 0 처리)
	ex) cfnStringNumber('') -> '0'
	    cfnStringNumber('11') -> '11'
/*/
function cfnStringNumber(number) {
    if ($.isEmpty(number)) {
        number = "0";
    } else {
        number = String(number).replace(/[^0-9]/g, '');
    }
    return number;
}

/*
	특수문자 제거
	ex) cfnSpecialChar('2020-01-01') -> 20200101
/*/
function cfnSpecialChar(str) {
    if ($.isEmpty(str)) {
        str = "";
    } else {
        str = str.replace(/[\{\}\[\]\/?.,;:|\)*~`!^\-_+<>@\#$%&\\\=\(\'\"]/gi, '');
    }
    return str;
}

/*
	금칙어 체크
	ex) cfnSlangCeck('test')
		<input type="text" id="test" name="test" />
/*/
function cfnSlangCeck(id) {
	var invalid = true;

    if ($.isEmpty(id)) {
        id = document;
    } else {
        id = "#"+id;
    }
    
	var text = $(id).val();
	var slangList = [];
	var slangCeckList = [];

	for(var i = 0;i < slangList.length;i++){ 
		if(text.indexOf(slangList[i]) > -1) {
			if(slangCeckList.indexOf('"' + slangList + '"') < 0){
				slangCeckList.push('"' + slangList + '"');
			}
		}
	}
	
	if(slangCeckList.length > 0){
		alert("입력하신 내용에 금칙어를 포함하고 있습니다.");
		$(id).focus();

        invalid = false;
        return false;
	}
	
	if (!invalid) {
        return false;
    }

    return true;
}

/*
	XSS check
	ex) cfnXssFilterChar('<script>') -> "&lt;script&gt;
/*/
function cfnXssFilterChar(str) {
    var temp  = "";
    if ($.isEmpty(str)) {
        temp = "";
    } else {
        temp = str.replace(/[&]/gi, "&amp;");
        temp = temp.replace(/[<]/gi, "&lt;");
        temp = temp.replace(/[>]/gi, "&gt;");
        temp = temp.replace(/[']/gi, "&#x27;");
        temp = temp.replace(/["]/gi, "&quot;");
        temp = temp.replace(/[(]/gi, "&#40;");
        temp = temp.replace(/[)]/gi, "&#41;");
        temp = temp.replace(/[/]/gi, "&#x2F;");
    }
    return temp;
}

/*
	XSS check
	ex) cfnXssFilterDecoderChar('&lt;div&gt;') -> <div>
/*/
function cfnXssFilterDecoderChar(str) {
    var temp  = "";
    if ($.isEmpty(str)) {
        temp = "";
    } else {
        temp = str.replace("&amp;", "&");
        temp = temp.replace("&lt;", "<");
        temp = temp.replace("&gt;", ">");
        temp = temp.replace("&#x27;", "'");
        temp = temp.replace("&quot;", /["]/gi);
        temp = temp.replace("&#40;", "(");
        temp = temp.replace("&#41;", ")");
        temp = temp.replace("&#x2F;", /[/]/gi);
    }
    return temp;
}

/*
	브라우저 체크
	ex) cnfIsBrowserCheck() -> Chrome
/*/
function cnfIsBrowserCheck(){ 
	var agt = navigator.userAgent.toLowerCase(); 
	if(agt.indexOf('edge/') > -1) return 'Internet Explorer Edge';
	if (agt.indexOf("chrome") != -1) return 'Chrome'; 
	if (agt.indexOf("opera") != -1) return 'Opera'; 
	if (agt.indexOf("staroffice") != -1) return 'Star Office'; 
	if (agt.indexOf("webtv") != -1) return 'WebTV'; 
	if (agt.indexOf("beonex") != -1) return 'Beonex'; 
	if (agt.indexOf("chimera") != -1) return 'Chimera'; 
	if (agt.indexOf("netpositive") != -1) return 'NetPositive'; 
	if (agt.indexOf("phoenix") != -1) return 'Phoenix'; 
	if (agt.indexOf("firefox") != -1) return 'Firefox'; 
	if (agt.indexOf("safari") != -1) return 'Safari'; 
	if (agt.indexOf("skipstone") != -1) return 'SkipStone'; 
	if (agt.indexOf("msie") != -1) { 
		var rv = -1; 
		if (navigator.appName == 'Microsoft Internet Explorer') { 
			var ua = navigator.userAgent; 
			var re = new RegExp("MSIE ([0-9]{1,}[\.0-9]{0,})"); 
		if (re.exec(ua) != null) 
			rv = parseFloat(RegExp.$1); 
		} 
		return 'Internet Explorer '+rv; 
	} 
	if (agt.indexOf("rv:11.0") != -1) return 'Internet Explorer 11';
	if (agt.indexOf("netscape") != -1) return 'Netscape'; 
	if (agt.indexOf("mozilla/5.0") != -1) return 'Mozilla'; 
}

/*
	입력 초기화
	cfnInptInit(id)
	ex) cfnInptInit(); -> 해당 소스에 있는 입력항목 전체 초기화
		cfnInptInit("info"); -> id 'info' 안에 있는 입력항목 전체 초기화
/*/
function cfnInptInit(id) {
    var invalid = true;

    if ($.isEmpty(id)) {
        id = document;
    } else {
        id = "#"+id;
    }

    $(id).find("input, select, textarea").each(function(idx, obj) {
        if ($(this).get(0).type == "checkbox" || $(this).get(0).type == "radio") {
            var id = $(this).attr("id");
            $("input[id="+id+"]").attr("checked", false);
        } else {
            $(this).val("");
        }
    });
}

/*
	필수 입력 체크 - 해당 id 영역에 포함되어 있는 입력 항목 유효성 체크
	필수 입력 체크할 항목에 'required data-name="항목명"' 추가
	다중 checkbox이거나 radio인 경우 하나만 'required data-name="항목명"' 추가
	ex) if (!cfnRequired("info")) {
            return;
        }
        
	<div id="info">
		<input type="text" id="text" name="text" required data-name="input" />
		
		<select id="sel" name="sel" required data-name="selectbox">
	    	<option value="">선택</option>
	    	<option value="1">111</option>
	    </select>
	    
	    <textarea id="test" name="test" required data-name="textarea"></textarea>
	    
		<input type="radio" id="radio1" name="radio" value="01" required data-name="radio" />
		<input type="radio" id="radio2" name="radio" value="02" />
		
		<input type="checkbox" id="check1" name="check" required data-name="check" />
		<input type="checkbox" id="check2" name="check" />
	</div>
/*/
function cfnRequired(id) {
    var invalid = true;

    if ($.isEmpty(id)) {
        id = document;
    } else {
        id = "#"+id;
    }

    $(id).find("input, select, textarea").each(function(idx, obj) {
        if ($(this).attr("required")) {
            var objName = $(this).attr("data-name");
            var _this = $(this);

            if ($.isEmpty(objName)) {
                objName = "";
            }

            if ($(this).get(0).type == "checkbox" || $(this).get(0).type == "radio") {
                var name = $(this).attr("name");
                if (!$(id).find('input[name="'+name+'"]').is(':checked')) {
                    alert(objName + "은(는) 필수 항목입니다.");
                    _this.get(0).focus();

                    invalid = false;
                    return false;
                }
            } else {
                var value = $(this).val();
                if ($.isEmpty(value)) {
                    value = "";
                }
                if ($.isEmpty(value.trim())) {
                    alert(objName + "은(는) 필수 항목입니다.");
                    _this.focus();

                    invalid = false;
                    return false;
                }
            }
        }
    });

    if (!invalid) {
        return false;
    }

    return true;
}

/* 
	페이지 이동
	ex) cfnPageMvmn('/tmpl/tmpl001')
		cfnPageMvmn('/tmpl/tmpl001', {"data" : "data"})
/*/
function cfnPageMvmn(url, param) {
    if ($.isEmpty(url)) {
        url = "/main";
    }

    if ($.isEmpty(param)) {
        param = {};
    }

    var $form = $("<form/>");
    $form.attr({
        "name": "pageMvmnForm",
        "action": url,
        "method": "POST"
    });
    $.each(param, function(key, value){
        var $input = $("<input/>", {type:"hidden", name: key, value: value});
        $form.append( $input );
    });
    $("body").append($form);
    $form.submit();
    $form.remove();
}

/* 
	공통 입력 처리
	입력항목을 append 하거나 prepend 할 경우
/*/
function cfnInit(){
    /* 
		전화번호 입력시 (-) 처리
 		ex) <input type="text" id="test" name="test" data-type="tel" />
    /*/
    $("input[data-type=tel]").bind('change keyup input', function(event){
        var value = $(this).val();
        addValue = [];
        value = value.replace(/[^0-9]/g, '');

        if (value.length >= 3) {
            if (value.substring(0, 2) == '02') { // 서울 번호를 체크하기 위한 조건
                addValue.push(value.substring(0, 2));
                if (value.length >= 3) {
                    var endKey = (value.length >= 10 ? 6 : 5); // 00-000-000, 00-0000-0000 처리
                    addValue.push(value.substring(2, endKey));
                    if (value.length >= 6) {
                        if (value.length >= 10) { // 10자리 이상 입력 방지
                            value = value.substring(0, 10);
                        }
                        addValue.push(value.substring(endKey, value.length));
                    }
                }
            } else {
                addValue.push(value.substring(0, 3));
                if (value.length >= 4) {
                    var endKey = (value.length >= 11 ? 7 : 6); // 000-000-0000, 000-0000-0000 처리
                    addValue.push(value.substring(3, endKey));
                    if (value.length >= 7) {
                        if (value.length >= 11) { // 11자리 이상 입력 방지
                            value = value.substring(0, 11);
                        }
                        addValue.push(value.substring(endKey, value.length));
                    }
                }
            }
            $(this).val(addValue.join('-'));
        }else{
            $(this).val(value);
        }
    });
    
    /* 
		숫자 입력시 세자리 마다 comma 처리
		ex) <input type="text" id="test" name="test" data-type="amt" />
	/*/
    $("input[data-type=amt]").bind('change keyup input', function(event){
        var value = $(this).val();

        value = value.replace(/[^0-9]/g, '');
        value = value.replace(/,/g,'');
        value = value.replace(/\B(?=(\d{3})+(?!\d))/g,',');

        $(this).val(value);
    });
    
    /* 
		숫자만 입력
		ex) <input type="text" id="test" name="test" data-type="num" />
	/*/
    $("input[data-type=num]").bind('change keyup input', function(event){
        var value = $(this).val();
        value = value.replace(/[^0-9]/g, '');
        $(this).val(value);
    });
    
    /* 
		소수점만 입력
		data-max 속성 입력 안할 경우 소수점 1자리 기본
		ex) <input type="text" id="test" name="test" data-type="dec" data-max="소수점제한자릿수" />
	/*/
	$("input[data-type=dec]").bind('change keyup input', function(event){
		var value = $(this).val();
		var max = $(this).attr("data-max");
		value = value.replace(/[^0-9\.]/g, '');
		
		if (max == "") {
			max = "1";
		}
		
		var regex = new RegExp('^\\d*.?\\d{0,' + max + '}$');
		if (!regex.test(this.value)) {
			$(this).val(value.substring(0, value.length-1));
		}
	});
    
    /* 
		maxlength 처리
		ex) <input type="text" id="test" name="test" maxlength="10" />
			<textarea id="test" name="test" maxlength="100" />
	/*/
    $(document).find("input, textarea").bind('change keyup input', function(event){
        if ($(this).is("[maxlength]")) {
            var str = $(this).val();
            var maxlength = $(this).attr("maxlength");

            var strByteLen = 0;
            var strTitle = "";
            var strPiece = "";
            var check = false;

            for (i=0; i<str.length; i++) {
                var code = str.charCodeAt(i);
                var ch = str.substr(i, 1).toUpperCase();
                strPiece = str.substr(i, 1);

                code = parseInt(code);
                
                /*
                if ((ch < "0" || ch > "9") && (ch < "A" || ch > "Z") && ((code > 255) || (code < 0))) {
                    strByteLen = strByteLen + 3; // 3byte 계산
                } else {
                    strByteLen = strByteLen + 1;
                }
				*/
                strByteLen = strByteLen + 1;
                
                if (strByteLen > maxlength) { // 제한 길이 확인
                    check = true;
                    break;
                } else {
                    strTitle = strTitle + strPiece; // 제한 길이 보다 작으면 자른 문자를 붙여준다.
                }
            }

            if (check) {
                $(this).val(strTitle);
            }
        }
    });
}

/* 
	maxLength 만 별도체크할 경우
	ex) <input type="text" id="test" name="test" maxlength="10" />
		<textarea id="test" name="test" maxlength="100" />
/*/
function cfnCheckMaxlength() {
    $(document).find("input, textarea").bind('change keyup input', function(event){
        if ($(this).attr("maxlength")) {
            var str = $(this).val();
            var maxlength = $(this).attr("maxlength");

            var strByteLen = 0;
            var strTitle = "";
            var strPiece = "";
            var check = false;

            for (i=0; i<str.length; i++) {
                var code = str.charCodeAt(i);
                var ch = str.substr(i, 1).toUpperCase();
                strPiece = str.substr(i, 1);

                code = parseInt(code);
                
                /*
                if ((ch < "0" || ch > "9") && (ch < "A" || ch > "Z") && ((code > 255) || (code < 0))) {
                    strByteLen = strByteLen + 3; // 3byte 계산
                } else {
                    strByteLen = strByteLen + 1;
                }
                */
                strByteLen = strByteLen + 1;

                if (strByteLen > maxlength) { // 제한 길이 확인
                    check = true;
                    break;
                } else {
                    strTitle = strTitle + strPiece; // 제한 길이 보다 작으면 자른 문자를 붙여준다.
                }
            }

            if (check) {
                $(this).val(strTitle);
            }
        }
    });
}

(function( $ ) {
	/* 
		빈갑 여부 확인 
		ex) $.isEmpty('') -> true
			$.isEmpty('test') -> false
    /*/
	$.isEmpty = function(obj){
        return (!obj || undefined === obj || null === obj);
    };

	/*
		빈값이 아닌지 여부 확인
		ex) $.isNotEmpty('') -> false
			$.isNotEmpty('test') -> true
	/*/
    $.isNotEmpty = function(obj){
        return (!obj || undefined === obj || null === obj)?false:true;
    };
	
	/*
		 숫자인지 확인
		ex) $.isNumeric(0) -> true
			$.isNumeric('test') -> false
	/*/
    $.isNumeric = function(obj){
        var regExp = /^[0-9]+$/g;
        return regExp.test(obj);
    };
    
    /*
		메일주소 형식인지 확인
	    ex) $.isEmail('test@test.com') -> true
			$.isEmail('test.com') -> false
	/*/
	$.isEmail = function(obj){
	    var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	    return regExp.test(obj);
	};
	
    /*
		메일 도메인주소 형식인지 확인
	    ex) $.isEmailAddr('test.com') -> true
			$.isEmailAddr('test') -> false
	/*/
    $.isEmailAddr = function(obj){
        var regExp = /^((\w|[\-\.])+)\.([A-Za-z]+)$/;
        return regExp.test(obj);
    };

    /*
		날짜인지 확인(년도4자리-월2자리-일2자리 인 경우)
		ex) $.isDate('2020-01-01') -> true
			$.isDate('20200101') -> false
	/*/
    $.isDate = function(obj){
        var regExp = /^(19|20)\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[0-1])$/;
        return regExp.test(obj);
    };
	
    /*
		모바일인지 확인
		ex) $.isMobile() -> true or false
	/*/
    $.isMobile = function() {
        return /Android|webOS|iPhone|iPad|iPod|BlackBerry/i.test(navigator.userAgent);
    };

})( jQuery );

$(document).ready(function() {
    cfnInit();
});
