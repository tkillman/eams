package cpa.biz.sa.ts.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnIemInfoVO;
import cpa.biz.sa.ts.model.CmmnTnRealmInfoVO;
import cpa.biz.sa.ts.model.CmmnTnSbjectInfoVO;
import cpa.biz.sa.ts.model.EvlScoreUploadVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlScoreUploadDAO.java
* 클래스 설명 : 평가항목점수업로드
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
@Repository("EvlScoreUploadDAO")
public class EvlScoreUploadDAO extends EgovComAbstractDAO{
	
	public int updateEvlScoreUploadExcel(EvlScoreUploadVO evlScoreUploadVO) {
		return update("EvlScoreUploadDAO.updateEvlScoreUploadExcel", evlScoreUploadVO);
	}
	
	/**
	* Author : 김동규
	* 기수 목록조회한다.
	*
	* @return List<CmmnTnEntschInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnEntschInfoVO> selectTnEntschInfoAjaxList() {
		return selectList("EvlScoreUploadDAO.selectTnEntschInfoAjaxList");
	}
	
	/**
	* Author : 김동규
	* 분야 목록조회한다.
	*
	* @return List<CmmnTnIemInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnIemInfoVO> selectTnIemInfoAjaxList() {
		return selectList("EvlScoreUploadDAO.selectTnIemInfoAjaxList");
	}
	
	/**
	* Author : 김동규
	* 항목 목록조회한다.
	*
	* @return List<CmmnTnRealmInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnRealmInfoVO> selectTnRealmInfoAjaxList() {
		return selectList("EvlScoreUploadDAO.selectTnRealmInfoAjaxList");
	}

	/**
	* Author : 김동규
	* 과목 목록조회한다.
	*
	* @return List<CmmnTnSbjectInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnSbjectInfoVO> selectTnSbjectInfoAjaxList() {
		return selectList("EvlScoreUploadDAO.selectTnSbjectInfoAjaxList");
	}
}
