package cpa.biz.sa.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.sm.dao.ReEntschManageDAO;
import cpa.biz.sa.sm.model.ReEntschManageVO;
import cpa.biz.sa.sm.service.ReEntschManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ReEntschManageServiceImpl.java
* 클래스 설명 : 재입교 관리
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
@Service("ReEntschManageService")
public class ReEntschManageServiceImpl implements ReEntschManageService {

	@Autowired
	ReEntschManageDAO reEntschManageDAO;

	@Override
	public List<ReEntschManageVO> searchReEntschManageList(ReEntschManageVO reEntschManageVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
