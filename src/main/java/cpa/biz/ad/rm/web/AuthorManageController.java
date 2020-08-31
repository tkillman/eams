package cpa.biz.ad.rm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.rm.model.AuthorManageVO;
import cpa.biz.ad.rm.service.AuthorManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* AuthorManageController.java
* 클래스 설명 : 권한 관리
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
public class AuthorManageController {
	
	@Autowired
	AuthorManageService AuthorManageService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 권한 관리 목록화면을 호출한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return "ad/rm/AuthorManageForm"
	* @exception Exception
	*/
	public String AuthorManageForm() throws Exception {		
		return "ad/rm/AuthorManageForm";
	}
	
	/**
	* Author : 송광진
	* 권한 관리 목록을 조회한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchAuthorManageAjaxList(@RequestBody AuthorManageVO AuthorManageVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<AuthorManageVO> sList = AuthorManageService.searchAuthorManageAjaxList(AuthorManageVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 권한 관리 등록화면을 호출한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return "ad/rm/AuthorManageInsertForm"
	* @exception Exception
	*/
	public String AuthorManageInsertForm() throws Exception {		
		return "ad/rm/AuthorManageInsertForm";
	}
	
	/**
	* Author : 송광진
	* 권한 관리를 등록한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxAuthorManage(@RequestBody AuthorManageVO AuthorManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = AuthorManageService.insertAjaxAuthorManage(AuthorManageVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 권한 관리 상세/수정 화면을 조회한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return "ad/rm/AuthorManageView"
	* @exception Exception
	*/
	public String searchAuthorManageView(@ModelAttribute("AuthorManageVO") AuthorManageVO AuthorManageVO, Model model) throws Exception {
		
		AuthorManageVO rAuthorManageVO = AuthorManageService.searchAuthorManageView(AuthorManageVO);
		model.addAttribute("rAuthorManageVO", rAuthorManageVO);
		
		return "ad/rm/AuthorManageView";
	}
	
	/**
	* Author : 송광진
	* 권한 관리를 수정한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxAuthorManage(@RequestBody AuthorManageVO AuthorManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = AuthorManageService.updateAjaxAuthorManage(AuthorManageVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 권한 관리를 삭제한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxAuthorManage(@RequestBody AuthorManageVO AuthorManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = AuthorManageService.deleteAjaxAuthorManage(AuthorManageVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
}
