package cpa.biz.ad.ms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.ms.model.PrsrvTrmManageVO;
import cpa.biz.ad.ms.service.PrsrvTrmManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* PrsrvTrmManageController.java
* 클래스 설명 : 보존연한관리
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
public class PrsrvTrmManageController {
	
	@Autowired
	PrsrvTrmManageService prsrvTrmManageService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 보존연한관리 등록/수정 화면을 호출한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "ad/ms/prsrvTrmManageView"
	* @exception Exception
	*/
	public String searchPrsrvTrmManageDetail(PrsrvTrmManageVO prsrvTrmManageVO, Model model) throws Exception {
		PrsrvTrmManageVO rprsrvTrmManageVO = prsrvTrmManageService.searchPrsrvTrmManageDetail(prsrvTrmManageVO);
		model.addAttribute("rprsrvTrmManageVO", rprsrvTrmManageVO);
		
		return "ad/ms/prsrvTrmManageView";
	}
	
	/**
	* Author : 송광진
	* 보존연한관리를 수정한다.
	*
	* @param EdcAllwncRegistVO - 조회할 정보가 담긴 EdcAllwncRegistVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public ModelAndView updateAjaxPrsrvTrmManage(@RequestBody PrsrvTrmManageVO prsrvTrmManageVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = prsrvTrmManageService.updateAjaxPrsrvTrmManage(prsrvTrmManageVO);
		modelandview.addObject("saveCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
}
