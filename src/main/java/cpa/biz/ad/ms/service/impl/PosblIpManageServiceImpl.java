package cpa.biz.ad.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.ms.dao.PosblIpManageDAO;
import cpa.biz.ad.ms.model.PosblIpManageVO;
import cpa.biz.ad.ms.service.PosblIpManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* posblIpManageServiceImpl.java
* 클래스 설명 : 교육생 수당 계좌 현황
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
@Service("posblIpManageService")
public class PosblIpManageServiceImpl implements PosblIpManageService{
	
	@Autowired
	PosblIpManageDAO posblIpManageDAO;
	
	@Override
	public List<PosblIpManageVO> searchPosblIpManageAjaxList() throws Exception {
		return posblIpManageDAO.selectPosblIpManageAjaxList();
	}
	
	@Override
	public int insertAjaxPosblIpManage(PosblIpManageVO posblIpManageVO) throws Exception {
		return posblIpManageDAO.insertAjaxPosblIpManage(posblIpManageVO);
	}
	
	@Override
	public int updateAjaxPosblIpManage(PosblIpManageVO posblIpManageVO) throws Exception {
		return posblIpManageDAO.updateAjaxPosblIpManage(posblIpManageVO);
	}
	
	@Override
	public int deleteAjaxPosblIpManage(PosblIpManageVO posblIpManageVO) throws Exception {
		return posblIpManageDAO.deleteAjaxPosblIpManage(posblIpManageVO);
	}

}
