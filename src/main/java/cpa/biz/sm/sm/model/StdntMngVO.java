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
* StdntMngVO.java
* 클래스 설명 : 학생계 학생조회
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

public class StdntMngVO extends CmmnVO implements Serializable {

	private int cno; /** 기수  */ 
	private String stdntUno; /** 학생고유번호 */
	private int stdntNo; /** 교번 */
	private String clasUno; /** 학급 고유번호 */
	private String clasNm; /** 학급명 */
	private String brckInfoUno; /** 생활관정보 고유번호 */
	private String sklstfFnm; /** 생활지도교수명 */
	private String brckCodeNm; /** 생활관명 */
	private String brckRoomCodeNm; /** 생활실명 */
	private String entschUno; /** 입교고유번호 */
	private String reEntschMngUno; /** 재입교관리고유번호 */
	private String crseCode; /** 과정코드 */
	private String crseNm; /** 과정명 */
	private String ihidnum; /** 주민등록번호 */
	private String fnm; /** 성명 */
	private String password; /** 비밀번호 */
	private String apyexmPoliceCode; /** 응시청코드 */
	private String apyexmPoliceCodeNm; /** 응시청명 */
	private String chcrtFnm; /** 한자성명 */
	private String engFnm; /** 영문성명 */
	private String zip; /** 우편번호 */
	private String adres; /** 주소지 */
	private String brthdy; /** 생년월일 */
	private String sexdstnCode; /** 성별코드 */
	private String ownhomCttpc; /** 자택 연락처 */
	private String moblphon; /** 휴대폰번호 */
	private String inschCttpc; /** 재교 중 연락처 */
	private String height; /** 신장 */
	private String bdwgh; /** 체중 */
	private String leftCrrcVspr; /** 좌측교정시력 */
	private String rghtCrrcVspr; /** 우측교정시력 */
	private String glssWearAt; /** 안경착용여부 */
	private String bdpCode; /** 혈액형코드 */
	private String bdpCodeNm; /** 혈액형코드명 */
	private String charctTy; /** 성격유형 */
	private String spcablCode; /** 특기코드 */
	private String spcablCodeNm; /** 특기명 */
	private String hobbyCode; /** 취미코드 */
	private String hobbyCodeNm; /** 취미명 */
	private String smkngCode; /** 흡연코드 */
	private String dnpyCode; /** 주량코드 */
	private String dnpyCodeNm; /** 주량코드명 */
	private String relgnCode; /** 종교코드 */
	private String relgnCodeNm; /** 종교명 */
	private String polcApplySync; /** 경찰지원동기 */
	private String mrrgAt; /** 결혼여부 */
	private String mltartCode; /** 무도코드 */
	private String mltartCodeNm; /** 무도명 */
	private int grad; /** 급수 */
	private String unqspaCode; /** 이색특기코드 */
	private String unqspaCodeNm; /** 이색특기명 */
	private String unqspaEtcNm; /** 이색특기 기타명 */
	private String mtrscCode; /** 병역코드 */
	private String mtrscCodeNm; /** 병역명 */
	private String curimptNm; /** 병과명 */
	private String clssCode; /** 계급코드 */
	private String ofcrOrginCode; /** 장교출신코드 */
	private String ofcrOrginCodeNm; /** 장교출신명 */
	private String ssn; /** 군번 */
	private String srvicBeginDe; /** 복무시작일 */
	private String srvicEndDe; /** 복무종료일 */
	private String rm; /** 비고 */
	private String armySrvicPlace; /** 군복무지 */
	private String entschSttusCode; /** 입교상태코드 */
	private String stdntHedAt; /** 학생장여부 */
	private String deleteAt; /** 삭제여부 */
	private String atchmnflUno; /** 첨부파일 고유번호 */
	private String itrvwUno; /** 면담고유번호 */
	private String itrvwDe; /** 면담일 */
	private String itrvwCn; /** 면담내용 */
	private String sanctnSttusCode; /** 결재상태코드 */
	private String sanctnSttusCodeNm; /** 결재상태명 */
	private String evlBeginDe; /** 평가시작일 */
	private String evlEndDe; /** 평가종료일 */
	private String tabUnit; /** 탭 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	private String entschDe; /** 입교일 */
	private String lvskulDe; /** 퇴교일 */
	private String lvskulResn; /** 퇴교사유 */
	private String lvskulAt; /** 퇴교여부 */
	
	private List<StdntMngFrndVO> stdntFrndList;
	private List<StdntMngAcdmcrVO> stdntAcdmcrList;
	private List<StdntMngCareerVO> stdntCareerList;
	private List<StdntMngFamilyVO> stdntFamilyList;
	private List<StdntMngQualfLcnsVO> stdntQualfLcnsList;
	
}
