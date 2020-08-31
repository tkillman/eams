package cpa.biz.ad.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.ms.dao.PwChangeCycleDAO;
import cpa.biz.ad.ms.model.PwChangeCycleVO;
import cpa.biz.ad.ms.service.PwChangeCycleService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* PwChangeCycleServiceImpl.java
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
@Service("PwChangeCycleService")
public class PwChangeCycleServiceImpl implements PwChangeCycleService{
	
	@Autowired
	PwChangeCycleDAO pwChangeCycleDAO;
	
	@Override
	public List<PwChangeCycleVO> searchPwChangeCycleAjaxList() throws Exception {
		return pwChangeCycleDAO.selectPwChangeCycleAjaxList();
	}
	
	@Override
	public int insertAjaxPwChangeCycle(PwChangeCycleVO PwChangeCycleVO) throws Exception {
		return pwChangeCycleDAO.insertAjaxPwChangeCycle(PwChangeCycleVO);
	}
	
	@Override
	public int updateAjaxPwChangeCycle(PwChangeCycleVO PwChangeCycleVO) throws Exception {
		return pwChangeCycleDAO.updateAjaxPwChangeCycle(PwChangeCycleVO);
	}
	
	@Override
	public int deleteAjaxPwChangeCycle(PwChangeCycleVO PwChangeCycleVO) throws Exception {
		return pwChangeCycleDAO.deleteAjaxPwChangeCycle(PwChangeCycleVO);
	}

}
