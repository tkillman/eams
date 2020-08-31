package cpa.biz.ad.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.ms.dao.DataDeleteDAO;
import cpa.biz.ad.ms.model.DataDeleteVO;
import cpa.biz.ad.ms.service.DataDeleteService;
import cpa.biz.am.sp.model.EdcAllwncRegistVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* DataDeleteServiceImpl.java
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
@Service("DataDeleteService")
public class DataDeleteServiceImpl implements DataDeleteService{
	
	@Autowired
	DataDeleteDAO dataDeleteDAO;
	
	@Override
	public List<DataDeleteVO> searchDataDeleteAjaxList(DataDeleteVO dataDeleteVO) throws Exception {
		return dataDeleteDAO.selectDataDeleteAjaxList(dataDeleteVO);
	}
	
	@Override
	public int deleteAjaxDataDelete(DataDeleteVO dataDeleteVO) throws Exception {
		return dataDeleteDAO.deleteAjaxDataDelete(dataDeleteVO);
	}

}
