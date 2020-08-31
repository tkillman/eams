package cpa.biz.sa.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.tm.dao.SubjctProfExevlDAO;
import cpa.biz.sa.tm.model.SubjctProfExevlVO;
import cpa.biz.sa.tm.service.SubjctProfExevlService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SubjctProfExevlServiceImpl.java
* 클래스 설명 : 학과교수별수행평가
* 		
* @author 김동규
* @since 2020.08.19
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.19                   김동규	최초 생성
* </pre>
*/
@Service
public class SubjctProfExevlServiceImpl implements SubjctProfExevlService {

	@Autowired
	SubjctProfExevlDAO subjctProfExevlDAO;
	
	@Override
	public List<SubjctProfExevlVO> searchSubjctProfExevlAjaxList(SubjctProfExevlVO subjctProfExevlVO) {
		
		return subjctProfExevlDAO.selectSubjctProfExevlAjaxList(subjctProfExevlVO);
	}

}
