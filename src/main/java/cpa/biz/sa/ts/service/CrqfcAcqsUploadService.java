package cpa.biz.sa.ts.service;

import org.springframework.validation.BindingResult;

import cpa.biz.sa.ts.model.CrqfcAcqsUploadVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadService.java
* 클래스 설명 : 자격증취득내역업로드
* 		
* @author 김동규
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   김동규	최초 생성
* </pre>
*/
public interface CrqfcAcqsUploadService {

	/**
	* Author : 김동규
	* 자격증취득내역업로드 수정한다.
	*
	* @param CrqfcAcqsUploadVO - 조회할 정보가 담긴 CrqfcAcqsUploadVO
	* @return int
	* @exception Exception
	*/
	public int updateCrqfcAcqsUploadExcel(CrqfcAcqsUploadVO crqfcAcqsUploadVO);
	
	public String returnAMethod();
	
	public void validate(CrqfcAcqsUploadVO crqfcAcqsUploadVO, BindingResult bindingResult);
}
