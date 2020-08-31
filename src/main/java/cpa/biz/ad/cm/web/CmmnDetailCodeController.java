package cpa.biz.ad.cm.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.cm.model.CmmnCodeManageVO;
import cpa.biz.ad.cm.model.CmmnDetailCodeVO;
import cpa.biz.ad.cm.model.CmmnDetailCodeVO;
import cpa.biz.ad.cm.service.CmmnDetailCodeService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnDetailCodeController.java
* 클래스 설명 : 공통상세코드 관리
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
public class CmmnDetailCodeController {
	
	@Autowired
	CmmnDetailCodeService CmmnDetailCodeService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 공통상세코드 관리 목록화면을 호출한다.
	*
	* @param CmmnDetailCodeVO - 조회할 정보가 담긴 CmmnDetailCodeVO
	* @return "ad/cm/CmmnDetailCodeForm"
	* @exception Exception
	*/
	public String CmmnDetailCodeForm() throws Exception {		
		return "ad/cm/CmmnDetailCodeForm";
	}
	
	/**
	* Author : 송광진
	* 공통상세코드 관리 목록을 조회한다.
	*
	* @param CmmnDetailCodeVO - 조회할 정보가 담긴 CmmnDetailCodeVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchCmmnDetailCodeAjaxList(@RequestBody CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<CmmnDetailCodeVO> sList = CmmnDetailCodeService.searchCmmnDetailCodeAjaxList(CmmnDetailCodeVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 공통상세코드 관리 등록화면을 호출한다.
	*
	* @param CmmnDetailCodeVO - 조회할 정보가 담긴 CmmnDetailCodeVO
	* @return "ad/cm/CmmnDetailCodeInsertForm"
	* @exception Exception
	*/
	public String CmmnDetailCodeInsertForm() throws Exception {		
		return "ad/cm/CmmnDetailCodeInsertForm";
	}
	
	/**
	* Author : 송광진
	* 공통상세코드 관리를 등록한다.
	*
	* @param CmmnDetailCodeVO - 조회할 정보가 담긴 CmmnDetailCodeVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxCmmnDetailCode(@RequestBody CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = CmmnDetailCodeService.insertAjaxCmmnDetailCode(CmmnDetailCodeVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 공통상세코드 상세/수정 화면을 조회한다.
	*
	* @param CmmnDetailCodeVO - 조회할 정보가 담긴 CmmnDetailCodeVO
	* @return "ad/cm/cmmnDetailCodeView"
	* @exception Exception
	*/
	public String searchCmmnDetailCodeView(@ModelAttribute("cmmnCodeManageVO") CmmnDetailCodeVO cmmnDetailCodeVO, Model model) throws Exception {
		
		CmmnDetailCodeVO rCmmnDetailCodeVO = CmmnDetailCodeService.searchCmmnDetailCodeView(cmmnDetailCodeVO);
		model.addAttribute("rCmmnDetailCodeVO", rCmmnDetailCodeVO);
		
		return "ad/cm/cmmnDetailCodeView";
	}
	
	/**
	* Author : 송광진
	* 공통상세코드 관리를 수정한다.
	*
	* @param CmmnDetailCodeVO - 조회할 정보가 담긴 CmmnDetailCodeVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxCmmnDetailCode(@RequestBody CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = CmmnDetailCodeService.updateAjaxCmmnDetailCode(CmmnDetailCodeVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 공통상세코드 관리를 삭제한다.
	*
	* @param CmmnDetailCodeVO - 조회할 정보가 담긴 CmmnDetailCodeVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxCmmnDetailCode(@RequestBody CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = CmmnDetailCodeService.deleteAjaxCmmnDetailCode(CmmnDetailCodeVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
}
