package cpa.biz.sa.ts.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnJobUtilSearchVO.java
* 클래스 설명 : 공통업무유틸조회VO
* 		
* @author 김동규
* @since 2020.08.26
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.26                   김동규	최초 생성
* </pre>
*/
@Data
public class CmmnJobUtilSearchVO {
	
	private Integer cno; /** 기수 */
	
	private String year; /** 연도 */
	
	private String crseCode; /** 과정코드 */
	
	private String entschUno; /** 입교고유번호 */
	
	private String sylbsCode; /** 요목코드 */
	
	private String sylbsUno; /** 기수요목고유번호 */
	
	private String realmCode; /** 분야코드 */
	
	private String iemCode; /** 항목코드 */
	
	public static CmmnJobUtilSearchVO build() {
		return new CmmnJobUtilSearchVO();
	}
	
	public CmmnJobUtilSearchVO cno(Integer cno) {
		this.cno = cno;
		return this;
	}
	
	public CmmnJobUtilSearchVO year(String year) {
		this.year = year;
		return this;
	}
	
	public CmmnJobUtilSearchVO crseCode(String crseCode) {
		this.crseCode = crseCode;
		return this;
	}
	
	public CmmnJobUtilSearchVO entschUno(String entschUno) {
		this.entschUno = entschUno;
		return this;
	}
	
	public CmmnJobUtilSearchVO sylbsCode(String sylbsCode) {
		this.sylbsCode = sylbsCode;
		return this;
	}
	
	public CmmnJobUtilSearchVO sylbsUno(String sylbsUno) {
		this.sylbsUno = sylbsUno;
		return this;
	}
	
	public CmmnJobUtilSearchVO realmCode(String realmCode) {
		this.realmCode = realmCode;
		return this;
	}
	
	public CmmnJobUtilSearchVO iemCode(String iemCode) {
		this.iemCode = iemCode;
		return this;
	}
}
