package cpa.biz.sa.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ss.dao.EvlOdrSylbsScoreDAO;
import cpa.biz.sa.ss.model.EvlOdrSylbsScoreSearchVO;
import cpa.biz.sa.ss.model.EvlOdrSylbsScoreVO;
import cpa.biz.sa.ss.service.EvlOdrSylbsScoreService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlOdrSylbsScoreServiceImpl.java
* 클래스 설명 : 평가차수별요목점수일람표
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
@Service("EvlOdrSylbsScoreService")
public class EvlOdrSylbsScoreServiceImpl implements EvlOdrSylbsScoreService {

	@Autowired
	EvlOdrSylbsScoreDAO evlOdrSylbsScoreDAO;
	
	@Override
	public List<EvlOdrSylbsScoreVO> searchEvlOdrSylbsScoreList(EvlOdrSylbsScoreSearchVO evlOdrSylbsScoreSearchVO) throws Exception {
		
		return evlOdrSylbsScoreDAO.searchEvlOdrSylbsScoreList(evlOdrSylbsScoreSearchVO);
	}
	
}
