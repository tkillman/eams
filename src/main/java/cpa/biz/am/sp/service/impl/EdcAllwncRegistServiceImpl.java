package cpa.biz.am.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.am.sp.dao.EdcAllwncRegistDAO;
import cpa.biz.am.sp.model.EdcAllwncRegistVO;
import cpa.biz.am.sp.service.EdcAllwncRegistService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EdcAllwncRegistServiceImpl.java
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
@Service("EdcAllwncRegistService")
public class EdcAllwncRegistServiceImpl implements EdcAllwncRegistService{
	
	@Autowired
	EdcAllwncRegistDAO EdcAllwncRegistDAO;
	
	@Override
	public int insertAjaxEdcAllwnc(EdcAllwncRegistVO edcAllwncRegistVO) throws Exception {
		return EdcAllwncRegistDAO.insertAjaxEdcAllwnc(edcAllwncRegistVO);
	}

}
