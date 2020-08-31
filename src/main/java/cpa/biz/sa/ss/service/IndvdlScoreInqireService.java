package cpa.biz.sa.ss.service;

import cpa.biz.sa.ss.model.IndvdlScoreInqireSearchVO;
import cpa.biz.sa.ss.model.IndvdlScoreInqireVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* IndvdlScoreInqireService.java
* 클래스 설명 : 개인별점수조회
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
public interface IndvdlScoreInqireService {
	
	/**
	* Author : 김동규
	* 개인별점수조회 조회한다.
	*
	* @param IndvdlScoreInqireSearchVO - 조회할 정보가 담긴 IndvdlScoreInqireSearchVO
	* @return IndvdlScoreInqireVO
	* @exception Exception
	*/
	public IndvdlScoreInqireVO searchIndvdlScoreInqireDetail(IndvdlScoreInqireSearchVO IndvdlScoreInqireSearchVO);
}
