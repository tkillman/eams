package cpa.biz.sa.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ss.dao.SylbsScoreInqireDAO;
import cpa.biz.sa.ss.model.SylbsScoreInqireSearchVO;
import cpa.biz.sa.ss.model.SylbsScoreInqireVO;
import cpa.biz.sa.ss.service.SylbsScoreInqireService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SylbsScoreInqireServiceImpl.java
* 클래스 설명 : 요목별점수일람표
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
@Service("SylbsScoreInqireService")
public class SylbsScoreInqireServiceImpl implements SylbsScoreInqireService {

	@Autowired
	SylbsScoreInqireDAO sylbsScoreInqireDAO;
	
	@Override
	public List<SylbsScoreInqireVO> searchSylbsScoreInqireList(SylbsScoreInqireSearchVO sylbsScoreInqireSearchVO) throws Exception {
		sylbsScoreInqireDAO.list("SylbsScoreInqireDAO.searchSylbsScoreInqireList", sylbsScoreInqireSearchVO);
		return sylbsScoreInqireDAO.searchSylbsScoreInqireList(sylbsScoreInqireSearchVO);
	}

}
