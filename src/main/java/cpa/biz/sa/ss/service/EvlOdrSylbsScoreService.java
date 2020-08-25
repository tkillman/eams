package cpa.biz.sa.ss.service;

import java.util.List;

import cpa.biz.sa.ss.model.EvlOdrSylbsScoreSearchVO;
import cpa.biz.sa.ss.model.EvlOdrSylbsScoreVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlOdrSylbsScoreService.java
* 클래스 설명 : 평가차수별요목점수일람표
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
public interface EvlOdrSylbsScoreService {
	
	/**
	* Author : 김동규
	* 평가차수별요목점수일람표 목록조회한다.
	*
	* @param EvlOdrSylbsScoreSearchVO - 조회할 정보가 담긴 EvlOdrSylbsScoreSearchVO
	* @return List<EvlOdrSylbsScoreVO>
	* @exception Exception
	*/
	public List<EvlOdrSylbsScoreVO> searchEvlOdrSylbsScoreList(EvlOdrSylbsScoreSearchVO evlOdrSylbsScoreSearchVO) throws Exception;
}
