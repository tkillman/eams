package cpa.biz.st.st.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.st.st.model.StdntAcdmcrVO;
import cpa.biz.st.st.model.StdntCareerVO;
import cpa.biz.st.st.model.StdntFamilyVO;
import cpa.biz.st.st.model.StdntFrndVO;
import cpa.biz.st.st.model.StdntQualfLcnsVO;
import cpa.biz.st.st.model.StdntRegistTableVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* stdntRegistTableDAO.java
* 클래스 설명 : 교육생 학생등록표
* 		
* @author 박태준
* @since 2020.08.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	           수정내용
* -------        --------    --------------------------
* 2020.08.20     tjpark      최초 생성
* </pre>
*/

@Repository("stdntRegistTableDAO")
public class StdntRegistTableDAO extends EgovComAbstractDAO {
	
	public StdntRegistTableVO selectStdntBassInfo(StdntRegistTableVO stdntRegistTableVO) {
		return (StdntRegistTableVO)selectOne("stdntRegistTableDAO.selectStdntBassInfo", stdntRegistTableVO);
	}

	public StdntRegistTableVO selectIndvdlMatter(StdntRegistTableVO stdntRegistTableVO) {
		return (StdntRegistTableVO)selectOne("stdntRegistTableDAO.selectIndvdlMatter", stdntRegistTableVO);
	}
	
	public List<?> selectFrndList(String stdntUno) {
		return list("stdntRegistTableDAO.selectFrndList", stdntUno);
	}

	public List<?> selectFamilyMatter(StdntRegistTableVO stdntRegistTableVO) {
		return list("stdntRegistTableDAO.selectFamilyMatter", stdntRegistTableVO);
	}

	public List<?> selectAcdmcrMatter(StdntRegistTableVO stdntRegistTableVO) {
		return list("stdntRegistTableDAO.selectAcdmcrMatter", stdntRegistTableVO);
	}

	public List<?> selectQualfLcns(StdntRegistTableVO stdntRegistTableVO) {
		return list("stdntRegistTableDAO.selectQualfLcns", stdntRegistTableVO);
	}

	public List<?> selectCareerMatter(StdntRegistTableVO stdntRegistTableVO) {
		return list("stdntRegistTableDAO.selectCareerMatter", stdntRegistTableVO);
	}

	public StdntRegistTableVO selectMtrscMatter(StdntRegistTableVO stdntRegistTableVO) {
		return (StdntRegistTableVO)selectOne("stdntRegistTableDAO.selectMtrscMatter", stdntRegistTableVO);
	}

	public void updateStdntBassInfo(StdntRegistTableVO stdntRegistTableVO) {
		// TODO Auto-generated method stub
		
	}

	public void updateIndvdlMatter(StdntRegistTableVO stdntRegistTableVO) {
		// TODO Auto-generated method stub
		
	}

	public void insertFrndList(StdntFrndVO stdntFrndVO) {
		// TODO Auto-generated method stub
		
	}

	public void insertFamilyMatter(StdntFamilyVO stdntFamilyVO) {
		// TODO Auto-generated method stub
		
	}

	public void insertAcdmcrMatter(StdntAcdmcrVO stdntAcdmcrVO) {
		// TODO Auto-generated method stub
		
	}

	public void insertQualfLcns(StdntQualfLcnsVO stdntQualfLcnsVO) {
		// TODO Auto-generated method stub
		
	}

	public void insertCareerMatter(StdntCareerVO stdntCareerVO) {
		// TODO Auto-generated method stub
		
	}

	public void updateMtrscMatter(StdntRegistTableVO stdntRegistTableVO) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCareerMatter(String stdntUno) {
		// TODO Auto-generated method stub
		
	}

	public void deleteQualfLcnsMatter(String stdntUno) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAcdmcMatter(String stdntUno) {
		// TODO Auto-generated method stub
		
	}

	public void deleteFamilyMatter(String stdntUno) {
		// TODO Auto-generated method stub
		
	}

	public void deleteFrndList(String stdntUno) {
		// TODO Auto-generated method stub
		
	}

}
