package cpa.biz.sa.tm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.tm.model.ScoreStatsSctnVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScoreStatsSctnDAO.java
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
@Repository("ScoreStatsSctnDAO")
public class ScoreStatsSctnDAO extends EgovComAbstractDAO{

	public List<ScoreStatsSctnVO> selectScoreStatsSctnAjaxList(ScoreStatsSctnVO scoreStatsSctnVO) {
		return selectList("ScoreStatsSctnDAO.selectScoreStatsSctnAjaxList", scoreStatsSctnVO);
	}
	
	public int insertScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		return insert("ScoreStatsSctnDAO.searchScoreStatsSctnList", scoreStatsSctnVO);
	}
	
	public int updateScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		return update("ScoreStatsSctnDAO.searchScoreStatsSctnList", scoreStatsSctnVO);
	}
	
	public int deleteScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		return delete("ScoreStatsSctnDAO.searchScoreStatsSctnList", scoreStatsSctnVO);
	}
}
