package cpa.biz.sa.ss.service;

import java.util.List;

import cpa.biz.sa.ss.model.EvlIndvdlzScoreSearchVO;
import cpa.biz.sa.ss.model.EvlIndvdlzScoreVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlIndvdlzScoreService.java
* 클래스 설명 : 평가과목(개별)점수일람표
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
public interface EvlIndvdlzScoreService {
	
	/**
	* Author : 김동규
	* 평가과목(개별)점수일람표 목록조회한다.
	*
	* @param EvlIndvdlzScoreSearchVO - 조회할 정보가 담긴 EvlIndvdlzScoreSearchVO
	* @return List<EvlIndvdlzScoreVO>
	* @exception Exception
	*/
	public List<EvlIndvdlzScoreVO> searchEvlIndvdlzScoreAjaxList(EvlIndvdlzScoreSearchVO evlIndvdlzScoreSearchVO);
	
	
}
