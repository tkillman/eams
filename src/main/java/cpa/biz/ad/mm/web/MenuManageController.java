package cpa.biz.ad.mm.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.mm.model.MenuManageVO;
import cpa.biz.ad.mm.model.MenuManageVO;
import cpa.biz.ad.mm.model.MenuManageVO;
import cpa.biz.ad.mm.service.MenuManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MenuManageController.java
* 클래스 설명 : 메뉴 관리
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
public class MenuManageController {
	
	@Autowired
	MenuManageService MenuManageService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 메뉴 관리 목록화면을 호출한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return "ad/cm/MenuManageForm"
	* @exception Exception
	*/
	public String MenuManageForm() throws Exception {		
		return "ad/cm/MenuManageForm";
	}
	
	/**
	* Author : 송광진
	* 메뉴 관리 목록을 조회한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchMenuManageAjaxList(@RequestBody MenuManageVO MenuManageVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<MenuManageVO> sList = MenuManageService.searchMenuManageAjaxList(MenuManageVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 메뉴 관리 등록화면을 호출한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return "ad/cm/MenuManageInsertForm"
	* @exception Exception
	*/
	public String MenuManageInsertForm() throws Exception {		
		return "ad/cm/MenuManageInsertForm";
	}
	
	/**
	* Author : 송광진
	* 메뉴 관리를 등록한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxMenuManage(@RequestBody MenuManageVO MenuManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = MenuManageService.insertAjaxMenuManage(MenuManageVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 메뉴 관리 상세/수정 화면을 조회한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return "ad/cm/MenuManageView"
	* @exception Exception
	*/
	public String searchMenuManageView(@ModelAttribute("MenuManageVO") MenuManageVO MenuManageVO, Model model) throws Exception {
		
		MenuManageVO rMenuManageVO = MenuManageService.searchMenuManageView(MenuManageVO);
		model.addAttribute("rMenuManageVO", rMenuManageVO);
		
		return "ad/cm/MenuManageView";
	}
	
	/**
	* Author : 송광진
	* 메뉴 관리를 수정한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxMenuManage(@RequestBody MenuManageVO MenuManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = MenuManageService.updateAjaxMenuManage(MenuManageVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 메뉴별 권한을 등록/수정한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxMenuAuthorManage(@RequestBody MenuManageVO MenuManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = MenuManageService.updateAjaxMenuAuthorManage(MenuManageVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 메뉴 관리를 삭제한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxMenuManage(@RequestBody MenuManageVO MenuManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = MenuManageService.deleteAjaxMenuManage(MenuManageVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
}
