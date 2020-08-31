package cpa.biz.sa.ss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ss.model.EvlOdrSylbsScoreSearchVO;
import cpa.biz.sa.ss.model.EvlOdrSylbsScoreVO;
import cpa.biz.sa.ss.service.EvlOdrSylbsScoreService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlOdrSylbsScoreController.java
* 클래스 설명 : 평가차수별요목점수알림표
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
public class EvlOdrSylbsScoreController {
	
	@Autowired
	EvlOdrSylbsScoreService evlOdrSylbsScoreService;
	
	/**
	* Author : 김동규
	* 평가차수별요목점수알림표 목록조회한다.
	*
	* @param EvlOdrSylbsScoreSearchVO - 조회할 정보가 담긴 EvlOdrSylbsScoreSearchVO
	* @return String
	* @exception Exception
	*/
	public String searchEvlOdrSylbsScoreAjaxList(EvlOdrSylbsScoreSearchVO evlOdrSylbsScoreSearchVO) throws Exception {
		evlOdrSylbsScoreService.searchEvlOdrSylbsScoreAjaxList(evlOdrSylbsScoreSearchVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 평가차수별요목점수알림표 엑셀다운로드한다.
	*
	* @param EvlOdrSylbsScoreVO - 조회할 정보가 담긴 EvlOdrSylbsScoreVO
	* @return String
	* @exception Exception
	*/
	public String writeEvlOdrSylbsScore(EvlOdrSylbsScoreVO evlOdrSylbsScoreVO) {
		return null;
	}
}
