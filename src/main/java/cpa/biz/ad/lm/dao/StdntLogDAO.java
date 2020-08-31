package cpa.biz.ad.lm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.lm.model.StdntLogVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("StdntLogDAO")
public class StdntLogDAO extends EgovComAbstractDAO{
	public List selectStdntLogAjaxList(StdntLogVO stdntLogVO){
		return selectList("StdntLogDAO.selectStdntLogAjaxList", stdntLogVO);
	}
}
