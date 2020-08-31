package cpa.biz.sa.tm.service;

import java.util.List;

import cpa.biz.sa.tm.model.ScreDistrbSearchVO;
import cpa.biz.sa.tm.model.ScreDistrbVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScreDistrbService.java
* 클래스 설명 : 성적분포표
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
public interface ScreDistrbService {
	
	/**
	* Author : 김동규
	* 성적분포표 목록조회한다.
	*
	* @param ScreDistrbSearchVO - 조회할 정보가 담긴 ScreDistrbSearchVO
	* @return List<ScreDistrbVO>
	* @exception Exception
	*/
	public List<ScreDistrbVO> searchScreDistrbAjaxList(ScreDistrbSearchVO screDistrbSearchVO);
}
