package cpa.biz.sa.ss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ss.model.EvlAllScoreVO;
import cpa.biz.sa.ss.service.EvlAllScoreService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlAllScoreController.java
* 클래스 설명 : 평가과목(전체)점수일람표
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
public class EvlAllScoreController {

	@Autowired
	EvlAllScoreService evlAllScoreService;
	
	/**
	* Author : 김동규
	* 평가과목(전체)점수일람표 조회한다.
	*
	* @param EvlAllScoreVO - 조회할 정보가 담긴 EvlAllScoreVO
	* @return String
	* @exception Exception
	*/
	public String searchEvlAllScore(EvlAllScoreVO evlAllScoreVO) {
		
		evlAllScoreService.searchEvlAllScore(evlAllScoreVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 평가과목(전체)점수일람표 엑셀다운로드한다.
	*
	* @param EvlAllScoreVO - 조회할 정보가 담긴 EvlAllScoreVO
	* @return String
	* @exception Exception
	*/
	public String writeEvlAllScoreExcel(EvlAllScoreVO evlAllScoreVO) {
		
		return null;
	}
}
