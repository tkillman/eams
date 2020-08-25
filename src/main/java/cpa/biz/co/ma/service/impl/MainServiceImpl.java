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
	
	/**
	* 공지사항를 조회한다.
	* @param MainVO
	* @return
	*/	
	@Override
	public Map<String, Object> selectBbsList(MainVO mainVO) {
		List<?> list = mainDao.selectBbsList(mainVO);

		int cnt = mainDao.selectBbsListCnt(mainVO);

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("resultList", list);
		map.put("resultCnt", Integer.toString(cnt));

		return map;
	}
}
