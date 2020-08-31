package cpa.biz.ad.mm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.mm.model.MenuManageVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("MenuManageDAO")
public class MenuManageDAO extends EgovComAbstractDAO{
	public List selectMenuManageAjaxList(MenuManageVO MenuManageVO){
		return selectList("MenuManageDAO.selectMenuManageAjaxList", MenuManageVO);
	}
	
	public int insertAjaxMenuManage(MenuManageVO MenuManageVO){
		return insert("MenuManageDAO.insertAjaxMenuManage", MenuManageVO);
	}
	
	public MenuManageVO selectMenuManageView(MenuManageVO MenuManageVO){
		return selectOne("MenuManageDAO.selectMenuManageView", MenuManageVO);
	}
	
	public int updateAjaxMenuManage(MenuManageVO MenuManageVO){
		return update("MenuManageDAO.updateAjaxMenuManage", MenuManageVO);
	}
	
	public int updateAjaxMenuAuthorManage(MenuManageVO MenuManageVO){
		return update("MenuManageDAO.updateAjaxMenuAuthorManage", MenuManageVO);
	}
	
	public int deleteAjaxMenuManage(MenuManageVO MenuManageVO){
		return delete("MenuManageDAO.deleteAjaxMenuManage", MenuManageVO);
	}
}
