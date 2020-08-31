package cpa.biz.ad.lm.service;

import java.util.List;

import cpa.biz.ad.lm.model.SklstfLogVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 교직원로그
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
public interface SklstfLogService {
	
	/**
	* Author : 송광진
	* 교직원로그 목록을 조회한다.
	*
	* @param 
	* @return List<SklstfLogVO>
	* @exception Exception
	*/
	public List<SklstfLogVO> searchSklstfLogAjaxList(SklstfLogVO sklstfLogVO) throws Exception;
	
}
