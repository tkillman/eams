package cpa.biz.st.my.model;

import java.io.Serializable;

import cpa.cmm.CmmnVO;
import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMyPageVO.java
* 클래스 설명 : 교육생 마이페이지
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

@Data
public class StdntMyPageVO extends CmmnVO implements Serializable {
	
	private String stdntUno; /** 학생고유번호 */
	private int stdntNo; /** 교번 */
	private String clasUno; /** 학급 고유번호 */
	private String brckInfoUno; /** 생활관정보 고유번호 */
	private String entschUno; /** 입교고유번호 */
	private String reEntschMngUno; /** 재입교관리고유번호 */
	private String fnm; /** 성명 */
	private String password; /** 비밀번호 */
	private String apyexmPoliceCode; /** 응시청코드 */
	private int grad; /** 급수 */
	private String entschSttusCode; /** 입교상태코드 */
	private String entschDe; /** 입교일 */
	private String lvskulDe; /** 퇴교일 */
	private String lvskulResn; /** 퇴교사유 */
	private String lvskulAt; /** 퇴교여부 */
	private String stdntHedAt; /** 학생장여부 */
	private int passwordErrorCot; /** 비밀번호오류횟수 */
	private String passwordChangeDe; /** 비밀번호변경일시 */
	private String tmprPasswordIssuAt; /** 임시비밀번호 발급여부 */
	private String intrstStdntAt; /** 관심교육생여부 */
	private String deleteAt; /** 삭제여부 */
	private String atchmnflUno; /** 첨부파일고유번호 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */

}
