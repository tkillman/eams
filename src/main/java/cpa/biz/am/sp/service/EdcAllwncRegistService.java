package cpa.biz.am.sp.service;

import java.util.List;

import cpa.biz.am.sp.model.EdcAllwncRegistVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 교육수당명세등록
* 		
* @author 송광진
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   송광진	최초 생성
* </pre>
*/
public interface EdcAllwncRegistService {
	
	/**
	* Author : 송광진
	* 교육수당명세를 등록한다.
	*
	* @param EdcAllwncRegistVO - 조회할 정보가 담긴 EdcAllwncRegistVO
	* @return List<EdcAllwncRegistVO>
	* @exception Exception
	*/
	public int insertAjaxEdcAllwnc(EdcAllwncRegistVO edcAllwncRegistVO) throws Exception;
	
}
