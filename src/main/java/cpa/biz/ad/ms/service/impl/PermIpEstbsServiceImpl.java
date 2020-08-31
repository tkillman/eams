package cpa.biz.ad.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.ms.dao.PermIpEstbsDAO;
import cpa.biz.ad.ms.model.PermIpEstbsVO;
import cpa.biz.ad.ms.service.PermIpEstbsService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* PermIpEstbsServiceImpl.java
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
@Service("PermIpEstbsService")
public class PermIpEstbsServiceImpl implements PermIpEstbsService{
	
	@Autowired
	PermIpEstbsDAO permIpEstbsDAO;
	
	@Override
	public List<PermIpEstbsVO> searchPermIpEstbsAjaxList() throws Exception {
		return permIpEstbsDAO.selectPermIpEstbsAjaxList();
	}
	
	@Override
	public int insertAjaxPermIpEstbs(PermIpEstbsVO PermIpEstbsVO) throws Exception {
		return permIpEstbsDAO.insertAjaxPermIpEstbs(PermIpEstbsVO);
	}
	
	@Override
	public int deleteAjaxPermIpEstbs(PermIpEstbsVO PermIpEstbsVO) throws Exception {
		return permIpEstbsDAO.deleteAjaxPermIpEstbs(PermIpEstbsVO);
	}

}
