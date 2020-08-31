package cpa.biz.ad.cm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.cm.model.CmmnCodeManageVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("CmmnCodeManageDAO")
public class CmmnCodeManageDAO extends EgovComAbstractDAO{
	public List selectCmmnCodeManageAjaxList(CmmnCodeManageVO CmmnCodeManageVO){
		return selectList("CmmnCodeManageDAO.selectCmmnCodeManageAjaxList", CmmnCodeManageVO);
	}
	
	public int insertAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO){
		return insert("CmmnCodeManageDAO.insertAjaxCmmnCodeManage", CmmnCodeManageVO);
	}
	
	public CmmnCodeManageVO selectCmmnCodeManageView(CmmnCodeManageVO CmmnCodeManageVO){
		return selectOne("CmmnCodeManageDAO.selectCmmnCodeManageView", CmmnCodeManageVO);
	}
	
	public int updateAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO){
		return update("CmmnCodeManageDAO.updateAjaxCmmnCodeManage", CmmnCodeManageVO);
	}
	
	public int deleteAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO){
		return delete("CmmnCodeManageDAO.deleteAjaxCmmnCodeManage", CmmnCodeManageVO);
	}
}
