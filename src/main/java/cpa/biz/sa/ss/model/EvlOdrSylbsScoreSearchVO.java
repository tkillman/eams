package cpa.biz.sa.ss.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlOdrSylbsScoreSearchVO.java
* 클래스 설명 : 평가차수별요목점수일람표
* 		
* @author 김동규
* @since 2020.08.21
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.21                   김동규	최초 생성
* </pre>
*/
@Data
public class EvlOdrSylbsScoreSearchVO {
	
	private String searchCno; /** 검색기수 */
	
	private String searchOdr; /** 검색차수 */
}
