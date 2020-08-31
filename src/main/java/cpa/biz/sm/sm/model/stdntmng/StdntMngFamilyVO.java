package cpa.biz.sm.sm.model.stdntmng;

import cpa.biz.sm.sm.model.StdntMngVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMngFamilyVO.java
* 클래스 설명 : 학생계 학생조회 가족사항 VO
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

public class StdntMngFamilyVO extends StdntMngVO {
	
	private String familyFnm; /** 성명 */
	private String familyAge; /** 연령 */
	private String familyRelate; /** 관계 */
	private String familyAcdmcr; /** 학력 */
	private String familyOccp; /** 직업 */
	private String familyMoblphon; /** 연락처 */
	private String polcAt; /** 경찰여부 */
//	private String familyOccp; /** 계급 */
//	private String familyOccp; /** 직위 */
//	private String familyOccp; /** 근무지 */
	
}
