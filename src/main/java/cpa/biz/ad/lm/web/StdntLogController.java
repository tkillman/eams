package cpa.biz.ad.lm.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.lm.model.StdntLogVO;
import cpa.biz.ad.lm.service.StdntLogService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntLogController.java
* 클래스 설명 : 교육생로그
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
public class StdntLogController {
	
	@Autowired
	StdntLogService stdntLogService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육생로그 목록화면을 호출한다.
	*
	* @param StdntLogVO - 조회할 정보가 담긴 StdntLogVO
	* @return "ad/ms/StdntLogForm"
	* @exception Exception
	*/
	public String StdntLogForm() throws Exception {		
		return "ad/ms/stdntLogForm";
	}
	
	/**
	* Author : 송광진
	* 교육생로그 목록을 조회한다.
	*
	* @param StdntLogVO - 조회할 정보가 담긴 StdntLogVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchStdntLogAjaxList(@RequestBody StdntLogVO stdntLogVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<StdntLogVO> sList = stdntLogService.searchStdntLogAjaxList(stdntLogVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
}
