package cpa.biz.st.st.model;

import java.io.Serializable;

import cpa.cmm.CmmnVO;
import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntQualfLcnsVO.java
* 클래스 설명 : 교육생 자격 및 면허 VO
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

public class StdntQualfLcnsVO extends StdntRegistTableVO {
	
	private String quflcnNm; /** 자격 및 면허명 */
	private String crqfcNo; /** 자격면허번호 */
	private String acqsDe; /** 취득일 */
	
}
