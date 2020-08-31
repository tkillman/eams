package cpa.biz.sa.ss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ss.model.EvlIndvdlzScoreSearchVO;
import cpa.biz.sa.ss.model.EvlIndvdlzScoreVO;
import cpa.biz.sa.ss.service.EvlIndvdlzScoreService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlIndvdlzScoreController.java
* 클래스 설명 : 평가과목(개별)점수일람표
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
public class EvlIndvdlzScoreController {
	
	@Autowired
	EvlIndvdlzScoreService evlIndvdlzScoreService;
	
	/**
	* Author : 김동규
	* 평가과목(개별)점수일람표 목록조회한다.
	*
	* @param EvlIndvdlzScoreVO - 조회할 정보가 담긴 EvlIndvdlzScoreVO
	* @return String
	* @exception Exception
	*/
	public String searchEvlIndvdlzScoreAjaxList(EvlIndvdlzScoreSearchVO evlIndvdlzScoreSearchVO) {
		evlIndvdlzScoreService.searchEvlIndvdlzScoreAjaxList(evlIndvdlzScoreSearchVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 평가과목(개별)점수일람표 엑셀다운로드한다.
	*
	* @param EvlIndvdlzScoreVO - 조회할 정보가 담긴 EvlIndvdlzScoreVO
	* @return String
	* @exception Exception
	*/
	public String writeEvlIndvdlzScore(EvlIndvdlzScoreVO evlIndvdlzScoreVO) {
		return null;
	}
}
