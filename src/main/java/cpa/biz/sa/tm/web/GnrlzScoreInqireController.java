package cpa.biz.sa.tm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.tm.model.GnrlzScoreInqireVO;
import cpa.biz.sa.tm.service.GnrlzScoreInqireService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* GnrlzScoreInqireController.java
* 클래스 설명 : 종합점수조회
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
public class GnrlzScoreInqireController {
	
	@Autowired
	GnrlzScoreInqireService gnrlzScoreInqireService;
	
	/**
	* Author : 김동규
	* 종합점수조회 목록조회한다.
	*
	* @param GnrlzScoreInqireVO - 조회할 정보가 담긴 GnrlzScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String searchGnrlzScoreInqireAjaxList(GnrlzScoreInqireVO gnrlzScoreInqireVO) {
		gnrlzScoreInqireService.searchGnrlzScoreInqireAjaxList(gnrlzScoreInqireVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 종합점수조회 엑셀다운로드한다.
	*
	* @param GnrlzScoreInqireVO - 조회할 정보가 담긴 GnrlzScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String writeGnrlzScoreInqireExcel(GnrlzScoreInqireVO gnrlzScoreInqireVO) {
		
		return null;
	}
	
	/**
	* Author : 김동규
	* 종합점수조회 화면이동한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 BbsManageVO
	* @return String
	* @exception Exception
	*/
	public String searchGnrlzScoreInqireUpdateNameForm(GnrlzScoreInqireVO gnrlzScoreInqireVO) {
		
		return null;
	}
	
	
	/**
	* Author : 김동규
	* 종합점수조회 수정한다.
	*
	* @param GnrlzScoreInqireVO - 조회할 정보가 담긴 GnrlzScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String updateGnrlzScoreInqireName(GnrlzScoreInqireVO gnrlzScoreInqireVO) {
		gnrlzScoreInqireService.updateGnrlzScoreInqireName(gnrlzScoreInqireVO);
		return null;
	}
}
