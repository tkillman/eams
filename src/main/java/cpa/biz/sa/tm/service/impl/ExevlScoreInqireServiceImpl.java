package cpa.biz.sa.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cpa.biz.sa.tm.dao.ExevlScoreInqireDAO;
import cpa.biz.sa.tm.model.ExevlScoreInqireVO;
import cpa.biz.sa.tm.service.ExevlScoreInqireService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ExevlScoreInqireServiceImpl.java
* 클래스 설명 : 수행점수조회
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
@Repository("ExevlScoreInqireService")
public class ExevlScoreInqireServiceImpl implements ExevlScoreInqireService {

	@Autowired
	ExevlScoreInqireDAO exevlScoreInqireDAO;
	
	@Override
	public List<ExevlScoreInqireVO> searchExevlScoreInqireList(ExevlScoreInqireVO exevlScoreInqireVO) {
		
		exevlScoreInqireDAO.selectList("ExevlScoreInqireDAO.searchExevlScoreInqireList", exevlScoreInqireVO);
		return null;
	}

	@Override
	public int updateExevlScoreInqire(ExevlScoreInqireVO exevlScoreInqireVO) {
		exevlScoreInqireDAO.update("ExevlScoreInqireDAO.updateExevlScoreInqire", exevlScoreInqireVO);
		return 0;
	}

}
