package cpa.biz.sa.tm.service;

import java.util.List;

import cpa.biz.sa.tm.model.ApyexmPoliceScreVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ApyexmPoliceScreService.java
* 클래스 설명 : 응시청별성적일람표
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
public interface ApyexmPoliceScreService {
	
	/**
	* Author : 김동규
	* 응시청별성적일람표 목록조회한다.
	*
	* @param ApyexmPoliceScreVO - 조회할 정보가 담긴 ApyexmPoliceScreVO
	* @return List<ApyexmPoliceScreVO>
	* @exception Exception
	*/
	public List<ApyexmPoliceScreVO> searchApyexmPoliceScreList(ApyexmPoliceScreVO apyexmPoliceScreVO);
}
