package cpa.biz.sa.ss.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnTnSdntObjctSubjectCnsrScore.java
* 클래스 설명 : 학생객관식과목정답점수
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
public class CmmnTnSdntObjctSubjectCnsrScoreVO {
	
	private Integer sylbsUno; /** 기수 요목 고유번호 */
	
	private Integer evlUno; /** 기수 평가 고유번호 */
	
	private String evlOdrCode; /** 평가차수코드 */
	
	private Integer stdntUno; /** 학생고유번호 */
	
	private Integer sbjectCnsrSumtScore; /** 과목정답합계점수*/
	
}
