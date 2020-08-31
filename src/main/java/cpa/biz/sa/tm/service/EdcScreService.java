package cpa.biz.sa.tm.service;

import cpa.biz.sa.tm.model.EdcScreSearchVO;
import cpa.biz.sa.tm.model.EdcScreVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EdcScreService.java
* 클래스 설명 : 교육성적표
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
public interface EdcScreService {
	
	/**
	* Author : 김동규
	* 교육성적표 조회한다.
	*
	* @param EdcScreSearchVO - 조회할 정보가 담긴 EdcScreSearchVO
	* @return EdcScreVO
	* @exception Exception
	*/
	public EdcScreVO searchEdcScre(EdcScreSearchVO edcScreSearchVO);
}
