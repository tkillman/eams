package cpa.biz.am.sp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.am.sp.model.EdcAllwncRegistVO;
import cpa.biz.am.sp.service.EdcAllwncRegistService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EdcAllwncRegistController.java
* 클래스 설명 : 교육수당명세등록
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
public class EdcAllwncRegistController {
	
	@Autowired
	EdcAllwncRegistService edcAllwncRegistService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육수당명세 등록화면을 호출한다.
	*
	* @param EdcAllwncRegistVO - 조회할 정보가 담긴 EdcAllwncRegistVO
	* @return "am/sp/edcAllwncInsert"
	* @exception Exception
	*/
	public String edcAllwncRegistForm() throws Exception {		
		return "sa/sm/edcAllwncInsert";
	}
	
	/**
	* Author : 송광진
	* 교육수당명세 등록한다.
	*
	* @param EdcAllwncRegistVO - 조회할 정보가 담긴 EdcAllwncRegistVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public ModelAndView insertAjaxEdcAllwnc(@RequestBody EdcAllwncRegistVO edcAllwncRegistVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = edcAllwncRegistService.insertAjaxEdcAllwnc(edcAllwncRegistVO);
		modelandview.addObject("saveCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
}
