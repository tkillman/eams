package cpa.biz.sm.sm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LockProcessStdntVO.java
* 클래스 설명 : 학생계 잠김처리학생
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

public class LockProcessStdntVO {
	
	private int cno; /** 기수 */
	private int stdntNo; /** 교번 */
	private String stdntUno; /** 학생고유번호 */
	private String fnm; /** 성명 */
	private String lockSttus; /** 잠김상태 */
	private String lockDe; /** 잠김일 */
	private String processDe; /** 처리일 */
	private String searchCno; /** 검색 기수 */
	private String searchStdntNo; /** 검색 교번 */
	private String searchFnm; /** 검색 성명 */
	
}
