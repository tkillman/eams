package cpa.biz.ad.bi.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.bi.model.EntschInfoVO;
import cpa.biz.ad.bi.model.EntschInfoVO;
import cpa.biz.ad.bi.model.EntschInfoVO;
import cpa.biz.ad.bi.service.EntschInfoService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EntschInfoController.java
* 클래스 설명 : 입교정보
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
public class EntschInfoController {
	
	@Autowired
	EntschInfoService EntschInfoService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 입교정보 목록화면을 호출한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return "ad/cm/EntschInfoForm"
	* @exception Exception
	*/
	public String EntschInfoForm() throws Exception {		
		return "ad/cm/EntschInfoForm";
	}
	
	/**
	* Author : 송광진
	* 입교정보 목록을 조회한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchEntschInfoAjaxList(@RequestBody EntschInfoVO EntschInfoVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<EntschInfoVO> sList = EntschInfoService.searchEntschInfoAjaxList(EntschInfoVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 입교정보 등록화면을 호출한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return "ad/cm/EntschInfoInsertForm"
	* @exception Exception
	*/
	public String EntschInfoInsertForm() throws Exception {		
		return "ad/cm/EntschInfoInsertForm";
	}
	
	/**
	* Author : 송광진
	* 입교정보를 등록한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxEntschInfo(@RequestBody EntschInfoVO EntschInfoVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = EntschInfoService.insertAjaxEntschInfo(EntschInfoVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 입교정보 상세/수정 화면을 조회한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return "ad/cm/EntschInfoView"
	* @exception Exception
	*/
	public String searchEntschInfoView(@ModelAttribute("EntschInfoVO") EntschInfoVO EntschInfoVO, Model model) throws Exception {
		
		EntschInfoVO rEntschInfoVO = EntschInfoService.searchEntschInfoView(EntschInfoVO);
		model.addAttribute("rEntschInfoVO", rEntschInfoVO);
		
		return "ad/cm/EntschInfoView";
	}
	
	/**
	* Author : 송광진
	* 입교정보를 수정한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView updateAjaxEntschInfo(@RequestBody EntschInfoVO EntschInfoVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = EntschInfoService.updateAjaxEntschInfo(EntschInfoVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 입교정보를 삭제한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxEntschInfo(@RequestBody EntschInfoVO EntschInfoVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = EntschInfoService.deleteAjaxEntschInfo(EntschInfoVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
}
