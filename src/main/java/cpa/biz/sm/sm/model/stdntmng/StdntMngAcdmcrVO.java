package cpa.biz.sm.sm.model.stdntmng;

import cpa.biz.sm.sm.model.StdntMngVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMngAcdmcrVO.java
* 클래스 설명 : 학생계 학생조회 학력사항 VO
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

public class StdntMngAcdmcrVO extends StdntMngVO {
	
	private String hbrdSe; /** 국내외 구분 */
	private String schulSe; /** 학교구분 */
	private String schulNm; /** 학교명 */
	private String schulAdres; /** 소재지 */
	private String subjctNm; /** 학과명 */
	private String polsbjRelateAt; /** 경찰학과 관련여부 */
	private String actCn; /** 활동내용 */
	private String etcInfoCn; /** 기타정보내용 */
	
}
