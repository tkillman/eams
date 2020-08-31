package cpa.biz.ad.um.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.um.model.OprtrManageVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("OprtrManageDAO")
public class OprtrManageDAO extends EgovComAbstractDAO{
	public List selectOprtrManageAjaxList(OprtrManageVO OprtrManageVO){
		return selectList("OprtrManageDAO.selectOprtrManageAjaxList", OprtrManageVO);
	}
	
	public int insertAjaxOprtrManage(OprtrManageVO OprtrManageVO){
		return insert("OprtrManageDAO.insertAjaxOprtrManage", OprtrManageVO);
	}
	
	public OprtrManageVO selectOprtrManageView(OprtrManageVO OprtrManageVO){
		return selectOne("OprtrManageDAO.selectOprtrManageView", OprtrManageVO);
	}
	
	public int updateAjaxOprtrManage(OprtrManageVO OprtrManageVO){
		return update("OprtrManageDAO.updateAjaxOprtrManage", OprtrManageVO);
	}
	
	public int deleteAjaxOprtrManage(OprtrManageVO OprtrManageVO){
		return delete("OprtrManageDAO.deleteAjaxOprtrManage", OprtrManageVO);
	}
	
	public int updateAjaxOprtrManagePwdInitl(OprtrManageVO OprtrManageVO){
		return update("OprtrManageDAO.updateAjaxOprtrManagePwdInitl", OprtrManageVO);
	}
}
