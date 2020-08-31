package cpa.biz.sa.ts.service;

import java.util.List;

import cpa.biz.sa.ts.model.CmmnTnStdntInfoVO;
import cpa.biz.sa.ts.model.CpaTeVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadService2.java
* 클래스 설명 : 자격증취득내역업로드
* 		
* @author 김동규
* @since 2020.08.31
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.31                   김동규	최초 생성
* </pre>
*/
public interface CrqfcAcqsUploadService2 {

	/**
	* Author : 김동규
	* 자격증취득내역업로드 엑셀업로드한다.
	*
	* @param List<CpaTeVO> - 조회할 정보가 담긴 List<CpaTeVO>
	* @return int
	* @exception Exception
	*/
	public int updateCrqfcAcqsUploadExcel(List<CpaTeVO> excelDataList);
	
	/**
	* Author : 김동규
	* 
	* @param List<CpaTeVO> - 조회할 정보가 담긴 List<CpaTeVO> 
	* @param List<CmmnTnStdntInfoVO> - 조회할 정보가 담긴 List<CmmnTnStdntInfoVO>
	* @return void
	* @exception Exception
	*/
	public void setStdntNoInfoToExcelList(List<CpaTeVO> excelDataList, List<CmmnTnStdntInfoVO> cmmnTnStdntInfoVOList) throws Exception;
}
