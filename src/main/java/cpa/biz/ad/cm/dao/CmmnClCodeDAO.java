package cpa.biz.ad.cm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.cm.model.CmmnClCodeVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("CmmnClCodeDAO")
public class CmmnClCodeDAO extends EgovComAbstractDAO{
	public List selectCmmnClCodeAjaxList(CmmnClCodeVO cmmnClCodeVO){
		return selectList("CmmnClCodeDAO.selectCmmnClCodeAjaxList", cmmnClCodeVO);
	}
	
	public CmmnClCodeVO selectCmmnClCodeView(CmmnClCodeVO cmmnClCodeVO){
		return selectOne("CmmnClCodeDAO.selectCmmnClCodeView", cmmnClCodeVO);
	}
	
	public int insertAjaxCmmnClCode(CmmnClCodeVO cmmnClCodeVO){
		return insert("CmmnClCodeDAO.insertAjaxCmmnClCode", cmmnClCodeVO);
	}
	
	public int updateAjaxCmmnClCode(CmmnClCodeVO cmmnClCodeVO){
		return update("CmmnClCodeDAO.updateAjaxCmmnClCode", cmmnClCodeVO);
	}
	
	public int deleteAjaxCmmnClCode(CmmnClCodeVO cmmnClCodeVO){
		return delete("CmmnClCodeDAO.deleteAjaxCmmnClCode", cmmnClCodeVO);
	}
}
