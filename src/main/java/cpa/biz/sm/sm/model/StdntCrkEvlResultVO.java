package cpa.biz.sm.sm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntCrkEvlResultVO.java
* 클래스 설명 : 학생계 학생동료평가결과
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

public class StdntCrkEvlResultVO {
	
	private int cno; /** 기수 */
	private String stdntUno; /** 학생 고유번호 */
	private String stdntCrkEvlUno; /** 학생동료평가 고유번호 */
	private String clasUno; /** 학급 고유번호 */
	private String clasNm; /** 학급명 */
	private int stdntNo; /** 교번 */
	private String fnm; /** 성명 */
	private String evlOdrCode; /** 평가 차수코드 */
	private int sbjectScore; /** 과목점수 */
	private String sbjectNm; /** 과목명 */
	private int iemScore; /** 항목점수 */
	private String iemAnswer; /** 항목답변 */
	private int totScr; /** 총점 */
	private int stand; /** 석차 */
	
	private String searchClasUno; /** 검색 학급 고유번호 */
	private String searchStdntNo; /** 검색 교번 */
	private String searchFnm; /** 검색 성명 */
	
}
