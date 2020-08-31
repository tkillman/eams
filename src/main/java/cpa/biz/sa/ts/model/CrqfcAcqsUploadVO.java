package cpa.biz.sa.ts.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadVO.java
* 클래스 설명 : 자격증취득내역업로드
* 		
* @author 김동규
* @since 2020.08.24
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.24                   김동규	최초 생성
* </pre>
*/
@SuppressWarnings("serial")
public class CrqfcAcqsUploadVO implements Serializable{
	
	private Integer cno; /** 기수 */
	
	private String crseCode; /** 과정코드 */
	
	private String year; /** 연도 */
	
	private String entschUno; /** 입교고유번호 */
	
	private List<CpaTeVO> excelFileJsonData; /** 엑셀jsonData*/

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCrseCode() {
		return crseCode;
	}

	public void setCrseCode(String crseCode) {
		this.crseCode = crseCode;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEntschUno() {
		return entschUno;
	}

	public void setEntschUno(String entschUno) {
		this.entschUno = entschUno;
	}

	public List<CpaTeVO> getExcelFileJsonData() {
		return excelFileJsonData;
	}

	public void setExcelFileJsonData(List<CpaTeVO> excelFileJsonData) {
		this.excelFileJsonData = excelFileJsonData;
	}

}
