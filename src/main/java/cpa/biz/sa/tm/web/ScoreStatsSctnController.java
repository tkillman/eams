package cpa.biz.sa.tm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.tm.model.ScoreStatsSctnVO;
import cpa.biz.sa.tm.service.ScoreStatsSctnService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScoreStatsSctnController.java
* 클래스 설명 : 점수통계구간
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
public class ScoreStatsSctnController {

	@Autowired
	ScoreStatsSctnService scoreStatsSctnService;
	
	
	/**
	* Author : 김동규
	* 점수통계구간 목록조회한다.
	*
	* @param ScoreStatsSctnVO - 조회할 정보가 담긴 ScoreStatsSctnVO
	* @return String
	* @exception Exception
	*/
	public String searchScoreStatsSctnList(ScoreStatsSctnVO scoreStatsSctnVO) {
		
		scoreStatsSctnService.searchScoreStatsSctnList(scoreStatsSctnVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 점수통계구간 등록한다.
	*
	* @param ScoreStatsSctnVO - 조회할 정보가 담긴 ScoreStatsSctnVO
	* @return String
	* @exception Exception
	*/
	public String insertScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		scoreStatsSctnService.insertScoreStatsSctn(scoreStatsSctnVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 점수통계구간 수정한다.
	*
	* @param ScoreStatsSctnVO - 조회할 정보가 담긴 ScoreStatsSctnVO
	* @return String
	* @exception Exception
	*/
	public String updateScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		
		scoreStatsSctnService.updateScoreStatsSctn(scoreStatsSctnVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 점수통계구간 삭제한다.
	*
	* @param ScoreStatsSctnVO - 조회할 정보가 담긴 ScoreStatsSctnVO
	* @return String
	* @exception Exception
	*/
	public String deleteScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		scoreStatsSctnService.deleteScoreStatsSctn(scoreStatsSctnVO);
		return null;
	}
}
