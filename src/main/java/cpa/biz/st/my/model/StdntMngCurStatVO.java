package cpa.biz.st.my.model;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMngCurStatVO.java
* 클래스 설명 : 교육생 내 관리현황
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

public class StdntMngCurStatVO {
	
	private String stdntUno; /** 학생고유번호 */
	
	/* 가감점 */
	private String adsbtrpntUno; /** 가감점고유번호 */
	private String adsbtrpntStdrUno; /** 가감점기준고유번호 */
	private String occrrncDt; /** 발생일시 */
	private String occrrncPlace; /** 발생장소 */
	private String adsbtrpntCn; /** 가감점내용 */
	private String levyManagt; /** 부과조치 */
	private String levyCrcmstncs; /** 부과경위 */
	private String levyDt; /** 부과일시 */
	private String resn; /** 사유 */
	private String memo; /** 메모 */
	private String cnfrmrId; /** 확인자아이디 */
	
	/* 휴가 */
	private String vcatnHistUno; /** 외출외박휴가이력고유번호 */
	private String vcatnSeCode; /** 외출외박휴가코드 */
	private int daycnt; /** 일수 */
	private String beginDe; /** 시작일 */
	private String beginHm; /** 시작시간 */
	private String endDe; /** 종료일 */
	private String endHm; /** 종료시간 */
	private String ovrnghtBusUseAt; /** 외박버스사용여부 */
	private String rm; /** 비고 */

	/* 교육미이수 */
	private String unComptUno; /** 미이수고유번호 */
	private int unComptTime; /** 미이수시간 */
	private String sylbsCode; /** 요목코드 */
	private String stdrDe; /** 기준일 */

	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
}
