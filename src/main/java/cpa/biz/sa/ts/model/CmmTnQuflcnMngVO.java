package cpa.biz.sa.ts.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmTnQuflcnMngVO.java
* 클래스 설명 : 자격증관리
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
public class CmmTnQuflcnMngVO {
	private String addpnt; /** 가점 */
	private String codeNm; /** 코드명 */
	private String deleteAt; /** 삭제여부 */
	private String expsrOrdr; /** 노출순서 */
	private String grad; /** 등급 */
	private String isuePlace; /** 발부처 */
	private String quflcnCode; /** 자격면허코드 */
	private String quflcnRealmCode; /** 자격면허분야코드 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String scoreBegin; /** 점수_시작 */
	private String scoreEnd; /** 점수_끝 */
	private String seCode; /** 구분코드 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	private String useAt; /** 사용여부 */

}
