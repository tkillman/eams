package cpa.biz.sa.tm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SchulRgistrPrntngSearchVO.java
* 클래스 설명 : 학적부인쇄
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
public class SchulRgistrPrntngSearchVO {
	
	private String searchCno; /** 검색기수 */
	
	private String searchStdntNoMin; /** 검색교번최저 */
	
	private String searchStdntNoMax; /** 검색교번최고 */
}
