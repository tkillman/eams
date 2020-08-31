package cpa.biz.st.at.model;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntEvlVO.java
* 클래스 설명 : 교육생 평가
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

public class StdntEvlVO {

	private String stdntUno; /** 학생고유번호 */
	private String sklstfFnm; /** 생활지도교수명 */
	private String clssCodeNm; /** 계급명 */
	private String evlQesitmTyCode; /** 평가문항타입코드 */
	private String evlQesitmNm; /** 평가항목명 */
	private String evlOdrCode; /** 평가차수코드 */
	private String evlOdrCodeNm; /** 평가차수명 */
	private String iemNm; /** 항목명 */
	private String iemScore; /** 항목점수 */
	private String iemAnswer; /** 항목답변 */
	private String evlBeginDe; /** 평가시작일 */
	private String evlEndDe; /** 평가종료일 */
	private String tabUnit; /** 탭 */
}
