package cpa.biz.sa.ss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ss.dao.IndvdlScoreInqireDAO;
import cpa.biz.sa.ss.model.IndvdlScoreInqireSearchVO;
import cpa.biz.sa.ss.model.IndvdlScoreInqireVO;
import cpa.biz.sa.ss.service.IndvdlScoreInqireService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* IndvdlScoreInqireServiceImpl.java
* 클래스 설명 : 개인별점수조회
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
@Service("IndvdlScoreInqireService")
public class IndvdlScoreInqireServiceImpl implements IndvdlScoreInqireService {

	@Autowired
	IndvdlScoreInqireDAO indvdlScoreInqireDAO;
	
	@Override
	public IndvdlScoreInqireVO searchIndvdlScoreInqireDetail(IndvdlScoreInqireSearchVO indvdlScoreInqireSearchVO) {
		
		return indvdlScoreInqireDAO.selectIndvdlScoreInqireDetail(indvdlScoreInqireSearchVO);
	}

}
