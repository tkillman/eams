package cpa.biz.sa.ss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ss.dao.ReEvlScoreCreatDAO;
import cpa.biz.sa.ss.model.ReEvlScoreCreatVO;
import cpa.biz.sa.ss.service.ReEvlScoreCreatService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ReEvlScoreCreatServiceImpl.java
* 클래스 설명 : 평가과목점수생성(재평가)
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
@Service("ReEvlScoreCreatService")
public class ReEvlScoreCreatServiceImpl implements ReEvlScoreCreatService {

	@Autowired
	ReEvlScoreCreatDAO reEvlScoreCreatDAO;
	
	@Override
	public int updateReEvlScoreCreat(ReEvlScoreCreatVO reEvlScoreCreatVO) throws Exception {
		
		reEvlScoreCreatDAO.update("ReEvlScoreCreatDAO.updateReEvlScoreCreat", reEvlScoreCreatVO);
		return 0;
	}

}
