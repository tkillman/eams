package cpa.biz.st.my.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cpa.cmm.CmmnVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* AllwncCnfirmVO.java
* 클래스 설명 : 교육생 수당관리
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

public class AllwncCnfirmVO extends CmmnVO implements Serializable {
	
	private String acnutManageUno; /** 계좌관리 고유번호 */
	private String stdntUno; /** 학생고유번호 */
	private String fnm; /** 성명 */
	private String bankCode; /** 은행코드 */
	private String bankCodeNm; /** 은행코드명 */
	private String acnutno; /** 계좌번호 */
	private String amount; /** 금액 */
	private String allwncNm; /** 수당내역 */
	private String allwncAmount; /** 수당금액 */
	private String allwncPymntDe; /** 수당지급일 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */

}
