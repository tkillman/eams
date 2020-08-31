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
				console.log($("#tabUnit").val());
			});
			
			function fnChngTab(gubun) {
				$("#tabUnit").val(gubun);
				
			    var url = "<c:url value='/st/st/stdntRegistTableViewAjax.do'/>";
			    var type = "POST";
				var param = {
					'stdntUno': '1',
					'tabUnit': $("#tabUnit").val() 
				};

			    cfnCallAjax(url, type, true, param, fnChngTabCallBack);
			}
			
			function fnChngTabCallBack(response) {
				var i = 0;
				var html = "";
				var html2 = "";
				
				if(response != null) {
					var vo = response.tabDataVO;
					var list = response.tabDataList;
					
					console.log(vo);
					console.log(list);
					console.log($("#tabUnit").val());
					
					switch($("#tabUnit").val()){
					case "1":
						var html = "";
						
						html += "기수 : " + vo.cno + "<br/>";
						html += "학급명 : " + vo.clasNm + "<br/>";
						html += "교번 : " + vo.stdntNo + "<br/>";
						html += "응시청 : " + vo.apyexmPoliceCodeNm + "<br/>";
						html += "과정명 : " + vo.crseNm + "<br/>";
						html += "생활관 : " + vo.brckCodeNm + "<br/>";
						html += "생활실 : " + vo.brckRoomCodeNm + "<br/>";
						html += "생활지도교수 : " + vo.sklstfFnm + "<br/>";
						html += "이름(한자) : " + vo.chcrtFnm + "<br/>";
						html += "이름(영어) : " + vo.engFnm + "<br/>";
						html += "생년월일 : " + vo.brthdy + "<br/>";
						html += "성별 : " + vo.sexdstnCodeNm + "<br/>";
						html += "자택전화 : " + vo.ownhomCttpc + "<br/>";
						html += "연락처 : " + vo.inschCttpc + "<br/>";
						html += "이메일 : " + vo.zip + "<br/>";
						html += "주소지 : " + vo.zip + " / " + vo.adres + "<br/>";
						break;
					case "2":
						
						html += "신장 : " + vo.height + "<br/>";
						html += "체중 : " + vo.bdwgh + "<br/>";
						html += "좌시력 : " + vo.leftCrrcVspr + "<br/>";
						html += "우시력 : " + vo.rghtCrrcVspr + "<br/>";
						html += "안경착용 : " + vo.glssWearAt + "<br/>";
						html += "혈액형 : " + vo.bdpCodeNm + "<br/>";
						html += "특기 : " + vo.spcablCodeNm + "<br/>";
						html += "취미 : " + vo.hobbyCodeNm + "<br/>";
						html += "종교 : " + vo.relgnCodeNm + "<br/>";
						html += "흡연 : " + vo.smkngCodeNm + "<br/>";
						html += "주량 : " + vo.dnpyCodeNm + "<br/>";
						html += "성격 : " + vo.charctTy + "<br/>";
						html += "경찰지원 : " + vo.polcApplySync + "<br/><br/>";
						
						for(i = 0; i < list.length; i++) {
							html2 += "이름 : " + list[i].frndFnm + "<br/>";
							html2 += "연령 : " + list[i].frndAge + "<br/>";
							html2 += "관계 : " + list[i].frndRelateCodeNm + "<br/>";
							html2 += "직업 : " + list[i].frndOccp + "<br/>";
							html2 += "주소 : " + list[i].frndAdres + "<br/><br/>";
						}
						break;
					case "3":
						html += "결혼여부 : ${stdntInfo.mrrgAt}<br/><br/>"; 
						
						for(i = 0; i < list.length; i++) {
							html2 += "관계 : " + list[i].familyRelateCodeNm + "<br/>";
							html2 += "성명 : " + list[i].fnm + "<br/>";
							html2 += "연령 : " + list[i].age + "<br/>";
							html2 += "학력 : " + list[i].acdmcrCodeNm + "<br/>";
							html2 += "직업 : " + list[i].occpCodeNm + "<br/>";
							html2 += "계급 : " + list[i].clssCodeNm + "<br/>";
							html2 += "직위 : " + list[i].rspofcCodeNm + "<br/>";
							html2 += "근무지 : " + list[i].workPlace + "<br/>";
							html2 += "연락처 : " + list[i].cttpc + "<br/><br/>";
						}
						break;
					case "4":
						for(i = 0; i < list.length; i++) {
							html2 += "구분 : " + list[i].hbrdSeCodeNm + "<br/>";
							html2 += "학교구분 : " + list[i].schulSeCodeNm + "<br/>";
							html2 += "학교명 : " + list[i].schulNm + "<br/>";
							html2 += "졸업년도: " + list[i].grdtnYear + "<br/>";
							html2 += "소재지 : " + list[i].adres + "<br/>";
							html2 += "전공 : " + list[i].subjctNm + "<br/>";
							html2 += "학생회간부경력 : " + list[i].stdntleaderCareer + "<br/>";
							html2 += "비고 : " + list[i].etcInfoCn + "<br/><br/>";
						}
						break;
					case "5":
						break;
					case "6":
						for(i = 0; i < list.length; i++) {
							html2 += "직종 : " + list[i].jssfcCodeNm + "<br/>";
							html2 += "회사명 : " + list[i].cmpnyNm + "<br/>";
							html2 += "근무기간 : " + list[i].workBeginYm + " ~ " + list[i].workEndYm + "<br/>";
							html2 += "직책: " + list[i].rspofcNm + "<br/>";
							html2 += "소재지 : " + list[i].adres + "<br/><br/>";
						}
						break;
					default:
						html += "병역유무 : " + vo.mtrscAt + "<br/>";
						html += "군별 : " + vo.bdwgh + "<br/>";
						html += "병과 : " + vo.curimptNm + "<br/>";
						html += "계급 : " + vo.clssCodeNm + " / " + vo.ofcrOrginCodeNm +"<br/>";
						html += "군번 : " + vo.ssn + "<br/>";
						html += "근무기간 : " + vo.srvicBeginDe + " ~ " + vo.srvicEndDe + "<br/>";
						html += "근복무지 : " + vo.armySrvicPlace + "<br/>";
						html += "비고 : " + vo.rm + "<br/>";
						break;
					}
				} else {
					html = "정보 없다";
				}
				
				$("#testDiv").html(html);
				$("#testDiv2").html(html2);
			}
			
			function fnUpdateInfo() {
				$('#testForm').attr('action', '<c:url value="/st/st/stdntRegistTableUpdateForm.do"/>');
            	$('#testForm').submit();
			}
		</script>
	</head>
	<body>
		<button role="tab" id="tab01" onclick="fnChngTab('1');return false;" aria-selected="true">기본정보</button>
		<button role="tab" id="tab02" onclick="fnChngTab('2');return false;" tabindex="-1" aria-selected="false">개인신상</button>
		<button role="tab" id="tab03" onclick="fnChngTab('3');return false;" tabindex="-1" aria-selected="false">가족사항</button>
		<button role="tab" id="tab04" onclick="fnChngTab('4');return false;" tabindex="-1" aria-selected="false">학력사항</button>
		<button role="tab" id="tab05" onclick="fnChngTab('5');return false;" tabindex="-1" aria-selected="false">자격및면허</button>
		<button role="tab" id="tab06" onclick="fnChngTab('6');return false;" tabindex="-1" aria-selected="false">경력사항</button>
		<button role="tab" id="tab07" onclick="fnChngTab('7');return false;" tabindex="-1" aria-selected="false">병역사항</button>
		
		<form:form commandName="stdntRegistTableVO" id="testForm" name="testForm" method="post">
			<form:hidden path="tabUnit" />
		
			이름 : ${stdntInfo.fnm}<br/>
			생년월일 : ${stdntInfo.brthdy}<br/>
			휴대폰 : ${stdntInfo.moblphon}<br/>
			입교상태 : ${stdntInfo.entschSttusCodeNm}<br/><br/><br/><br/>
			<div id="testDiv">
				기수 : ${tabDataVO.cno}<br/> 
				학급명 : ${tabDataVO.clasNm}<br/>
				교번 : ${tabDataVO.stdntNo}<br/>
				응시청 : ${tabDataVO.apyexmPoliceCodeNm}<br/>
				과정명 : ${tabDataVO.crseNm}<br/>
				생활관 : ${tabDataVO.brckCodeNm}<br/>
				생활실 : ${tabDataVO.brckRoomCodeNm}<br/>
				생활지도교수: ${tabDataVO.sklstfFnm}<br/>
				이름(한자) : ${tabDataVO.chcrtFnm}<br/>
				이름(영어) : ${tabDataVO.engFnm}<br/>
				생년월일 : ${tabDataVO.brthdy}<br/>
				성별 : ${tabDataVO.sexdstnCodeNm}<br/>
				자택전화 : ${tabDataVO.ownhomCttpc}<br/>
				연락처 : ${tabDataVO.inschCttpc}<br/>
				이메일 : ${tabDataVO.mail}<br/>
				주소지 : ${tabDataVO.zip} / ${tabDataVO.adres}<br/>
			</div>
			<div id="testDiv2">
			</div>
			
			<button type="button" onclick="fnUpdateInfo();">수정</button>
		</form:form>
	</body>
</html>