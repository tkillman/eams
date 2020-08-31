package cpa.biz.ad.ms.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.ms.model.PermIpEstbsVO;
import cpa.biz.ad.ms.service.PermIpEstbsService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* PermIpEstbsController.java
* 클래스 설명 : 허용 IP설정
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
public class PermIpEstbsController {
	
	@Autowired
	PermIpEstbsService permIpEstbsService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 허용 IP설정 목록화면을 호출한다.
	*
	* @param PermIpEstbsVO - 조회할 정보가 담긴 PermIpEstbsVO
	* @return "ad/ms/PermIpEstbsForm"
	* @exception Exception
	*/
	public String PermIpEstbsForm() throws Exception {		
		return "ad/ms/permIpEstbsForm";
	}
	
	/**
	* Author : 송광진
	* 허용 IP설정 목록을 조회한다.
	*
	* @param PermIpEstbsVO - 조회할 정보가 담긴 PermIpEstbsVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchPermIpEstbsAjaxList(@RequestBody PermIpEstbsVO PermIpEstbsVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<PermIpEstbsVO> sList = permIpEstbsService.searchPermIpEstbsAjaxList();
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 허용 IP설정를 등록한다.
	*
	* @param PermIpEstbsVO - 조회할 정보가 담긴 PermIpEstbsVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView insertAjaxPermIpEstbs(@RequestBody PermIpEstbsVO PermIpEstbsVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = permIpEstbsService.insertAjaxPermIpEstbs(PermIpEstbsVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 허용 IP설정를 삭제한다.
	*
	* @param PermIpEstbsVO - 조회할 정보가 담긴 PermIpEstbsVO
	* @return modelandview
	* @exception Exception
	*/
	public ModelAndView deleteAjaxPermIpEstbs(@RequestBody PermIpEstbsVO PermIpEstbsVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = permIpEstbsService.deleteAjaxPermIpEstbs(PermIpEstbsVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
}
