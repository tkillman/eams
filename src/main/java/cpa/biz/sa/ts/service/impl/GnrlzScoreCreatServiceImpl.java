package cpa.biz.sa.ts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ts.dao.GnrlzScoreCreatDAO;
import cpa.biz.sa.ts.model.GnrlzScoreCreatVO;
import cpa.biz.sa.ts.service.GnrlzScoreCreatService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* GnrlzScoreCreatServiceImpl.java
* 클래스 설명 : 종합점수생성
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
@Service("GnrlzScoreCreatService")
public class GnrlzScoreCreatServiceImpl implements GnrlzScoreCreatService {

	@Autowired
	GnrlzScoreCreatDAO gnrlzScoreCreatDAO;
	
	@Override
	public int updateGnrlzScoreCreat(GnrlzScoreCreatVO gnrlzScoreCreatVO) {
		gnrlzScoreCreatDAO.update("GnrlzScoreCreatDAO.updateGnrlzScoreCreat", gnrlzScoreCreatVO);
		return 0;
	}
	
	
}
