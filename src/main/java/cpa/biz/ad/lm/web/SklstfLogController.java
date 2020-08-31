package cpa.biz.ad.lm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.lm.model.SklstfLogVO;
import cpa.biz.ad.lm.service.SklstfLogService;
import cpa.biz.ad.lm.service.StdntLogService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SklstfLogController.java
* 클래스 설명 : 교직원로그
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
public class SklstfLogController {
	
	@Autowired
	SklstfLogService SklstfLogService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교직원로그 목록화면을 호출한다.
	*
	* @param SklstfLogVO - 조회할 정보가 담긴 SklstfLogVO
	* @return "ad/ms/SklstfLogForm"
	* @exception Exception
	*/
	public String SklstfLogForm() throws Exception {		
		return "ad/ms/SklstfLogForm";
	}
	
	/**
	* Author : 송광진
	* 교직원로그 목록을 조회한다.
	*
	* @param SklstfLogVO - 조회할 정보가 담긴 SklstfLogVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchSklstfLogAjaxList(@RequestBody SklstfLogVO sklstfLogVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<SklstfLogVO> sList = SklstfLogService.searchSklstfLogAjaxList(sklstfLogVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
}
