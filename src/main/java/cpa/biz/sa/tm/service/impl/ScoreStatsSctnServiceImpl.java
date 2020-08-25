package cpa.biz.sa.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.tm.dao.ScoreStatsSctnDAO;
import cpa.biz.sa.tm.model.ScoreStatsSctnVO;
import cpa.biz.sa.tm.service.ScoreStatsSctnService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScoreStatsSctnServiceImpl.java
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
@Service("ScoreStatsSctnService")
public class ScoreStatsSctnServiceImpl implements ScoreStatsSctnService{

	@Autowired
	ScoreStatsSctnDAO scoreStatsSctnDAO;
	
	@Override
	public List<ScoreStatsSctnVO> searchScoreStatsSctnList(ScoreStatsSctnVO scoreStatsSctnVO) {
		scoreStatsSctnDAO.selectList("ScoreStatsSctnDAO.searchScoreStatsSctnList", scoreStatsSctnVO);
		return null;
	}

	@Override
	public int insertScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		scoreStatsSctnDAO.insert("ScoreStatsSctnDAO.searchScoreStatsSctnList", scoreStatsSctnVO);
		return 0;
	}

	@Override
	public int updateScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		scoreStatsSctnDAO.update("ScoreStatsSctnDAO.searchScoreStatsSctnList", scoreStatsSctnVO);
		return 0;
	}

	@Override
	public int deleteScoreStatsSctn(ScoreStatsSctnVO scoreStatsSctnVO) {
		scoreStatsSctnDAO.delete("ScoreStatsSctnDAO.searchScoreStatsSctnList", scoreStatsSctnVO);
		return 0;
	}

}
