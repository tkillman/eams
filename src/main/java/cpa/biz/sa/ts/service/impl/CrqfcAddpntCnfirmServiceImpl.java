package cpa.biz.sa.ts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ts.dao.CrqfcAddpntCnfirmDAO;
import cpa.biz.sa.ts.model.CrqfcAddpntCnfirmSearchVO;
import cpa.biz.sa.ts.model.CrqfcAddpntCnfirmVO;
import cpa.biz.sa.ts.service.CrqfcAddpntCnfirmService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAddpntCnfirmServiceImpl.java
* 클래스 설명 : 자격증가산점확인표
* 		
* @author 김동규
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   김동규	최초 생성
* </pre>
*/
@Service("CrqfcAddpntCnfirmService")
public class CrqfcAddpntCnfirmServiceImpl implements CrqfcAddpntCnfirmService {
	
	@Autowired
	CrqfcAddpntCnfirmDAO crqfcAddpntCnfirmDAO;
	
	@Override
	public List<CrqfcAddpntCnfirmVO> searchCrqfcAddpntCnfirmList(CrqfcAddpntCnfirmSearchVO crqfcAddpntCnfirmSearchVO)
			throws Exception {
		return crqfcAddpntCnfirmDAO.searchCrqfcAddpntCnfirmList(crqfcAddpntCnfirmSearchVO);
	}

}
