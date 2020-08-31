package cpa.biz.sa.sm.service;

import java.util.List;

import cpa.biz.sa.sm.model.StdntInfoHistVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntInfoHistService.java
* 클래스 설명 : 교육생정보변경내역
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
public interface StdntInfoHistService {
	
	public List<StdntInfoHistVO> searchStdntInfoHistList(StdntInfoHistVO stdntInfoHistVO) throws Exception;
}
