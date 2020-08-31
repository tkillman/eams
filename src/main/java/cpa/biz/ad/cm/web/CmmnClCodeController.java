package cpa.biz.ad.cm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.cm.model.CmmnClCodeVO;
import cpa.biz.ad.cm.service.CmmnClCodeService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnClCodeController.java
* 클래스 설명 : 분류코드 관리
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
public class CmmnClCodeController {
	
	@Autowired
	CmmnClCodeService cmmnClCodeService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 분류코드 관리 목록화면을 호출한다.
	*
	* @param CmmnClCodeVO - 조회할 정보가 담긴 CmmnClCodeVO
	* @return "ad/cm/CmmnClCodeForm"
	* @exception Exception
	*/
	public String cmmnClCodeForm() throws Exception {		
		return "ad/cm/CmmnClCodeForm";
	}
	
	/**
	* Author : 송광진
	* 분류코드 관리 목록을 조회한다.
	*
	* @param CmmnClCodeVO - 조회할 정보가 담긴 CmmnClCodeVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchCmmnClCodeAjaxList(@RequestBody CmmnClCodeVO CmmnClCodeVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<CmmnClCodeVO> sList = cmmnClCodeService.searchCmmnClCodeAjaxList(CmmnClCodeVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 분류코드 등록화면을 호출한다.
	*
	* @param CmmnClCodeVO - 조회할 정보가 담긴 CmmnClCodeVO
	* @return "ad/cm/cmmnClCodeInsertForm"
	* @exception Exception
	*/
	public String cmmnClCodeInsertForm() throws Exception {		
		return "ad/cm/cmmnClCodeInsertForm";
	}
	
	/**
	* Author : 송광진
	* 분류코드 관리를 등록한다.
	*
	* @param CmmnClCodeVO - 조회할 정보가 담긴 CmmnClCodeVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxCmmnClCode(@RequestBody CmmnClCodeVO CmmnClCodeVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = cmmnClCodeService.insertAjaxCmmnClCode(CmmnClCodeVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 분류코드 상세/수정 화면을 조회한다.
	*
	* @param CmmnClCodeVO - 조회할 정보가 담긴 CmmnClCodeVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String searchCmmnClCodeView(@ModelAttribute("cmmnClCodeVO") CmmnClCodeVO cmmnClCodeVO, Model model) throws Exception {
		
		CmmnClCodeVO rcmmnClCodeVO = cmmnClCodeService.searchCmmnClCodeView(cmmnClCodeVO);
		model.addAttribute("rcmmnClCodeVO", rcmmnClCodeVO);
		
		return "sa/sm/cmmnClCodeView";
	}
	
	/**
	* Author : 송광진
	* 분류코드 관리를 수정한다.
	*
	* @param CmmnClCodeVO - 조회할 정보가 담긴 CmmnClCodeVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxCmmnClCode(@RequestBody CmmnClCodeVO CmmnClCodeVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = cmmnClCodeService.updateAjaxCmmnClCode(CmmnClCodeVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 분류코드 관리를 삭제한다.
	*
	* @param CmmnClCodeVO - 조회할 정보가 담긴 CmmnClCodeVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxCmmnClCode(@RequestBody CmmnClCodeVO CmmnClCodeVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = cmmnClCodeService.deleteAjaxCmmnClCode(CmmnClCodeVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
}
