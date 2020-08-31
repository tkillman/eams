package cpa.biz.sa.ts.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnTnEntschInfoVO.java
* 클래스 설명 : 입교정보
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
public class CmmnTnEntschInfoVO {
	private String entschUno; /** 입교고유번호 */
	private String cno; /** 기수 */
	private String cnoSeCode; /** 기수구분코드 */
	private String crseCode; /** 과정코드 */
	private String edcBeginDe; /** 교육시작일 */
	private String edcEndDe; /** 교육종료일 */
	private String nmprCo; /** 인원수 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	private String year; /** 연도 */
}
