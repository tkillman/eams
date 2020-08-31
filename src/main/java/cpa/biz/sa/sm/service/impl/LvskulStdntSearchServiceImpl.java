package cpa.biz.sa.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.sm.dao.LvskulStdntSearchDAO;
import cpa.biz.sa.sm.model.LvskulStdntSearchVO;
import cpa.biz.sa.sm.service.LvskulStdntSearchService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchServiceImpl.java
* 클래스 설명 : 퇴교생검색
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
@Service("LvskulStdntSearchService")
public class LvskulStdntSearchServiceImpl implements LvskulStdntSearchService{
	
	@Autowired
	LvskulStdntSearchDAO lvskulStdntSearchDAO;
	
	@Override
	public List<LvskulStdntSearchVO> searchLvskulStdntSearchList(LvskulStdntSearchVO lvskulStdntSearchVO) {
		lvskulStdntSearchDAO.list("LvskulStdntSearchDAO.searchLvskulStdntSearchList", lvskulStdntSearchVO);
		return null;
	}

	@Override
	public int updateLvskulStdntSearch(LvskulStdntSearchVO lvskulStdntSearchVO) throws Exception {
		lvskulStdntSearchDAO.list("LvskulStdntSearchDAO.updateLvskulStdntSearch", lvskulStdntSearchVO);
		return 0;
	}

}
