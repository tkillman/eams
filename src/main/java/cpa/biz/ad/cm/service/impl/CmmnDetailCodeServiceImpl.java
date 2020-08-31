package cpa.biz.ad.cm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.cm.dao.CmmnDetailCodeDAO;
import cpa.biz.ad.cm.model.CmmnDetailCodeVO;
import cpa.biz.ad.cm.service.CmmnDetailCodeService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnDetailCodeServiceImpl.java
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
@Service("CmmnDetailCodeService")
public class CmmnDetailCodeServiceImpl implements CmmnDetailCodeService{
	
	@Autowired
	CmmnDetailCodeDAO CmmnDetailCodeDAO;
	
	@Override
	public List<CmmnDetailCodeVO> searchCmmnDetailCodeAjaxList(CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {
		return CmmnDetailCodeDAO.selectCmmnDetailCodeAjaxList(CmmnDetailCodeVO);
	}
	
	@Override
	public int insertAjaxCmmnDetailCode(CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {
		return CmmnDetailCodeDAO.insertAjaxCmmnDetailCode(CmmnDetailCodeVO);
	}
	
	@Override
	public CmmnDetailCodeVO searchCmmnDetailCodeView(CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {
		return CmmnDetailCodeDAO.selectCmmnDetailCodeView(CmmnDetailCodeVO);
	}
	
	@Override
	public int updateAjaxCmmnDetailCode(CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {
		return CmmnDetailCodeDAO.updateAjaxCmmnDetailCode(CmmnDetailCodeVO);
	}
	
	@Override
	public int deleteAjaxCmmnDetailCode(CmmnDetailCodeVO CmmnDetailCodeVO) throws Exception {
		return CmmnDetailCodeDAO.deleteAjaxCmmnDetailCode(CmmnDetailCodeVO);
	}

}
