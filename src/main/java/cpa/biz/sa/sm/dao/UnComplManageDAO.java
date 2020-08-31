package cpa.biz.sa.sm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.sm.model.UnComplManageVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("UnComplManageDAO")
public class UnComplManageDAO extends EgovComAbstractDAO{
	public List selectUnComplManageAjaxList(UnComplManageVO unComplManageVO){
		return selectList("UnComplManageDAO.selectUnComplManageAjaxList", unComplManageVO);
	}
	
	public int insertAjaxUnComplManage(UnComplManageVO unComplManageVO){
		return insert("UnComplManageDAO.insertAjaxUnComplManage", unComplManageVO);
	}
	
	public UnComplManageVO selectUnComplManageView(UnComplManageVO unComplManageVO){
		return selectOne("UnComplManageDAO.selectUnComplManageView", unComplManageVO);
	}
	
	public int updateAjaxUnComplManage(UnComplManageVO unComplManageVO){
		return update("UnComplManageDAO.updateAjaxUnComplManage", unComplManageVO);
	}
	
	public int deleteAjaxUnComplManage(UnComplManageVO unComplManageVO){
		return delete("UnComplManageDAO.deleteAjaxUnComplManage", unComplManageVO);
	}
}
