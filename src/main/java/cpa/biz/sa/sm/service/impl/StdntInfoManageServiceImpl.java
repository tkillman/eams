package cpa.biz.sa.sm.service.impl;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.sm.dao.StdntInfoManageDAO;
import cpa.biz.sa.sm.model.StdntInfoManageVO;
import cpa.biz.sa.sm.service.StdntInfoManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntInfoManageServiceImpl.java
* 클래스 설명 : 교육생정보관리, 교육생정보업로드
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
@Service("StdntInfoManageService")
public class StdntInfoManageServiceImpl implements StdntInfoManageService {
	
	@Autowired
	StdntInfoManageDAO stdntInfoManageDAO;
	
	@Override
	public List<StdntInfoManageVO> searchStdntInfoManageAjaxList(StdntInfoManageVO searchVo) throws Exception {
		return stdntInfoManageDAO.selectStdntInfoManageAjaxList(searchVo);
	}

	@Override
	public StdntInfoManageVO searchStdntInfoManageDetail(StdntInfoManageVO searchVo) throws Exception {
		stdntInfoManageDAO.selectOne("StdntInfoManageDAO.selectStdntInfoManageDetail", searchVo);
		return null;
	}

	@Override
	public int insertStdntInfoManage(StdntInfoManageVO stdntInfoManageVO) throws Exception {
		stdntInfoManageDAO.insert("StdntInfoManageDAO.insertStdntInfoManage", stdntInfoManageVO);
		return 0;
	}

	@Override
	public int updateStdntInfoManage(StdntInfoManageVO stdntInfoManageVO) throws Exception {
		stdntInfoManageDAO.update("StdntInfoManageDAO.updateStdntInfoManage", stdntInfoManageVO);
		return 0;
	}

}
