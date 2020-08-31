package cpa.biz.ad.cm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.cm.dao.CmmnClCodeDAO;
import cpa.biz.ad.cm.model.CmmnClCodeVO;
import cpa.biz.ad.cm.service.CmmnClCodeService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnClCodeServiceImpl.java
* 클래스 설명 : 분류코드 관리
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
@Service("CmmnClCodeService")
public class CmmnClCodeServiceImpl implements CmmnClCodeService{
	
	@Autowired
	CmmnClCodeDAO CmmnClCodeDAO;
	
	@Override
	public List<CmmnClCodeVO> searchCmmnClCodeAjaxList(CmmnClCodeVO cmmnClCodeVO) throws Exception {
		return CmmnClCodeDAO.selectCmmnClCodeAjaxList(cmmnClCodeVO);
	}
	
	@Override
	public CmmnClCodeVO searchCmmnClCodeView(CmmnClCodeVO cmmnClCodeVO) throws Exception {
		return CmmnClCodeDAO.selectCmmnClCodeView(cmmnClCodeVO);
	}
	
	@Override
	public int insertAjaxCmmnClCode(CmmnClCodeVO CmmnClCodeVO) throws Exception {
		return CmmnClCodeDAO.insertAjaxCmmnClCode(CmmnClCodeVO);
	}
	
	@Override
	public int updateAjaxCmmnClCode(CmmnClCodeVO CmmnClCodeVO) throws Exception {
		return CmmnClCodeDAO.updateAjaxCmmnClCode(CmmnClCodeVO);
	}
	
	@Override
	public int deleteAjaxCmmnClCode(CmmnClCodeVO CmmnClCodeVO) throws Exception {
		return CmmnClCodeDAO.deleteAjaxCmmnClCode(CmmnClCodeVO);
	}

}
