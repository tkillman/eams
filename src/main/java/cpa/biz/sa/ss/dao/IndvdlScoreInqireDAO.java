package cpa.biz.sa.ss.dao;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.ss.model.IndvdlScoreInqireSearchVO;
import cpa.biz.sa.ss.model.IndvdlScoreInqireVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("IndvdlScoreInqireDAO")
public class IndvdlScoreInqireDAO extends EgovComAbstractDAO{

	public IndvdlScoreInqireVO selectIndvdlScoreInqireDetail(IndvdlScoreInqireSearchVO indvdlScoreInqireSearchVO){
		return selectOne("IndvdlScoreInqireDAO.selectIndvdlScoreInqireDetail", indvdlScoreInqireSearchVO);
	}
}
