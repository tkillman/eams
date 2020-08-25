package cpa.biz.sa.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.tm.dao.ScreDistrbDAO;
import cpa.biz.sa.tm.model.ScreDistrbVO;
import cpa.biz.sa.tm.service.ScreDistrbService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScreDistrbServiceImpl.java
* 클래스 설명 : 성적분포표
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
@Service("ScreDistrbService")
public class ScreDistrbServiceImpl implements ScreDistrbService{
	
	@Autowired
	ScreDistrbDAO screDistrbDAO;
	
	@Override
	public List<ScreDistrbVO> searchScreDistrbList(ScreDistrbVO screDistrbVO) {
		
		screDistrbDAO.selectList("ScreDistrbDAO.searchScreDistrbList", screDistrbVO);
		
		return null;
	}

	
}
