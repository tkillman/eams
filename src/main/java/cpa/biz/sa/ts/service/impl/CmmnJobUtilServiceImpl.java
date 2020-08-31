package cpa.biz.sa.ts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ts.dao.CmmnJobUtilDAO;
import cpa.biz.sa.ts.dao.CrqfcAcqsUploadDAO;
import cpa.biz.sa.ts.model.CmmnJobUtilSearchVO;
import cpa.biz.sa.ts.model.CmmnTnCnoEvlMngVO;
import cpa.biz.sa.ts.model.CmmnTnCnoSylbsInfoVO;
import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnStdntInfoVO;
import cpa.biz.sa.ts.service.CmmnJobUtilService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnJobUtilServiceImpl.java
* 클래스 설명 : 공통업무유틸서비스
* 		
* @author 김동규
* @since 2020.08.26
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.26                   김동규	최초 생성
* </pre>
*/
@Service("CmmnJobUtilService")
public class CmmnJobUtilServiceImpl implements CmmnJobUtilService {
	
	@Autowired
	CmmnJobUtilDAO cmmnJobUtilDAO;
	
	@Override
	public CmmnTnEntschInfoVO searchTnEntschInfo(CmmnJobUtilSearchVO cmmnJobUtilSearchVO) {
		return cmmnJobUtilDAO.selectTnEntschInfo(cmmnJobUtilSearchVO);
	}

	@Override
	public CmmnTnCnoSylbsInfoVO searchTnCnoSylbsInfo(CmmnJobUtilSearchVO cmmnJobUtilSearchVO) {
		return cmmnJobUtilDAO.selectTnCnoSylbsInfo(cmmnJobUtilSearchVO);
	}

	@Override
	public CmmnTnCnoEvlMngVO searchTnCnoEvlMng(CmmnJobUtilSearchVO cmmnJobUtilSearchVO) {
		return cmmnJobUtilDAO.selectTnCnoEvlMng(cmmnJobUtilSearchVO);
	}

	@Override
	public List<CmmnTnStdntInfoVO> searchTnStdntInfoAjaxList(CmmnJobUtilSearchVO cmmnJobUtilSearchVO) {
		
		return cmmnJobUtilDAO.selectTnStdntInfoAjaxList(cmmnJobUtilSearchVO);
	}
	
}
