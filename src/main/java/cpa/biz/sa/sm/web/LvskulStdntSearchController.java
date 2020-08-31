package cpa.biz.sa.sm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.sm.model.LvskulStdntSearchVO;
import cpa.biz.sa.sm.service.LvskulStdntSearchService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchController.java
* 클래스 설명 : 퇴교생검색
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
public class LvskulStdntSearchController {
	
	@Autowired
	LvskulStdntSearchService lvskulStdntSearchService;
	
	/**
	* Author : 송광진
	* 퇴교생검색 목록 화면을 호출한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 StdntInfoManageVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public String lvskulStdntSearchForm() throws Exception {		
		return "sa/sm/lvskulStdntSearchForm";
	}
	
	/**
	* Author : 송광진
	* 퇴교생검색 목록을 조회한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 lvskulStdntSearchVO
	* @param SessionVO
	* @return "/common/bbs/selectBbsManageList"
	* @exception Exception
	*/
	public String searchLvskulStdntSearchList(LvskulStdntSearchVO lvskulStdntSearchVO) {
		lvskulStdntSearchService.searchLvskulStdntSearchList(lvskulStdntSearchVO);
		return null;
	}
	
	
	/**
	* Author : 송광진
	* 퇴교생검색 수정한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 BbsManageVO
	* @param SessionVO
	* @return "/common/bbs/selectBbsManageList"
	* @exception Exception
	*/
	public String updateLvskulStdntSearch(LvskulStdntSearchVO lvskulStdntSearchVO) throws Exception {
		lvskulStdntSearchService.updateLvskulStdntSearch(lvskulStdntSearchVO);
		return null;
	}
}
