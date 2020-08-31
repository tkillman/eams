package cpa.biz.co.ma.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cpa.biz.co.ma.dao.MainDAO;
import cpa.biz.co.ma.model.MainVO;
import cpa.biz.co.ma.service.MainService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MainServiceImpl.java
* 클래스 설명 : 메인 ServiceImpl
* 		
* @author syan
* @since 2020.8.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.8.20     syan	최초 생성
* </pre>
*/

@Service("MainService")
public class MainServiceImpl extends EgovAbstractServiceImpl implements MainService {
	
	@Resource(name = "MainDAO")
    private MainDAO mainDao;

	@Override
	public Map<String, Object> selectBbsList(MainVO mainVO) {
		
		PaginationInfo paginationInfo = new PaginationInfo();
		
		paginationInfo.setCurrentPageNo(mainVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(mainVO.getPageUnit());
		paginationInfo.setPageSize(mainVO.getPageSize());
	
		mainVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		mainVO.setLastIndex(paginationInfo.getLastRecordIndex());
		mainVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		List<?> list = mainDao.selectBbsList(mainVO);
		int cnt = mainDao.selectBbsListCnt(mainVO);
		
		paginationInfo.setTotalRecordCount(cnt);
		
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", list);
		map.put("resultCnt", Integer.toString(cnt));
		map.put("paginationInfo", paginationInfo);

		return map;
	}
	
	@Override
	public MainVO loginProc(MainVO mainVO) {
		return mainDao.loginProc(mainVO);
	}
	
	@Override
	public MainVO searchPassword(MainVO mainVO) {
		return mainDao.searchPassword(mainVO);
	}
}
