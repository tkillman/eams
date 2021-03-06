package cpa.biz.sa.sm.service;

import java.util.List;

import cpa.biz.sa.sm.model.LvskulStdntSearchVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 퇴교생검색
* 		
* @author 김동규
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   김동규	최초 생성
* </pre>
*/
public interface LvskulStdntSearchService {
	
	/**
	* Author : 김동규
	* 퇴교생검색 목록을 조회한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 lvskulStdntSearchVO
	* @param SessionVO
	* @return "/common/bbs/selectBbsManageList"
	* @exception Exception
	*/
	public List<LvskulStdntSearchVO> searchLvskulStdntSearchList(LvskulStdntSearchVO lvskulStdntSearchVO);
	
	/**
	* Author : 김동규
	* 퇴교생검색 수정한다.
	*
	* @param LvskulStdntSearchVO - 조회할 정보가 담긴 LvskulStdntSearchVO
	* @return int
	* @exception Exception
	*/
	public int updateLvskulStdntSearch(LvskulStdntSearchVO lvskulStdntSearchVO) throws Exception;
	
}
