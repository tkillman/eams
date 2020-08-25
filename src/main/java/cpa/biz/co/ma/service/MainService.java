package cpa.biz.co.ma.service;

import java.util.List;
import java.util.Map;

import cpa.biz.co.ma.model.MainVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MainService.java
* 클래스 설명 : 메인 Service
* 		
* @author syan
* @since 2020.8.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.8.20     syan	최초 생성
* </pre>
*/

public interface MainService {
	
	/**
	* 공지사항를 조회한다.
	* @param MainVO
	* @return
	*/	
	Map<String, Object> selectBbsList(MainVO mainVO);
}
