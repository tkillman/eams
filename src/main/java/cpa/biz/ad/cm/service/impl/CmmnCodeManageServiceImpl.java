package cpa.biz.ad.cm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.cm.dao.CmmnCodeManageDAO;
import cpa.biz.ad.cm.model.CmmnCodeManageVO;
import cpa.biz.ad.cm.service.CmmnCodeManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnCodeManageServiceImpl.java
* 클래스 설명 : 교직원로그
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
@Service("CmmnCodeManageService")
public class CmmnCodeManageServiceImpl implements CmmnCodeManageService{
	
	@Autowired
	CmmnCodeManageDAO CmmnCodeManageDAO;
	
	@Override
	public List<CmmnCodeManageVO> searchCmmnCodeManageAjaxList(CmmnCodeManageVO CmmnCodeManageVO) throws Exception {
		return CmmnCodeManageDAO.selectCmmnCodeManageAjaxList(CmmnCodeManageVO);
	}
	
	@Override
	public int insertAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO) throws Exception {
		return CmmnCodeManageDAO.insertAjaxCmmnCodeManage(CmmnCodeManageVO);
	}
	
	@Override
	public CmmnCodeManageVO searchCmmnCodeManageView(CmmnCodeManageVO CmmnCodeManageVO) throws Exception {
		return CmmnCodeManageDAO.selectCmmnCodeManageView(CmmnCodeManageVO);
	}
	
	@Override
	public int updateAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO) throws Exception {
		return CmmnCodeManageDAO.updateAjaxCmmnCodeManage(CmmnCodeManageVO);
	}
	
	@Override
	public int deleteAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO) throws Exception {
		return CmmnCodeManageDAO.deleteAjaxCmmnCodeManage(CmmnCodeManageVO);
	}

}
