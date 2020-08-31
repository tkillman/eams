package cpa.biz.co.ma.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.co.ma.model.MainVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MainDAO.java
* 클래스 설명 : 메인 DAO
* 		
* @author 안선영
* @since 2020.8.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.8.20     안선영	최초 생성
* </pre>
*/

@Repository("MainDAO")
public class MainDAO extends EgovComAbstractDAO {
	
	public List<?> selectBbsList(MainVO mainVO) {
		return list("MainDAO.selectBbsList", mainVO);
	}
	
	public int selectBbsListCnt(MainVO mainVO) {
		return (Integer)selectOne("MainDAO.selectBbsListCnt", mainVO);
	}
	
	public MainVO loginProc(MainVO mainVO) {
		return (MainVO) selectOne("MainDAO.loginProc", mainVO);
	}
	
	public MainVO searchPassword(MainVO mainVO) {
		return (MainVO) selectOne("MainDAO.searchPassword", mainVO);
	}
}
