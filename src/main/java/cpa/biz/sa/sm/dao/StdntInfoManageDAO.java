package cpa.biz.sa.sm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.sm.model.StdntInfoManageVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("StdntInfoManageDAO")
public class StdntInfoManageDAO extends EgovComAbstractDAO{
	public List selectStdntInfoManageAjaxList(StdntInfoManageVO searchVo){
		return selectList("StdntInfoManageDAO.selectStdntInfoManageAjaxList", searchVo);
	}
}
