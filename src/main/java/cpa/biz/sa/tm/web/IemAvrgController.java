package cpa.biz.sa.tm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.tm.model.IemAvrgVO;
import cpa.biz.sa.tm.service.IemAvrgService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* IemAvrgController.java
* 클래스 설명 : 항목별평균표
* 		
* @author 김동규
* @since 2020.08.19
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.19                   김동규	최초 생성
* </pre>
*/
@Controller
public class IemAvrgController {
	
	@Autowired
	IemAvrgService iemAvrgService;
	
	/**
	* Author : 김동규
	* 항목별평균표 조회한다.
	*
	* @param IemAvrgVO - 조회할 정보가 담긴 IemAvrgVO
	* @return String
	* @exception Exception
	*/
	public String searchIemAvrgList(IemAvrgVO iemAvrgVO) {
		iemAvrgService.searchIemAvrgList(iemAvrgVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 항목별평균표 엑셀다운로드한다.
	*
	* @param IemAvrgVO - 조회할 정보가 담긴 IemAvrgVO
	* @return String
	* @exception Exception
	*/
	public String writeIemAvrgExcel(IemAvrgVO iemAvrgVO) {
		return null;
	}
}
