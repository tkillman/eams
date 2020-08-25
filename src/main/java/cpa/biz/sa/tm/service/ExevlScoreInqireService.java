package cpa.biz.sa.tm.service;

import java.util.List;

import cpa.biz.sa.tm.model.ExevlScoreInqireVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ExevlScoreInqireService.java
* 클래스 설명 : 수행점수조회
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
public interface ExevlScoreInqireService {

	/**
	* Author : 김동규
	* 수행점수조회 목록조회한다.
	*
	* @param ExevlScoreInqireVO - 조회할 정보가 담긴 ExevlScoreInqireVO
	* @return List<ExevlScoreInqireVO>
	* @exception Exception
	*/
	public List<ExevlScoreInqireVO> searchExevlScoreInqireList(ExevlScoreInqireVO exevlScoreInqireVO);
	
	/**
	* Author : 김동규
	* 수행점수조회 수정한다.
	*
	* @param ExevlScoreInqireVO - 조회할 정보가 담긴 ExevlScoreInqireVO
	* @return int
	* @exception Exception
	*/
	public int updateExevlScoreInqire(ExevlScoreInqireVO exevlScoreInqireVO);
}
