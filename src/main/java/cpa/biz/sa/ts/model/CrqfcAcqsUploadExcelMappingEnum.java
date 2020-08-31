package cpa.biz.sa.ts.model;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadExcelMappingEnum.java
* 클래스 설명 : 자격증취득내역업로드
* 		
* @author 김동규
* @since 2020.08.25
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.25                   김동규	최초 생성
* </pre>
*/
public enum CrqfcAcqsUploadExcelMappingEnum {
	STDNT_NO(0,"교번"), FNM(1,"이름"), QUFLCN_CODE(2,"자격면허코드"), CRQFC_NO(3, "자격면허번호"), ACQS_DE(4,"취득일");
	
	private int crqfcAcqsUploadExcelCellIndex;
	private String crqfcAcqsUploadExcelCellName;
	
	CrqfcAcqsUploadExcelMappingEnum(int crqfcAcqsUploadExcelCellIndex, String crqfcAcqsUploadExcelCellName){
		this.crqfcAcqsUploadExcelCellIndex = crqfcAcqsUploadExcelCellIndex;
		this.crqfcAcqsUploadExcelCellName = crqfcAcqsUploadExcelCellName;
	}

	public int getCrqfcAcqsUploadExcelCellIndex() {
		return crqfcAcqsUploadExcelCellIndex;
	}

	public String getCrqfcAcqsUploadExcelCellName() {
		return crqfcAcqsUploadExcelCellName;
	}
}
