package cpa.biz.sa.tm.service;

import java.util.List;

import cpa.biz.sa.tm.model.ScoreStatsSctnVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScoreStatsSctnService.java
* 클래스 설명 : 점수통계구간
* 		
* @author 김동규
* @since 2020.08.19
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.19                   김동규	최초 생성
* </pre>
*/
public interface ScoreStatsSctnService {
	
	/**
	* Author : 김동규
	* 점수통계구간 목록조회한다.
	*
	* @param ScoreStatsSctnVO - 조회할 정보가 담긴 ScoreStatsSctnVO
	* @return List<ScoreStatsSctnVO>
	* @exception Exception
	*/
	public List<ScoreStatsSctnVO> searchScoreStatsSctnList(ScoreStatsSctnVO scoreStatsSctnVO);
	
	/**
	* Author : 김동규
	* 점수통계구간 등록한다.
	*
	* @param ScoreStatsSctnVO - 조회할 정보가 담긴 ScoreStatsSctnVO
	* @return int
	* @exception Exception
	*/
	public int insertScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO);
	
	/**
	* Author : 김동규
	* 점수통계구간 수정한다.
	*
	* @param ScoreStatsSctnVO - 조회할 정보가 담긴 ScoreStatsSctnVO
	* @return int
	* @exception Exception
	*/
	public int updateScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO);
	
	/**
	* Author : 김동규
	* 점수통계구간 삭제한다.
	*
	* @param ScoreStatsSctnVO - 조회할 정보가 담긴 ScoreStatsSctnVO
	* @return int
	* @exception Exception
	*/
	public int deleteScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO);
}
