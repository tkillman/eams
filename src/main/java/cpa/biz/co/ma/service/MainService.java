package cpa.biz.co.ma.service;

import java.util.Map;

import cpa.biz.co.ma.model.MainVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MainService.java
* 클래스 설명 : 메인 Service
* 		
* @author 안선영
* @since 2020.8.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.8.20     안선영	최초 생성
* </pre>
*/

public interface MainService {
	
	Map<String, Object> selectBbsList(MainVO mainVO);
	
	MainVO loginProc(MainVO mainVO);
	
	MainVO searchPassword(MainVO mainVO);
}
