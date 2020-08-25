package cpa.biz.sa.ts.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmTnStdntQuflcnInfoVO.java
* 클래스 설명 : 학생 자격/면허 정보
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
public class CmmTnStdntQuflcnInfoVO {
	private String acqsDe; /** 취득일 */
	private String crqfcNo; /** 자격면허번호 */
	private String quflcnCode; /** 자격면허코드 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String stdntUno; /** 학생고유번호 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
}
