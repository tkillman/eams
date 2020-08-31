package cpa.biz.sa.ts.web;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmodules.validation.commons.DefaultBeanValidator;

import cpa.biz.sa.ts.model.CmmnJobUtilSearchVO;
import cpa.biz.sa.ts.model.CmmnTnCnoEvlMngVO;
import cpa.biz.sa.ts.model.CmmnTnCnoSylbsInfoVO;
import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnIemInfoVO;
import cpa.biz.sa.ts.model.CmmnTnRealmInfoVO;
import cpa.biz.sa.ts.model.CmmnTnSbjectInfoVO;
import cpa.biz.sa.ts.model.EvlScoreUploadVO;
import cpa.biz.sa.ts.service.CmmnJobUtilService;
import cpa.biz.sa.ts.service.EvlScoreUploadService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlScoreUploadController.java
* 클래스 설명 : 평가항목점수업로드
* 		
* @author 김동규
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   김동규	최초 생성
* </pre>
*/
@Controller
public class EvlScoreUploadController {
	
	private static final Logger Logger = LoggerFactory.getLogger(EvlScoreUploadController.class);
	
	@Autowired
	CmmnJobUtilService cmmnJobUtilService;
	
	@Autowired
	EvlScoreUploadService evlScoreUploadService;
	
	@Autowired
	private DefaultBeanValidator beanValidator;
	
	/**
	* Author : 김동규
	* 평가항목점수업로드 조회한다.
	*
	* @param EvlScoreUploadVO - 조회할 정보가 담긴 EvlScoreUploadVO
	* @return String
	* @exception Exception
	*/
	@RequestMapping("/sa/ts/searchEvlScoreUploadForm.do")
	public String searchEvlScoreUploadForm(EvlScoreUploadVO evlScoreUploadVO, Model model) {
		
		List<CmmnTnEntschInfoVO> tnEntschInfoVOList = evlScoreUploadService.searchTnEntschInfoAjaxList(); //기수
		List<CmmnTnRealmInfoVO> tnRealmInfoVOList = evlScoreUploadService.searchTnRealmInfoAjaxList(); // 분야정보
		List<CmmnTnIemInfoVO> tnIemInfoVOList = evlScoreUploadService.searchTnIemInfoAjaxList(); // 항목정보
		List<CmmnTnSbjectInfoVO> tnSbjectInfoVOList = evlScoreUploadService.searchTnSbjectInfoAjaxList(); // 과목정보
		
		model.addAttribute("tnEntschInfoVOList", tnEntschInfoVOList); //기수
		model.addAttribute("tnRealmInfoVOList", tnRealmInfoVOList); //분야
		model.addAttribute("tnIemInfoVOList", tnIemInfoVOList); //항목
		model.addAttribute("tnSbjectInfoVOList", tnSbjectInfoVOList); //과목
		
		return "sa/ts/evlScoreUpload";
	}
	
	/**
	* Author : 김동규
	* 평가항목점수업로드 수정한다.
	*
	* @param EvlScoreUploadVO - 조회할 정보가 담긴 EvlScoreUploadVO
	* @return String
	* @exception Exception
	*/
	@RequestMapping("/sa/ts/updateEvlScoreUploadExcel.do")
	public String updateEvlScoreUploadExcel(EvlScoreUploadVO evlScoreUploadVO, BindingResult bindingResult) throws Exception {
		String returnUrl = "sa/ts/evlScoreUpload";
		Logger.debug("updateEvlScoreUploadExcel exec");
		
		//필수체크
		beanValidator.validate(evlScoreUploadVO, bindingResult);
		
		if (bindingResult.hasErrors()) {
			Logger.debug("bindingResult has error");
			return returnUrl;
		}
		
		evlScoreUploadService.validate(evlScoreUploadVO, bindingResult);
		
		if (bindingResult.hasErrors()) {
			Logger.debug("bindingResult has error");
			return returnUrl;
		}
		
		//TODO 화면에서 받아온다.
		evlScoreUploadVO.setCno(1); //기수
		evlScoreUploadVO.setCrseCode("01"); // 과정 : 신임
		evlScoreUploadVO.setYear("2020"); // 연도
		evlScoreUploadVO.setEvlSbjectCode("01"); //과목코드
		
		evlScoreUploadVO.setEvlRealm("00");// 분야
		evlScoreUploadVO.setEvlIemCode("01"); //항목
		evlScoreUploadVO.setEvlOdrCode("01"); //평가차수
		
		//입교정보
		CmmnTnEntschInfoVO cmmnTnEntschInfoVO = cmmnJobUtilService.searchTnEntschInfo(CmmnJobUtilSearchVO
																							.build()
																							.cno(evlScoreUploadVO.getCno())
																							.crseCode(evlScoreUploadVO.getCrseCode())
																							.year(evlScoreUploadVO.getYear())); //기수, 과정, 연도
		
		if (cmmnTnEntschInfoVO == null || StringUtils.isEmpty(cmmnTnEntschInfoVO.getEntschUno())) {
			bindingResult.reject("", ""); // 입교정보가 없습니다.
			return returnUrl;
		}
		
		// 기수요목정보
		CmmnTnCnoSylbsInfoVO cmmnTnCnoSylbsInfo = cmmnJobUtilService.searchTnCnoSylbsInfo(CmmnJobUtilSearchVO
													.build()
													.entschUno(cmmnTnEntschInfoVO.getEntschUno())
													.sylbsCode(evlScoreUploadVO.getEvlSbjectCode())); //입교고유번호, 요목코드
		
		if (cmmnTnCnoSylbsInfo == null || StringUtils.isEmpty(cmmnTnCnoSylbsInfo.getSylbsUno())) {
			bindingResult.reject("", ""); // 기수 요목정보가 없습니다.
			return returnUrl;
		}
		
		// 기수 평가관리
		CmmnTnCnoEvlMngVO cmmnTnCnoEvlMngVO = cmmnJobUtilService.searchTnCnoEvlMng(CmmnJobUtilSearchVO
												.build()
												.sylbsUno(cmmnTnCnoSylbsInfo.getSylbsUno())
												.realmCode(evlScoreUploadVO.getEvlRealm())
												.iemCode(evlScoreUploadVO.getEvlIemCode())); //기수요목고유번호, 분야코드, 항목코드
		
		if (cmmnTnCnoEvlMngVO == null || StringUtils.isEmpty(cmmnTnCnoEvlMngVO.getEvlUno())) { //기수, 기수평가고유번호
			bindingResult.reject("", ""); // 기수 평가관리정보가 없습니다.
			return returnUrl;
		}
		
		
		cmmnTnCnoEvlMngVO.getEvlUno(); //기수평가고유번호 
		cmmnTnCnoEvlMngVO.getSylbsUno(); //기수요목고유번호 
		
		
		return returnUrl;
	}
	
}
