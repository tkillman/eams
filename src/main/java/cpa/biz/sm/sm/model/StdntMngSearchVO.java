package cpa.biz.sm.sm.model;

import java.io.Serializable;
import java.util.List;

import cpa.biz.sm.sm.model.stdntmng.StdntMngAcdmcrVO;
import cpa.biz.sm.sm.model.stdntmng.StdntMngCareerVO;
import cpa.biz.sm.sm.model.stdntmng.StdntMngFamilyVO;
import cpa.biz.sm.sm.model.stdntmng.StdntMngFrndVO;
import cpa.biz.sm.sm.model.stdntmng.StdntMngQualfLcnsVO;
import cpa.cmm.CmmnVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMngSearchVO.java
* 클래스 설명 : 학생계 학생조회 검색조건 VO
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

public class StdntMngSearchVO {
	
	private String searchCno; /** 검색 기수 */
	private String searchCrseCode; /** 검색교육과정코드 */
	private String searchSklstfUno; /** 검색교수번호 */
	private String searchStdntNo; /** 검색교번 */
	private String searchFnm; /** 검색이름 */
	private String searchApyexmPoliceCode; /** 응시청코드 */
	private String searchAcdmcrCode; /** 학력코드 */
	private String searchLastOrgschCode; /** 학교코드 */
	private String searchMrrgCode; /** 결혼코드 */
	private String searchMltartCode; /** 무도코드 */
	private String searchDrvLcnseCode; /** 운전면허코드 */
	private String searchEntcrrCode; /** 경력코드 */
	private String searchMtrscCode; /** 병역코드 */
	private String searchDnpyCode; /** 주량코드 */
	private String searchSmkngCode; /** 흡연코드 */
	private String searchRelgnCode; /** 종교코드 */
	private String searchUnqspaCode; /** 특기코드 */
	private String searchAge; /** 나이 */
	
}
