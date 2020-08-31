package cpa.biz.ad.rm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.rm.model.AuthorManageVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("AuthorManageDAO")
public class AuthorManageDAO extends EgovComAbstractDAO{
	public List selectAuthorManageAjaxList(AuthorManageVO AuthorManageVO){
		return selectList("AuthorManageDAO.selectAuthorManageAjaxList", AuthorManageVO);
	}
	
	public int insertAjaxAuthorManage(AuthorManageVO AuthorManageVO){
		return insert("AuthorManageDAO.insertAjaxAuthorManage", AuthorManageVO);
	}
	
	public AuthorManageVO selectAuthorManageView(AuthorManageVO AuthorManageVO){
		return selectOne("AuthorManageDAO.selectAuthorManageView", AuthorManageVO);
	}
	
	public int updateAjaxAuthorManage(AuthorManageVO AuthorManageVO){
		return update("AuthorManageDAO.updateAjaxAuthorManage", AuthorManageVO);
	}
	
	public int deleteAjaxAuthorManage(AuthorManageVO AuthorManageVO){
		return delete("AuthorManageDAO.deleteAjaxAuthorManage", AuthorManageVO);
	}
}
