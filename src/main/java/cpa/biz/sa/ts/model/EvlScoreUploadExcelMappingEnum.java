package cpa.biz.sa.ts.model;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlScoreUploadExcelMappingEnum.java
* 클래스 설명 : 평가항목정수
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
public enum EvlScoreUploadExcelMappingEnum {
	STDNT_NO(0, "교번"), FNM(1, "이름"), EVL_SCORE(2, "평가 점수");
	
	private int evlScoreUploadExcelCellIndex;
	private String evlScoreUploadExcelCellName;
	
	EvlScoreUploadExcelMappingEnum(int evlScoreUploadExcelCellIndex, String evlScoreUploadExcelCellName){
		this.evlScoreUploadExcelCellIndex = evlScoreUploadExcelCellIndex;
		this.evlScoreUploadExcelCellName = evlScoreUploadExcelCellName;
	}

	public int getEvlScoreUploadExcelCellIndex() {
		return evlScoreUploadExcelCellIndex;
	}

	public String getEvlScoreUploadExcelCellName() {
		return evlScoreUploadExcelCellName;
	}
	
}
