package cpa.biz.sa.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cpa.biz.sa.sm.dao.UnComplManageDAO;
import cpa.biz.sa.sm.model.UnComplManageVO;
import cpa.biz.sa.sm.service.UnComplManageService;

public class UnComplManageServiceImpl implements UnComplManageService{
	@Autowired
	UnComplManageDAO UnComplManageDAO;
	
	@Override
	public List<UnComplManageVO> searchUnComplManageAjaxList(UnComplManageVO unComplManageVO) throws Exception {
		return UnComplManageDAO.selectUnComplManageAjaxList(unComplManageVO);
	}
	
	@Override
	public int insertAjaxUnComplManage(UnComplManageVO unComplManageVO) throws Exception {
		return UnComplManageDAO.insertAjaxUnComplManage(unComplManageVO);
	}
	
	@Override
	public UnComplManageVO searchUnComplManageView(UnComplManageVO unComplManageVO) throws Exception {
		return UnComplManageDAO.selectUnComplManageView(unComplManageVO);
	}
	
	@Override
	public int updateAjaxUnComplManage(UnComplManageVO unComplManageVO) throws Exception {
		return UnComplManageDAO.updateAjaxUnComplManage(unComplManageVO);
	}
	
	@Override
	public int deleteAjaxUnComplManage(UnComplManageVO unComplManageVO) throws Exception {
		return UnComplManageDAO.deleteAjaxUnComplManage(unComplManageVO);
	}
}
