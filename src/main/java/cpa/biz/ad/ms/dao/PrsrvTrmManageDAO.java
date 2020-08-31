package cpa.biz.ad.ms.dao;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.ms.model.PrsrvTrmManageVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("PrsrvTrmManageDAO")
public class PrsrvTrmManageDAO extends EgovComAbstractDAO{
	public PrsrvTrmManageVO selectPrsrvTrmManageDetail(PrsrvTrmManageVO prsrvTrmManageVO){
		return selectOne("PrsrvTrmManageDAO.selectPrsrvTrmManageDetail", prsrvTrmManageVO);
	}
	
	public int updateAjaxPrsrvTrmManage(PrsrvTrmManageVO prsrvTrmManageVO){
		return update("PrsrvTrmManageDAO.updateAjaxPrsrvTrmManage", prsrvTrmManageVO);
	}
}
