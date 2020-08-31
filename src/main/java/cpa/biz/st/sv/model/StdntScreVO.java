package cpa.biz.st.sv.model;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntScreVO.java
* 클래스 설명 : 교육생 성적관련
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

public class StdntScreVO {
	
	private String stdntUno; /** 학생고유번호 */
	private String brthdy; /** 생년월일 */
	private int stdntNo; /** 교번 */
	private String brckCodeNm; /** 생활관명 */
	private String brckRoomCodeNm; /** 생활실명 */
	private String apyexmPoliceCodeNm; /** 응시청명 */
	private int stand; /** 석차 */
	private int totscr; /** 총점 */
	private int allStant; /** 전체 석차 */
	private int allTotscr; /** 전체 총점 */
	private String sbjectNm; /** 과목명 */
	private int sbjectScore; /** 과목 점수 */
	private int sbjectTotScore; /** 과목 총점 */
	private String iemCodeNm; /** 항목명 */
	private int iemScore; /** 항목점수 */
	private int iemTotScore; /** 항목 총점 */
	
}
