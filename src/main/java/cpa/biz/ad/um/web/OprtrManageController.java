package cpa.biz.ad.um.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.um.model.OprtrManageVO;
import cpa.biz.ad.um.service.OprtrManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* OprtrManageController.java
* 클래스 설명 : 교직원 관리
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
public class OprtrManageController {
	
	@Autowired
	OprtrManageService OprtrManageService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교직원 관리 목록화면을 호출한다.
	*
	* @param OprtrManageVO - 조회할 정보가 담긴 OprtrManageVO
	* @return "ad/rm/OprtrManageForm"
	* @exception Exception
	*/
	public String OprtrManageForm() throws Exception {		
		return "ad/rm/OprtrManageForm";
	}
	
	/**
	* Author : 송광진
	* 교직원 관리 목록을 조회한다.
	*
	* @param OprtrManageVO - 조회할 정보가 담긴 OprtrManageVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchOprtrManageAjaxList(@RequestBody OprtrManageVO OprtrManageVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<OprtrManageVO> sList = OprtrManageService.searchOprtrManageAjaxList(OprtrManageVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 교직원 관리 등록화면을 호출한다.
	*
	* @param OprtrManageVO - 조회할 정보가 담긴 OprtrManageVO
	* @return "ad/rm/OprtrManageInsertForm"
	* @exception Exception
	*/
	public String OprtrManageInsertForm() throws Exception {		
		return "ad/rm/OprtrManageInsertForm";
	}
	
	/**
	* Author : 송광진
	* 교직원 관리를 등록한다.
	*
	* @param OprtrManageVO - 조회할 정보가 담긴 OprtrManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxOprtrManage(@RequestBody OprtrManageVO OprtrManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = OprtrManageService.insertAjaxOprtrManage(OprtrManageVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교직원 관리 상세/수정 화면을 조회한다.
	*
	* @param OprtrManageVO - 조회할 정보가 담긴 OprtrManageVO
	* @return "ad/rm/OprtrManageView"
	* @exception Exception
	*/
	public String searchOprtrManageView(@ModelAttribute("OprtrManageVO") OprtrManageVO OprtrManageVO, Model model) throws Exception {
		
		OprtrManageVO rOprtrManageVO = OprtrManageService.searchOprtrManageView(OprtrManageVO);
		model.addAttribute("rOprtrManageVO", rOprtrManageVO);
		
		return "ad/rm/OprtrManageView";
	}
	
	/**
	* Author : 송광진
	* 교직원 관리를 수정한다.
	*
	* @param OprtrManageVO - 조회할 정보가 담긴 OprtrManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxOprtrManage(@RequestBody OprtrManageVO OprtrManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = OprtrManageService.updateAjaxOprtrManage(OprtrManageVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 교직원 관리를 삭제한다.
	*
	* @param OprtrManageVO - 조회할 정보가 담긴 OprtrManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxOprtrManage(@RequestBody OprtrManageVO OprtrManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = OprtrManageService.deleteAjaxOprtrManage(OprtrManageVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 교직원 비밀번호를 초기화한다.
	*
	* @param OprtrManageVO - 조회할 정보가 담긴 OprtrManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxOprtrManagePwdInitl(@RequestBody OprtrManageVO OprtrManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = OprtrManageService.updateAjaxOprtrManagePwdInitl(OprtrManageVO);
		modelandview.addObject("uptPwdCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
}
