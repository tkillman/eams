package cpa.biz.st.of.model;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntVcatnVO.java
* 클래스 설명 : 교육생 외출/외박/휴가
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

public class StdntVcatnVO {
	
	private String stdntUno; /** 학생고유번호 */
	private String vcatnHistUno; /** 외출외박휴가이력고유번호 */
	private String vcatnSeCode; /** 외출외박휴가코드 */
	private int daycnt; /** 일수 */
	private String beginDe; /** 시작일 */
	private String beginHm; /** 시작시간 */
	private String endDe; /** 종료일 */
	private String endHm; /** 종료시간 */
	private String ovrnghtBusUseAt; /** 외박버스사용여부 */
	private String rm; /** 사유 */
	private String sanctnSttusCode; /** 결재상태코드 */
	private String sanctnStepCode; /** 결재단계코드 */
	
}
