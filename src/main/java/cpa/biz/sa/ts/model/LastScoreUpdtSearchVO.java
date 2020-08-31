package cpa.biz.sa.ts.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LastScoreUpdtSearchVO.java
* 클래스 설명 : 최종점수수정
* 		
* @author 김동규
* @since 2020.08.24
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.24                   김동규	최초 생성
* </pre>
*/
@Data
public class LastScoreUpdtSearchVO {
	
	private String searchCno; /** 검색 기수*/
	
	private String searchStdntNo; /** 검색 교번 */
}
