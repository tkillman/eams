package cpa.biz.ad.cm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.cm.model.CmmnClCodeVO;
import cpa.biz.ad.cm.model.CmmnCodeManageVO;
import cpa.biz.ad.cm.model.CmmnCodeManageVO;
import cpa.biz.ad.cm.service.CmmnCodeManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnCodeManageController.java
* 클래스 설명 : 공통코드관리
* 		
* @author 송광진
* @since 2020.08.26
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.26                   송광진	최초 생성
* </pre>
*/
@Controller
public class CmmnCodeManageController {
	
	@Autowired
	CmmnCodeManageService cmmnCodeManageService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 공통코드관리 목록화면을 호출한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return "ad/cm/CmmnCodeManageForm"
	* @exception Exception
	*/
	public String CmmnCodeManageForm() throws Exception {		
		return "ad/cm/CmmnCodeManageForm";
	}
	
	/**
	* Author : 송광진
	* 공통코드관리 목록을 조회한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchCmmnCodeManageAjaxList(@RequestBody CmmnCodeManageVO cmmnCodeManageVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<CmmnCodeManageVO> sList = cmmnCodeManageService.searchCmmnCodeManageAjaxList(cmmnCodeManageVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 공통코드관리 등록화면을 호출한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return "ad/cm/CmmnCodeManageInsertForm"
	* @exception Exception
	*/
	public String CmmnCodeManageInsertForm() throws Exception {		
		return "ad/cm/CmmnCodeManageInsertForm";
	}
	
	/**
	* Author : 송광진
	* 공통코드관리를 등록한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxCmmnCodeManage(@RequestBody CmmnCodeManageVO cmmnCodeManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = cmmnCodeManageService.insertAjaxCmmnCodeManage(cmmnCodeManageVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 공통코드관리 상세/수정 화면을 조회한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return "ad/cm/cmmnCodeManageView"
	* @exception Exception
	*/
	public String searchCmmnCodeManageView(@ModelAttribute("cmmnCodeManageVO") CmmnCodeManageVO cmmnCodeManageVO, Model model) throws Exception {
		
		CmmnCodeManageVO rCmmnCodeManageVO = cmmnCodeManageService.searchCmmnCodeManageView(cmmnCodeManageVO);
		model.addAttribute("rCmmnCodeManageVO", rCmmnCodeManageVO);
		
		return "ad/cm/cmmnCodeManageView";
	}
	
	/**
	* Author : 송광진
	* 공통코드관리를 수정한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxCmmnCodeManage(@RequestBody CmmnCodeManageVO cmmnCodeManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = cmmnCodeManageService.updateAjaxCmmnCodeManage(cmmnCodeManageVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 공통코드관리를 삭제한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxCmmnCodeManage(@RequestBody CmmnCodeManageVO cmmnCodeManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = cmmnCodeManageService.deleteAjaxCmmnCodeManage(cmmnCodeManageVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
}
