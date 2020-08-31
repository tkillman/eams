package cpa.biz.ad.ms.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.ms.model.DataDeleteVO;
import cpa.biz.ad.ms.service.DataDeleteService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* DataDeleteController.java
* 클래스 설명 : 데이터삭제
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
public class DataDeleteController {
	
	@Autowired
	DataDeleteService dataDeleteService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 데이터삭제 목록화면을 호출한다.
	*
	* @param DataDeleteVO - 조회할 정보가 담긴 DataDeleteVO
	* @return "ad/ms/dataDeleteForm"
	* @exception Exception
	*/
	public String dataDeleteForm() throws Exception {		
		return "ad/ms/dataDeleteForm";
	}
	
	/**
	* Author : 송광진
	* 데이터삭제 목록을 조회한다.
	*
	* @param DataDeleteVO - 조회할 정보가 담긴 DataDeleteVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchDataDeleteAjaxList(@RequestBody DataDeleteVO dataDeleteVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<DataDeleteVO> sList = dataDeleteService.searchDataDeleteAjaxList(dataDeleteVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	/**
	* Author : 송광진
	* 데이터삭제한다.
	*
	* @param DataDeleteVO - 조회할 정보가 담긴 DataDeleteVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public ModelAndView deleteAjaxDataDelete(@RequestBody DataDeleteVO dataDeleteVO) throws Exception {
		ModelAndView modelandview = new ModelAndView();
		int saveCnt = dataDeleteService.deleteAjaxDataDelete(dataDeleteVO);
		modelandview.addObject("delCnt", saveCnt);
		
		modelandview.setViewName("ajaxView");
		return modelandview;
	}
}
