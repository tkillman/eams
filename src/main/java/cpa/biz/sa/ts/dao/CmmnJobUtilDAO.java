package cpa.biz.sa.ts.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.ts.model.CmmnJobUtilSearchVO;
import cpa.biz.sa.ts.model.CmmnTnCnoEvlMngVO;
import cpa.biz.sa.ts.model.CmmnTnCnoSylbsInfoVO;
import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnStdntInfoVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnJobUtilDAO.java
* 클래스 설명 : 공통업무유틸DAO
* 		
* @author 김동규
* @since 2020.08.26
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.26                   김동규	최초 생성
* </pre>
*/
@Repository("CmmnJobUtilDAO")
public class CmmnJobUtilDAO extends EgovComAbstractDAO{
	
	public CmmnTnEntschInfoVO selectTnEntschInfo(CmmnJobUtilSearchVO cmmnJobUtilSearchVO) {
		return selectOne("CmmnJobUtilDAO.selectTnEntschInfo", cmmnJobUtilSearchVO);
	}
	
	public CmmnTnCnoSylbsInfoVO selectTnCnoSylbsInfo(CmmnJobUtilSearchVO cmmnJobUtilSearchVO) {
		return selectOne("CmmnJobUtilDAO.selectTnCnoSylbsInfo", cmmnJobUtilSearchVO);
	}
	
	public CmmnTnCnoEvlMngVO selectTnCnoEvlMng(CmmnJobUtilSearchVO cmmnJobUtilSearchVO) {
		return selectOne("CmmnJobUtilDAO.selectTnCnoEvlMng", cmmnJobUtilSearchVO);
	}
	
	public List<CmmnTnStdntInfoVO> selectTnStdntInfoAjaxList(CmmnJobUtilSearchVO cmmnJobUtilSearchVO){
		return selectList("CmmnJobUtilDAO.selectTnStdntInfoAjaxList", cmmnJobUtilSearchVO);
	}
}
