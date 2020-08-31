package cpa.biz.sm.lm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlGnrlzMngVO.java
* 클래스 설명 : 학생계 평가조회 및 훈육평가
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

public class EvlGnrlzMngVO {
	
	private String sklstfUno; /** 교수 고유번호 */
	private String sklstfFnm; /** 교수성명 */
	private String cchProfSeCode; /** 지도교수 구분코드 */
	private String iemScore; /** 항목점수 */
	private String evlQesitmNm; /** 평가문항명 */
	private String evlQesitmTyCode; /** 평가문항타입코드 */
	private int topScore; /** 최고점 */
	private int totScore; /** 총점 */
	private int rank; /** 순위 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	private String tabUnit; /** 탭 */
	private String searchCno; /** 검색 기수 */
	private String searchSklstfUno; /** 검색 교수고유번호 */
	private String searchBrckInfoUno; /** 검색 생활관 고유번호 */
	
}
