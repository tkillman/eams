package cpa.biz.ad.bi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.bi.dao.EntschInfoDAO;
import cpa.biz.ad.bi.model.EntschInfoVO;
import cpa.biz.ad.bi.service.EntschInfoService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EntschInfoServiceImpl.java
* 클래스 설명 : 입교정보
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
@Service("EntschInfoService")
public class EntschInfoServiceImpl implements EntschInfoService{
	
	@Autowired
	EntschInfoDAO EntschInfoDAO;
	
	@Override
	public List<EntschInfoVO> searchEntschInfoAjaxList(EntschInfoVO EntschInfoVO) throws Exception {
		return EntschInfoDAO.selectEntschInfoAjaxList(EntschInfoVO);
	}
	
	@Override
	public int insertAjaxEntschInfo(EntschInfoVO EntschInfoVO) throws Exception {
		return EntschInfoDAO.insertAjaxEntschInfo(EntschInfoVO);
	}
	
	@Override
	public EntschInfoVO searchEntschInfoView(EntschInfoVO EntschInfoVO) throws Exception {
		return EntschInfoDAO.selectEntschInfoView(EntschInfoVO);
	}
	
	@Override
	public int updateAjaxEntschInfo(EntschInfoVO EntschInfoVO) throws Exception {
		return EntschInfoDAO.updateAjaxEntschInfo(EntschInfoVO);
	}
	
	@Override
	public int deleteAjaxEntschInfo(EntschInfoVO EntschInfoVO) throws Exception {
		return EntschInfoDAO.deleteAjaxEntschInfo(EntschInfoVO);
	}

}
