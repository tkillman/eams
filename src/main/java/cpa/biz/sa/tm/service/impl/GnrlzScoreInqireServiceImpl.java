package cpa.biz.sa.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.tm.dao.GnrlzScoreInqireDAO;
import cpa.biz.sa.tm.model.GnrlzScoreInqireVO;
import cpa.biz.sa.tm.service.GnrlzScoreInqireService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* GnrlzScoreInqireServiceImpl.java
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
@Service("GnrlzScoreInqireService")
public class GnrlzScoreInqireServiceImpl implements GnrlzScoreInqireService {
	
	@Autowired
	GnrlzScoreInqireDAO gnrlzScoreInqireDAO;
	
	@Override
	public List<GnrlzScoreInqireVO> searchGnrlzScoreInqireList(GnrlzScoreInqireVO gnrlzScoreInqireVO) {
		gnrlzScoreInqireDAO.selectList("GnrlzScoreInqireDAO.searchGnrlzScoreInqireList", gnrlzScoreInqireVO);
		return null;
	}

	@Override
	public int updateGnrlzScoreInqireName(GnrlzScoreInqireVO gnrlzScoreInqireVO) {
		gnrlzScoreInqireDAO.update("GnrlzScoreInqireDAO.updateGnrlzScoreInqireName", gnrlzScoreInqireVO);
		return 0;
	}
	
	
}
