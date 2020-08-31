package cpa.biz.ad.um.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.um.dao.OprtrManageDAO;
import cpa.biz.ad.um.model.OprtrManageVO;
import cpa.biz.ad.um.service.OprtrManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* OprtrManageServiceImpl.java
* 클래스 설명 : 권한 관리
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
@Service("OprtrManageService")
public class OprtrManageServiceImpl implements OprtrManageService{
	
	@Autowired
	OprtrManageDAO OprtrManageDAO;
	
	@Override
	public List<OprtrManageVO> searchOprtrManageAjaxList(OprtrManageVO OprtrManageVO) throws Exception {
		return OprtrManageDAO.selectOprtrManageAjaxList(OprtrManageVO);
	}
	
	@Override
	public int insertAjaxOprtrManage(OprtrManageVO OprtrManageVO) throws Exception {
		return OprtrManageDAO.insertAjaxOprtrManage(OprtrManageVO);
	}
	
	@Override
	public OprtrManageVO searchOprtrManageView(OprtrManageVO OprtrManageVO) throws Exception {
		return OprtrManageDAO.selectOprtrManageView(OprtrManageVO);
	}
	
	@Override
	public int updateAjaxOprtrManage(OprtrManageVO OprtrManageVO) throws Exception {
		return OprtrManageDAO.updateAjaxOprtrManage(OprtrManageVO);
	}
	
	@Override
	public int deleteAjaxOprtrManage(OprtrManageVO OprtrManageVO) throws Exception {
		return OprtrManageDAO.deleteAjaxOprtrManage(OprtrManageVO);
	}
	
	@Override
	public int updateAjaxOprtrManagePwdInitl(OprtrManageVO OprtrManageVO) throws Exception {
		return OprtrManageDAO.updateAjaxOprtrManagePwdInitl(OprtrManageVO);
	}

}
