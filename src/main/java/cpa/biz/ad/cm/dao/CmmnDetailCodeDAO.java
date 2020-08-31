package cpa.biz.ad.cm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.cm.model.CmmnDetailCodeVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("CmmnDetailCodeDAO")
public class CmmnDetailCodeDAO extends EgovComAbstractDAO{
	public List selectCmmnDetailCodeAjaxList(CmmnDetailCodeVO CmmnDetailCodeVO){
		return selectList("CmmnDetailCodeDAO.selectCmmnDetailCodeAjaxList", CmmnDetailCodeVO);
	}
	
	public int insertAjaxCmmnDetailCode(CmmnDetailCodeVO CmmnDetailCodeVO){
		return insert("CmmnDetailCodeDAO.insertAjaxCmmnDetailCode", CmmnDetailCodeVO);
	}
	
	public CmmnDetailCodeVO selectCmmnDetailCodeView(CmmnDetailCodeVO CmmnDetailCodeVO){
		return selectOne("CmmnDetailCodeDAO.selectCmmnDetailCodeView", CmmnDetailCodeVO);
	}
	
	public int updateAjaxCmmnDetailCode(CmmnDetailCodeVO CmmnDetailCodeVO){
		return update("CmmnDetailCodeDAO.updateAjaxCmmnDetailCode", CmmnDetailCodeVO);
	}
	
	public int deleteAjaxCmmnDetailCode(CmmnDetailCodeVO CmmnDetailCodeVO){
		return delete("CmmnDetailCodeDAO.deleteAjaxCmmnDetailCode", CmmnDetailCodeVO);
	}
}
