package cpa.biz.st.st.model;

import java.io.Serializable;

import cpa.cmm.CmmnVO;
import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntCareerVO.java
* 클래스 설명 : 교육생 경력사항 VO
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

public class StdntCareerVO extends StdntRegistTableVO {
	
	private String cmpnyNm; /** 회사명 */
	private String jssfcNm; /** 직종 */
	private String workBeginYm; /** 근무시작기간 */
	private String workEndYm; /** 근무종료기간 */
	private String workYm; /** 근무기간  */
	private String rspofcNm; /** 직책 */
	private String cmpnyAdres; /** 소재지 */
	
}
