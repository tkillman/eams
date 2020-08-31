package cpa.biz.sa.ts.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadVO2.java
* 클래스 설명 : 게시판관리 Business
* 		
* @author 김동규
* @since 2020.08.28
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.28                   김동규	최초 생성
* </pre>
*/
@Data
public class CrqfcAcqsUploadVO2 {
	private Integer cno; /** 기수 */
	
	private String crseCode; /** 과정코드 */
	
	private String year; /** 연도 */
	
	private String entschUno; /** 입교고유번호 */
	
	@JsonProperty("excelFileJsonData")
	private List<CpaTeVO> excelFileJsonData; /** 엑셀jsonData*/
}
