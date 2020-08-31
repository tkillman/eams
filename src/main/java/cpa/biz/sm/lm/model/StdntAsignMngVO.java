package cpa.biz.sm.lm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntAsignMngVO.java
* 클래스 설명 : 학생계 학생배정관리
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

public class StdntAsignMngVO {
	
	private String sklstfUno; /** 교수 고유번호 */
	private String sklstfFnm; /** 교수성명 */
	private String clssCode; /** 계급코드 */
	private String clssCodeNm; /** 계급명 */
	private String brckInfoUno; /** 생활관정보 고유번호 */
	private String brckCodeNm; /** 생활관명 */
	private String clCode; /** 분류코드 */
	private String clCodeNm; /** 분류명 */
	private String crseCode; /** 과정코드 */
	private String crseNm; /** 과정명 */
	private String cnoBegin; /** 교번시작 */
	private String cnoEnd; /** 교번종료 */
	private String cnoScope; /** 교번범위 */
	private String searchSklstfUno; /** 검색 교수고유번호 */
	
}
