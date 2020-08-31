package cpa.biz.sa.ts.service;

import cpa.biz.sa.ts.model.LastScoreUpdtSearchVO;
import cpa.biz.sa.ts.model.LastScoreUpdtVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LastScoreUpdtService.java
* 클래스 설명 : 최종점수수정
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
public interface LastScoreUpdtService {
	/**
	* Author : 김동규
	* 최종점수수정 조회한다.
	*
	* @param LastScoreUpdtVO - 조회할 정보가 담긴 LastScoreUpdtVO
	* @return LastScoreUpdtVO
	* @exception Exception
	*/
	public LastScoreUpdtVO searchLastScoreUpdt(LastScoreUpdtSearchVO lastScoreUpdtSearchVO);
	
	/**
	* Author : 김동규
	* 최종점수수정 수정한다.
	*
	* @param LastScoreUpdtVO - 조회할 정보가 담긴 LastScoreUpdtVO
	* @return int
	* @exception Exception
	*/
	public int updateLastScoreUpdt(LastScoreUpdtVO lastScoreUpdtVO) throws Exception;
	
	
	/**
	* Author : 김동규
	* 석차를 재산정한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 BbsManageVO
	* @return int
	* @exception Exception
	*/
	public int updateRankLastScoreUpdt(LastScoreUpdtVO lastScoreUpdtVO) throws Exception;
}
