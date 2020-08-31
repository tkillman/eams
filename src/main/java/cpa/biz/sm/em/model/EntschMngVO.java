package cpa.biz.sm.em.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EntschMngVO.java
* 클래스 설명 : 학생계 입교관리
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

public class EntschMngVO {

	private int cno; /** 기수 */
	private int nmprCo; /** 인원 */
	private String year; /** 연도 */
	private String edcBeginDe; /** 교육시작일 */
	private String edcEndDe; /** 교육종료일 */
	private String crseCode; /** 과정코드 */
	private String crseCodeNm; /** 과정명 */
	private String brckInfoUno; /** 생활관정보 고유번호 */
	private String brckCodeNm; /** 생활관명 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	private String searchCno; /** 검색기수 */
	
}
