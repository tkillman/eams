package cpa.biz.sm.sm.model;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* InputEvlPdMngVO.java
* 클래스 설명 : 학생계 입력기간설정
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

public class InputEvlPdMngVO {

	private String cno; /** 기수 */
	private String inputPdEstbsUno; /** 입력기간설정고유번호 */
	private String evlFormUno; /** 평가지 고유번호 */
	private String entschUno; /** 입교고유번호 */
	private String beginDe; /** 시작일 */
	private String endDe; /** 종료일 */
	private String evlSeCode; /** 평가구분코드 */
	private String evlOdrCode; /** 평가차수코드 */
	private String useAt; /** 사용여부 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	
	private String tabUnit; /** 탭 */
	private String searchCno; /** 검색기수 */

}
