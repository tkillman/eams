package cpa.biz.sa.ts.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

public class CrqfcAcqsUploadVO {
	
	private Integer cno; /* 기수 */
	
	private MultipartFile stdntQuflcnExcelAtchmnflFile; /* 학생 자격증취득 엑셀첨부파일*/

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public MultipartFile getStdntQuflcnExcelAtchmnflFile() {
		return stdntQuflcnExcelAtchmnflFile;
	}

	public void setStdntQuflcnExcelAtchmnflFile(MultipartFile stdntQuflcnExcelAtchmnflFile) {
		this.stdntQuflcnExcelAtchmnflFile = stdntQuflcnExcelAtchmnflFile;
	}
}
