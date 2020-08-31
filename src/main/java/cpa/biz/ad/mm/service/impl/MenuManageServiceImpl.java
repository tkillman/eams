package cpa.biz.ad.mm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.mm.dao.MenuManageDAO;
import cpa.biz.ad.mm.model.MenuManageVO;
import cpa.biz.ad.mm.service.MenuManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MenuManageServiceImpl.java
* 클래스 설명 : 메뉴 관리
* 		
* @author 송광진
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   송광진	최초 생성
* </pre>
*/
@Service("MenuManageService")
public class MenuManageServiceImpl implements MenuManageService{
	
	@Autowired
	MenuManageDAO MenuManageDAO;
	
	@Override
	public List<MenuManageVO> searchMenuManageAjaxList(MenuManageVO MenuManageVO) throws Exception {
		return MenuManageDAO.selectMenuManageAjaxList(MenuManageVO);
	}
	
	@Override
	public int insertAjaxMenuManage(MenuManageVO MenuManageVO) throws Exception {
		return MenuManageDAO.insertAjaxMenuManage(MenuManageVO);
	}
	
	@Override
	public MenuManageVO searchMenuManageView(MenuManageVO MenuManageVO) throws Exception {
		return MenuManageDAO.selectMenuManageView(MenuManageVO);
	}
	
	@Override
	public int updateAjaxMenuManage(MenuManageVO MenuManageVO) throws Exception {
		return MenuManageDAO.updateAjaxMenuManage(MenuManageVO);
	}
	
	@Override
	public int updateAjaxMenuAuthorManage(MenuManageVO MenuManageVO) throws Exception {
		return MenuManageDAO.updateAjaxMenuAuthorManage(MenuManageVO);
	}
	
	@Override
	public int deleteAjaxMenuManage(MenuManageVO MenuManageVO) throws Exception {
		return MenuManageDAO.deleteAjaxMenuManage(MenuManageVO);
	}

}
