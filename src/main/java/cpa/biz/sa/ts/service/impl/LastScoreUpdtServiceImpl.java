package cpa.biz.sa.ts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cpa.biz.sa.ts.dao.LastScoreUpdtDAO;
import cpa.biz.sa.ts.model.LastScoreUpdtVO;
import cpa.biz.sa.ts.service.LastScoreUpdtService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LastScoreUpdtServiceImpl.java
* 클래스 설명 : 최종점수수정
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
@Repository("LastScoreUpdtService")
public class LastScoreUpdtServiceImpl implements LastScoreUpdtService {

	@Autowired
	LastScoreUpdtDAO lastScoreUpdtDAO;
	
	@Override
	public LastScoreUpdtVO searchLastScoreUpdt(LastScoreUpdtVO lastScoreUpdtVO) {
		lastScoreUpdtDAO.selectOne("LastScoreUpdtDAO.searchLastScoreUpdt", lastScoreUpdtVO);
		return null;
	}

	@Override
	public int updateLastScoreUpdt(LastScoreUpdtVO lastScoreUpdtVO) throws Exception {
		lastScoreUpdtDAO.update("LastScoreUpdtDAO.updateLastScoreUpdt", lastScoreUpdtVO);
		return 0;
	}

	@Override
	public int updateRankLastScoreUpdt(LastScoreUpdtVO lastScoreUpdtVO) throws Exception {
		lastScoreUpdtDAO.update("LastScoreUpdtDAO.updateRankLastScoreUpdt", lastScoreUpdtVO);
		return 0;
	}

}
