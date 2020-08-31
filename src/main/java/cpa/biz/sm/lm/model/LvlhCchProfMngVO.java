package cpa.biz.sm.lm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvlhCchProfMngVO.java
* 클래스 설명 : 학생계 생활지도교수관리
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

public class LvlhCchProfMngVO {
	
	private int cno; /** 기수  */
	private String sklstfUno; /** 교수 고유번호 */
	private String sklstfUserId; /** 교수 아이디 */
	private String sklstfFnm; /** 교수성명 */
	private String clssCode; /** 계급코드 */
	private String clssCodeNm; /** 계급명 */
	private String rspofcCode; /** 직책코드 */
	private String rspofcCodeNm; /** 직책명 */
	private String dptfrtCode; /** 부서계코드 */
	private String dptfrtCodeNm; /** 부서계명 */
	private String dptkwaCode; /** 부서과코드 */
	private String dptkwaCodeNm; /** 부서과명 */
	private String brckInfoUno; /** 생활관정보 고유번호 */
	private String brckCodeNm; /** 생활관명 */
	
	private String searchDptfrtCode; /** 검색구분 */
	private String searchBrckInfoUno; /** 검색생활관고유번호 */
	private String searchFnm; /** 검색성명 */
}
