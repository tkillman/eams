package cpa.biz.sa.ts.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class EvlScoreUploadVO {
	
	private Integer cno; /** 기수 */
	
	private String crseCode; /** 과정코드 */
	
	private String year; /** 연도 */
	
	private String evlRealm; /** 평가분야 */
	
	private String evlIemCode; /** 평가항목 */
	
	private String evlSbjectCode; /** 평가과목코드 */
	
	private String evlOdrCode; /** 평가차수코드*/
	
	private MultipartFile evlScoreExcelAtchmnflFile; /** 평가점수엑셀첨부파일*/
}
