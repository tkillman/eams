package cpa.biz.sm.sm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* IntrstStdntMngVO.java
* 클래스 설명 : 학생계 관심교육생 관리
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

public class IntrstStdntMngVO {

	private int cno; /** 기수  */ 
	private String stdntUno; /** 학생고유번호 */
	private String clasUno; /** 학급 고유번호 */
	private int stdntNo; /** 교번 */
	private String crseCode; /** 과정코드 */
	private String fnm; /** 성명 */
	private String brckInfoUno; /** 생활관정보 고유번호 */
	private String brckCodeNm; /** 생활관명 */
	private String brckRoomCodeNm; /** 생활실명 */
	private String sklstfNm; /** 생활지도교수명 */
	private String intrstStdntAt; /** 관심교육생 여부 */
	private String intrstStdntResn; /** 관심교육생 사유 */
	private String intrstSttusCode; /** 상태 코드 */
	private String intrstSttusCodeNm; /** 상태 코드명 */
	private String confmFnm; /** 승인자 */
	private String lastConfmDe; /** 최종승인일 */
	
	private String searchCrseCode; /** 검색교육과정코드 */
	private String searchIntrstSttusCode; /** 검색상태값 */
	private String searchSklstfUno; /** 검색 교수고유번호 */
	private String searchStdntNo; /** 검색교번 */
	private String searchFnm; /** 검색이름 */
}
