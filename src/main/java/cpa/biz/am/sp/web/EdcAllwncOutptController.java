package cpa.biz.am.sp.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.am.sp.model.EdcAllwncOutptVO;
import cpa.biz.am.sp.service.EdcAllwncOutptService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EdcAllwncOutptController.java
* 클래스 설명 : 교육수당확인서 출력현황
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
public class EdcAllwncOutptController {
	
	@Autowired
	EdcAllwncOutptService edcAllwncOutptService;
	
	/**
	* Author : 송광진
	* 교육수당확인서 출력현황 화면을 호출한다.
	*
	* @param
	* @return "am/sp/EdcAllwncOutptForm"
	* @exception Exception
	*/
	public String EdcAllwncOutptForm() throws Exception {		
		return "am/sp/EdcAllwncOutptForm";
	}
	
	/**
	* Author : 송광진
	* 교육수당확인서 출력현황 목록을 조회한다.
	*
	* @param EdcAllwncOutptVO - 조회할 정보가 담긴 EdcAllwncOutptVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchEdcAllwncOutptAjaxList(HttpServletRequest request,   HttpServletResponse response, @RequestBody EdcAllwncOutptVO EdcAllwncOutptVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<EdcAllwncOutptVO> sList = edcAllwncOutptService.searchEdcAllwncOutptAjaxList(EdcAllwncOutptVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
}
