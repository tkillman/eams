package cpa.biz.sa.ts.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnTnCnoEvlMngVO.java
* 클래스 설명 : 기수평가관리
* 		
* @author 김동규
* @since 2020.08.26
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.26                   김동규	최초 생성
* </pre>
*/
@Data
public class CmmnTnCnoEvlMngVO {
	private String allot; /** 배점 */
	private String evlUno; /** 기수 평가 고유번호 */
	private String iemCode; /** 항목코드 */
	private String ordr; /** 순서 */
	private String qesitmCo; /** 문항수 */
	private String realmCode; /** 분야코드 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String sylbsUno; /** 기수 요목 고유번호 */
	private String tiePrioryCode; /** 동점자 우선순위 코드 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
}
