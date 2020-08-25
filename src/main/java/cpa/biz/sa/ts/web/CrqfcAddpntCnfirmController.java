package cpa.biz.sa.ts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ts.model.CrqfcAddpntCnfirmSearchVO;
import cpa.biz.sa.ts.model.CrqfcAddpntCnfirmVO;
import cpa.biz.sa.ts.service.CrqfcAddpntCnfirmService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAddpntCnfirmController.java
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
@Controller
public class CrqfcAddpntCnfirmController {
	
	@Autowired
	CrqfcAddpntCnfirmService crqfcAddpntCnfirmService;
	
	/**
	* Author : 김동규
	* 자격증가산점확인표 목록조회한다.
	*
	* @param CrqfcAddpntCnfirmSearchVO - 조회할 정보가 담긴 CrqfcAddpntCnfirmSearchVO
	* @return String
	* @exception Exception
	*/
	public String searchCrqfcAddpntCnfirmList(CrqfcAddpntCnfirmSearchVO crqfcAddpntCnfirmSearchVO) throws Exception {
		
		crqfcAddpntCnfirmService.searchCrqfcAddpntCnfirmList(crqfcAddpntCnfirmSearchVO);
		
		return null;
	}
	
	
	/**
	* Author : 김동규
	* 자격증가산점확인표 엑셀다운로드한다.
	*
	* @param CrqfcAddpntCnfirmVO - 조회할 정보가 담긴 CrqfcAddpntCnfirmVO
	* @return String
	* @exception Exception
	*/
	public String writeCrqfcAddpntCnfirm(CrqfcAddpntCnfirmVO crqfcAddpntCnfirmVO) {
		return null;
	}
}
