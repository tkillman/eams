package cpa.biz.ad.ms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.ms.dao.PrsrvTrmManageDAO;
import cpa.biz.ad.ms.model.PrsrvTrmManageVO;
import cpa.biz.ad.ms.service.PrsrvTrmManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* PrsrvTrmManageServiceImpl.java
* 클래스 설명 : 보존연한
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
@Service("PrsrvTrmManageService")
public class PrsrvTrmManageServiceImpl implements PrsrvTrmManageService{
	
	@Autowired
	PrsrvTrmManageDAO PrsrvTrmManageDAO;
	
	@Override
	public PrsrvTrmManageVO searchPrsrvTrmManageDetail(PrsrvTrmManageVO prsrvTrmManageVO) throws Exception {
		return PrsrvTrmManageDAO.selectPrsrvTrmManageDetail(prsrvTrmManageVO);
	}
	
	@Override
	public int updateAjaxPrsrvTrmManage(PrsrvTrmManageVO prsrvTrmManageVO) throws Exception {
		return PrsrvTrmManageDAO.updateAjaxPrsrvTrmManage(prsrvTrmManageVO);
	}

}
