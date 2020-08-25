package cpa.biz.sa.ts.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class EvlScoreUploadVO {
	
	private Integer cno; /*기수*/
	
	private String evlRealm; /*평가분야*/
	
	private String evlIemCode; /*평가항목*/
	
	private MultipartFile evlIemCodeExcelAtchmnflFile;/*평가항목 엑셀첨부파일*/
}
