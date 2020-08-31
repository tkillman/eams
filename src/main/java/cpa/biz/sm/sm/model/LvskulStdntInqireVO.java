package cpa.biz.sm.sm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntInqireVO.java
* 클래스 설명 : 학생계 퇴교학생조회
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

public class LvskulStdntInqireVO {

	private int cno; /** 기수  */ 
	private String stdntUno; /** 학생고유번호 */
	private int stdntNo; /** 교번 */
	private String crseCode; /** 과정코드 */
	private String crseCodeNm; /** 과정명 */
	private String fnm; /** 성명 */
	private String sexdstnCode; /** 성별코드 */
	private String entschSttusCode; /** 입교상태코드 */
	private String entschDe; /** 입교일 */
	private String lvskulDe; /** 퇴교일 */
	private String lvskulResn; /** 퇴교사유 */
	private String lvskulAt; /** 퇴교여부 */
	
	private String searchCno; /** 검색기수 */
	private String searchLvskulCode; /** 검색퇴교구분 */
	private String searchFnm; /** 검색이름 */
	private String searchLvskulDe; /** 검색퇴교일자 */
}
