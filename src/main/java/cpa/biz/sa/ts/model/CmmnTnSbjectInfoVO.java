package cpa.biz.sa.ts.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnTnSbjectInfoVO.java
* 클래스 설명 : 과목정보
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
public class CmmnTnSbjectInfoVO {
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String sbjectCode; /** 과목코드 */
	private String sbjectNm; /** 과목명 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	private String upperSbjectCode; /** 상위_과목코드 */
	private String useAt; /** 사용여부 */

}
