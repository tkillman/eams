package cpa.biz.st.sc.model;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LctreSchdulVO.java
* 클래스 설명 : 교육생 강의일정
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

public class LctreSchdulVO {

	private String stdntUno; /** 학생고유번호 */ 
	private String dfkCodeNm; /** 요일명 */
	private String prdCodeNm; /** 교시명 */
	private String lctrumCodeNm; /** 강의실명 */
	private String deleteAt; /** 삭제여부 */
	private String sylbsCodeNm; /** 요목 코드명  */
	private String sbjectNm; /** 과목명 */
	private String sklstFnm; /** 교수성명 */
	private String clssCodeNm; /** 계급명  */
	private String rspofcCodeNm; /** 직책명 */
	private String rtprgs; /** 진도 */
	private String searchYyMon; /** 검색년월 */
	private String searchDe; /** 검색일 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
}
