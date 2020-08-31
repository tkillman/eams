package cpa.biz.sa.ss.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnTnEvlScoreVO.java
* 클래스 설명 : 평가점수 TN_EVL_SCORE
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
public class CmmnTnEvlScoreVO {
	
	private Integer evlInfoUno; /** 평가정보고유번호 */
	private Integer evlQesitmUno; /** 평가문항고유번호 */
	private Integer evlScore; /** 평가점수 */
	private Integer evlUno; /** 기수평가고유번호 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private Integer sylbsUno; /** 기수요목고유번호 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
}
