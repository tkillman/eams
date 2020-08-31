package cpa.biz.sa.sm.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.sa.sm.model.UnComplManageVO;
import cpa.biz.sa.sm.service.UnComplManageService;
import cpa.biz.sa.sm.model.UnComplManageVO;
import cpa.biz.sa.sm.service.UnComplManageService;

public class UnComplManageController {
	@Autowired
	UnComplManageService UnComplManageService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육생미이수관리 목록화면을 호출한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return "ad/rm/UnComplManageForm"
	* @exception Exception
	*/
	public String UnComplManageForm() throws Exception {		
		return "ad/rm/UnComplManageForm";
	}
	
	/**
	* Author : 송광진
	* 교육생미이수관리 목록을 조회한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchUnComplManageAjaxList(@RequestBody UnComplManageVO UnComplManageVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<UnComplManageVO> sList = UnComplManageService.searchUnComplManageAjaxList(UnComplManageVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 교육생미이수관리 등록화면을 호출한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return "ad/rm/UnComplManageInsertForm"
	* @exception Exception
	*/
	public String UnComplManageInsertForm() throws Exception {		
		return "ad/rm/UnComplManageInsertForm";
	}
	
	/**
	* Author : 송광진
	* 교육생미이수관리를 등록한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxUnComplManage(@RequestBody UnComplManageVO UnComplManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = UnComplManageService.insertAjaxUnComplManage(UnComplManageVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육생미이수관리 상세/수정 화면을 조회한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return "ad/rm/UnComplManageView"
	* @exception Exception
	*/
	public String searchUnComplManageView(@ModelAttribute("UnComplManageVO") UnComplManageVO UnComplManageVO, Model model) throws Exception {
		
		UnComplManageVO rUnComplManageVO = UnComplManageService.searchUnComplManageView(UnComplManageVO);
		model.addAttribute("rUnComplManageVO", rUnComplManageVO);
		
		return "ad/rm/UnComplManageView";
	}
	
	/**
	* Author : 송광진
	* 교육생미이수관리를 수정한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxUnComplManage(@RequestBody UnComplManageVO UnComplManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = UnComplManageService.updateAjaxUnComplManage(UnComplManageVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 교육생미이수관리를 삭제한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxUnComplManage(@RequestBody UnComplManageVO UnComplManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = UnComplManageService.deleteAjaxUnComplManage(UnComplManageVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
}
