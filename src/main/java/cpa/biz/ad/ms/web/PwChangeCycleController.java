package cpa.biz.ad.ms.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.ms.model.PwChangeCycleVO;
import cpa.biz.ad.ms.service.PwChangeCycleService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* PwChangeCycleController.java
* 클래스 설명 : 패스워드변경주기
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
public class PwChangeCycleController {
	
	@Autowired
	PwChangeCycleService pwChangeCycleService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 패스워드변경주기 목록화면을 호출한다.
	*
	* @param PwChangeCycleVO - 조회할 정보가 담긴 PwChangeCycleVO
	* @return "ad/ms/pwChangeCycleForm"
	* @exception Exception
	*/
	public String PwChangeCycleForm() throws Exception {		
		return "ad/ms/pwChangeCycleForm";
	}
	
	/**
	* Author : 송광진
	* 패스워드변경주기 목록을 조회한다.
	*
	* @param PwChangeCycleVO - 조회할 정보가 담긴 PwChangeCycleVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchPwChangeCycleAjaxList(@RequestBody PwChangeCycleVO PwChangeCycleVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<PwChangeCycleVO> sList = pwChangeCycleService.searchPwChangeCycleAjaxList();
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 패스워드변경주기를 등록한다.
	*
	* @param PwChangeCycleVO - 조회할 정보가 담긴 PwChangeCycleVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public ModelAndView insertAjaxPwChangeCycle(@RequestBody PwChangeCycleVO PwChangeCycleVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = pwChangeCycleService.insertAjaxPwChangeCycle(PwChangeCycleVO);
		modelandview.addObject("insCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 패스워드변경주기를 수정한다.
	*
	* @param PwChangeCycleVO - 조회할 정보가 담긴 PwChangeCycleVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public ModelAndView updateAjaxPwChangeCycle(@RequestBody PwChangeCycleVO PwChangeCycleVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = pwChangeCycleService.updateAjaxPwChangeCycle(PwChangeCycleVO);
		modelandview.addObject("uptCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
	
	/**
	* Author : 송광진
	* 패스워드변경주기를 삭제한다.
	*
	* @param PwChangeCycleVO - 조회할 정보가 담긴 PwChangeCycleVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public ModelAndView deleteAjaxPwChangeCycle(@RequestBody PwChangeCycleVO PwChangeCycleVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = pwChangeCycleService.deleteAjaxPwChangeCycle(PwChangeCycleVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
}
