package cpa.biz.st.st.service;

import java.util.Map;

import cpa.biz.st.st.model.StdntRegistTableVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntRegistTableService.java
* 클래스 설명 : 교육생 학생등록표
* 		
* @author 박태준
* @since 2020.08.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	           수정내용
* -------        --------    --------------------------
* 2020.08.20     tjpark      최초 생성
* </pre>
*/

public interface StdntRegistTableService {

	StdntRegistTableVO searchStdntBassInfo(StdntRegistTableVO stdntRegistTableVO);
	
	Map<String, Object> searchStdntDetailInfo(StdntRegistTableVO stdntRegistTableVO);

	void saveStdntDetailInfo(StdntRegistTableVO stdntRegistTableVO);

}
