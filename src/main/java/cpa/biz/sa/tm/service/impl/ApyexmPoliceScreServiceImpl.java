package cpa.biz.sa.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.tm.dao.ApyexmPoliceScreDAO;
import cpa.biz.sa.tm.model.ApyexmPoliceScreVO;
import cpa.biz.sa.tm.service.ApyexmPoliceScreService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ApyexmPoliceScreServiceImpl.java
* 클래스 설명 : 응시청별성적일람표
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
@Service("ApyexmPoliceScreService")
public class ApyexmPoliceScreServiceImpl implements ApyexmPoliceScreService {
	
	@Autowired
	ApyexmPoliceScreDAO apyexmPoliceScreDAO;
	
	@Override
	public List<ApyexmPoliceScreVO> searchApyexmPoliceScreAjaxList(ApyexmPoliceScreVO apyexmPoliceScreVO) {
		
		apyexmPoliceScreDAO.selectList("ApyexmPoliceScreDAO.searchApyexmPoliceScreList", apyexmPoliceScreVO);
		return apyexmPoliceScreDAO.selectApyexmPoliceScreAjaxList(apyexmPoliceScreVO);
	}

}
