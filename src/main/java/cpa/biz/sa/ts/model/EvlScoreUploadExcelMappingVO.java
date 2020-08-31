package cpa.biz.sa.ts.model;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import cpa.biz.sa.ss.model.CmmnTnEvlScoreVO;
import egovframework.rte.fdl.excel.EgovExcelMapping;
import egovframework.rte.fdl.excel.util.EgovExcelUtil;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlScoreUploadExcelMappingVO.java
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
public class EvlScoreUploadExcelMappingVO extends EgovExcelMapping {
	

	@Override
	public Object mappingColumn(Row row) throws Exception {
		CmmnTnEvlScoreVO vo = new CmmnTnEvlScoreVO();
		
		
		return vo;
	}
}
