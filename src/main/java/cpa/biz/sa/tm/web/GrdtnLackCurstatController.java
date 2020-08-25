package cpa.biz.sa.tm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.tm.model.GrdtnLackCurstatVO;
import cpa.biz.sa.tm.service.GrdtnLackCurstatService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* GrdtnLackCurstatController.java
* 클래스 설명 : 졸업요건미달자현황
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
public class GrdtnLackCurstatController {

	@Autowired
	GrdtnLackCurstatService grdtnLackCurstatService;
	
	/**
	* Author : 김동규
	* 졸업요건미달자현황 목록조회한다.
	*
	* @param GrdtnLackCurstatVO - 조회할 정보가 담긴 GrdtnLackCurstatVO
	* @return String
	* @exception Exception
	*/
	public String searchGrdtnLackCurstatList(GrdtnLackCurstatVO grdtnLackCurstatVO) {
		grdtnLackCurstatService.searchGrdtnLackCurstatList(grdtnLackCurstatVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 졸업요건미달자현황 엑셀다운로드한다.
	*
	* @param GrdtnLackCurstatVO - 조회할 정보가 담긴 GrdtnLackCurstatVO
	* @return String
	* @exception Exception
	*/
	public String writeGrdtnLackCurstatExcel(GrdtnLackCurstatVO grdtnLackCurstatVO) {
		return null;
	}
}
