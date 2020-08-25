package cpa.biz.sa.ts.service;

import java.util.List;

import cpa.biz.sa.ts.model.CrqfcAddpntCnfirmSearchVO;
import cpa.biz.sa.ts.model.CrqfcAddpntCnfirmVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAddpntCnfirmService.java
* 클래스 설명 : 자격증가산점확인표
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
public interface CrqfcAddpntCnfirmService {
	
	/**
	* Author : 김동규
	* 자격증가산점확인표 조회한다.
	*
	* @param CrqfcAddpntCnfirmSearchVO - 조회할 정보가 담긴 CrqfcAddpntCnfirmSearchVO
	* @return List<CrqfcAddpntCnfirmVO>
	* @exception Exception
	*/
	public List<CrqfcAddpntCnfirmVO> searchCrqfcAddpntCnfirmList(CrqfcAddpntCnfirmSearchVO crqfcAddpntCnfirmSearchVO) throws Exception;
}
