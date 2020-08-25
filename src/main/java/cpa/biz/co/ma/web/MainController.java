package cpa.biz.co.ma.web;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cpa.biz.co.ma.model.MainVO;
import cpa.biz.co.ma.service.MainService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MainController.java
* 클래스 설명 : 메인 Controller
* 		
* @author syan
* @since 2020.07.27
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.07.27     syan	최초 생성
* </pre>
*/

@Controller
public class MainController {
	
	@Resource(name = "MainService")
    private MainService mainService;
	
	/**
	* Author : syan
	* 게시판의 목록을 조회한다.
	*
	* @param MainVO - 조회할 정보가 담긴 MainVO
	* @return "main"
	* @exception Exception
	*/	
    @RequestMapping(value="/main")
    public Object main(@ModelAttribute("searchVO") MainVO mainVO, ModelMap model) throws Exception {
    	
    	mainVO.setPageUnit(10);
    	mainVO.setPageSize(10);
	
		PaginationInfo paginationInfo = new PaginationInfo();
		
		paginationInfo.setCurrentPageNo(mainVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(mainVO.getPageUnit());
		paginationInfo.setPageSize(mainVO.getPageSize());
	
		mainVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		mainVO.setLastIndex(paginationInfo.getLastRecordIndex());
		mainVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
    	
		Map<String, Object> map = mainService.selectBbsList(mainVO);
		int totCnt = Integer.parseInt((String)map.get("resultCnt"));
		
		paginationInfo.setTotalRecordCount(totCnt);
		
		model.addAttribute("resultList", map.get("resultList"));
		model.addAttribute("resultCnt", map.get("resultCnt"));
		model.addAttribute("paginationInfo", paginationInfo);
		
    	return "co/ma/Main";
    }
}
