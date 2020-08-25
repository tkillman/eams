package cpa.biz.sa.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ss.dao.EvlIndvdlzScoreDAO;
import cpa.biz.sa.ss.model.EvlIndvdlzScoreSearchVO;
import cpa.biz.sa.ss.model.EvlIndvdlzScoreVO;
import cpa.biz.sa.ss.service.EvlIndvdlzScoreService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlIndvdlzScoreServiceImpl.java
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
@Service("EvlIndvdlzScoreService")
public class EvlIndvdlzScoreServiceImpl implements EvlIndvdlzScoreService {

	@Autowired
	EvlIndvdlzScoreDAO evlIndvdlzScoreDAO;
	
	@Override
	public List<EvlIndvdlzScoreVO> searchEvlIndvdlzScoreList(EvlIndvdlzScoreSearchVO evlIndvdlzScoreSearchVO) {
		
		return evlIndvdlzScoreDAO.searchEvlIndvdlzScoreList(evlIndvdlzScoreSearchVO);
	}

}
