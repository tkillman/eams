package cpa.biz.sa.ts.model;

public enum CrqfcAcqsUploadExcelEnum {

	STDNT_NO(0,"교번"), FNM(1, "이름"), QUFLCN_CODE(2,"자격면허코드"), CRQFC_NO(3,"자격면허번호"), ACQS_DE(4, "취득일자");
	
	private int crqfcAcqsUploadExcelCellNum;
	private String crqfcAcqsUploadExcelCellName;

	CrqfcAcqsUploadExcelEnum(int crqfcAcqsUploadExcelCellNum, String crqfcAcqsUploadExcelCellName){
		this.crqfcAcqsUploadExcelCellNum = crqfcAcqsUploadExcelCellNum;
		this.crqfcAcqsUploadExcelCellName = crqfcAcqsUploadExcelCellName;
	}
	
	public int getCrqfcAcqsUploadExcelCellNum() {
		return crqfcAcqsUploadExcelCellNum;
	}

	public void setCrqfcAcqsUploadExcelCellNum(int crqfcAcqsUploadExcelCellNum) {
		this.crqfcAcqsUploadExcelCellNum = crqfcAcqsUploadExcelCellNum;
	}

	public String getCrqfcAcqsUploadExcelCellName() {
		return crqfcAcqsUploadExcelCellName;
	}

	public void setCrqfcAcqsUploadExcelCellName(String crqfcAcqsUploadExcelCellName) {
		this.crqfcAcqsUploadExcelCellName = crqfcAcqsUploadExcelCellName;
	}
	
	
}
