package cpa.biz.sa.ss.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.ss.model.EvlIndvdlzScoreSearchVO;
import cpa.biz.sa.ss.model.EvlIndvdlzScoreVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlIndvdlzScoreDAO.java
* 클래스 설명 : 평가과목(개별)점수일람표
* 		
* @author 김동규
* @since 2020.08.21
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.21                   김동규	최초 생성
* </pre>
*/
@Repository("EvlIndvdlzScoreDAO")
public class EvlIndvdlzScoreDAO extends EgovComAbstractDAO{
	
	public List<EvlIndvdlzScoreVO> searchEvlIndvdlzScoreList(EvlIndvdlzScoreSearchVO evlIndvdlzScoreSearchVO){
		return selectList("EvlIndvdlzScoreDAO.searchEvlIndvdlzScoreList", evlIndvdlzScoreSearchVO);
	}
	
}
