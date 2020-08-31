package cpa.biz.sa.sm.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.sa.sm.model.StdntInfoManageVO;
import cpa.biz.sa.sm.service.StdntInfoManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntInfoManageController.java
* 클래스 설명 : 교육생정보관리
* 		
* @author 송광진
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   송광진	최초 생성
* </pre>
*/
@Controller
public class StdntInfoManageController {
	
	@Autowired
	StdntInfoManageService stdntInfoManageService;
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육생정보관리 화면을 호출한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String stdntInfoManageForm() throws Exception {		
		return "sa/sm/stdntInfoManageForm";
	}
	
	/**
	* Author : 송광진
	* 교육생정보관리 목록 데이터를 조회한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public ModelAndView searchStdntInfoManageAjaxList(HttpServletRequest request,   HttpServletResponse response, @RequestBody StdntInfoManageVO stdntVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		List<StdntInfoManageVO> sList = stdntInfoManageService.searchStdntInfoManageAjaxList(stdntVO);
		modelandview.addObject("sList", sList);  
		modelandview.setViewName("ajaxView");
		return null;
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 학생등록/수정 화면을 호출한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String searchStdntInfoManageDetail(StdntInfoManageVO searchVo) throws Exception {
		
		stdntInfoManageService.searchStdntInfoManageDetail(searchVo);
		
		return "sa/sm/stdntInfoManageDetail";
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 엑셀 다운로드 호출한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String writeStdntInfoManageExcel(StdntInfoManageVO searchVo) {
		
		return "/cpa/biz/co/sm/web/stdntInfoHist";
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육생정보관리 등록한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String insertStdntInfoManage(StdntInfoManageVO stdntInfoManageVO) throws Exception {
		
		stdntInfoManageService.insertStdntInfoManage(stdntInfoManageVO);
		
		return "/cpa/biz/co/sm/web/stdntInfoHist";
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육생정보관리 수정한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String updateStdntInfoManage(StdntInfoManageVO stdntInfoManageVO) throws Exception {
		
		stdntInfoManageService.updateStdntInfoManage(stdntInfoManageVO);
		
		return "/cpa/biz/co/sm/web/stdntInfoHist";
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육정보업로드 엑셀 등록폼
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String searchStdntInfoManageExcelForm(StdntInfoManageVO stdntInfoManageVO) throws Exception {
		
		return "/cpa/biz/co/sm/web/stdntInfoHist";
	}
	
	//TODO requestMapping
	/**
	* Author : 송광진
	* 교육정보업로드 엑셀 등록폼
	*
	* @param StdntInfoManageVO - 등록할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String insertStdntInfoManageExcel(StdntInfoManageVO stdntInfoManageVO) throws Exception {
		
		return "/cpa/biz/co/sm/web/stdntInfoHist";
	}
}
