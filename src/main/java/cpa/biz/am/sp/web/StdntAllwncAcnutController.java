package cpa.biz.am.sp.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.am.sp.model.StdntAllwncAcnutVO;
import cpa.biz.am.sp.service.StdntAllwncAcnutService;
import cpa.biz.sa.sm.model.StdntInfoManageVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntAllwncAcnutController.java
* 클래스 설명 : 교육생 수당 계좌 현황
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
public class StdntAllwncAcnutController {
	
	@Autowired
	StdntAllwncAcnutService stdntAllwncAcnutService;
	
	/**
	* Author : 송광진
	* 교육생 수당 계좌 목록 화면을 호출한다.
	*
	* @param
	* @return "am/sp/stdntAllwncAcnutForm"
	* @exception Exception
	*/
	public String stdntAllwncAcnutForm() throws Exception {		
		return "am/sp/stdntAllwncAcnutForm";
	}
	
	/**
	* Author : 송광진
	* 교육생 수당 계좌 목록을 조회한다.
	*
	* @param StdntAllwncAcnutVO - 조회할 정보가 담긴 StdntAllwncAcnutVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchStdntAllwncAcnutAjaxList(HttpServletRequest request,   HttpServletResponse response, @RequestBody StdntAllwncAcnutVO stdntAllwncAcnutVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<StdntAllwncAcnutVO> sList = stdntAllwncAcnutService.searchStdntAllwncAcnutAjaxList(stdntAllwncAcnutVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
}
