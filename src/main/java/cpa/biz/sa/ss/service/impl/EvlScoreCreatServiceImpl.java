package cpa.biz.sa.ss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cpa.biz.sa.ss.dao.EvlScoreCreatDAO;
import cpa.biz.sa.ss.model.EvlScoreCreatVO;
import cpa.biz.sa.ss.service.EvlScoreCreatService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlScoreCreatServiceImpl.java
* 클래스 설명 : 평가과목점수생성(평가)
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
@Repository("EvlScoreCreatService")
public class EvlScoreCreatServiceImpl implements EvlScoreCreatService {
	
	@Autowired
	EvlScoreCreatDAO evlScoreCreatDAO;
	
	@Override
	public int updateEvlScoreCreat(EvlScoreCreatVO evlScoreCreatVO) throws Exception {
		
		//TODO 점수생성 business
		return evlScoreCreatDAO.updateEvlScoreCreat(evlScoreCreatVO);
	}

}
