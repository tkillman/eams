package cpa.biz.sa.ts.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.ts.model.CrqfcAddpntCnfirmSearchVO;
import cpa.biz.sa.ts.model.CrqfcAddpntCnfirmVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAddpntCnfirmDAO.java
* 클래스 설명 : 자격증가산점확인표
* 		
* @author 김동규
* @since 2020.08.21
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.21                   김동규	최초 생성
* </pre>
*/
@Repository("CrqfcAddpntCnfirmDAO")
public class CrqfcAddpntCnfirmDAO extends EgovComAbstractDAO{
	
	
	/**
	* Author : 김동규
	*  자격증가산점확인표 목록조회
	*
	* @param CrqfcAddpntCnfirmSearchVO - 조회할 정보가 담긴 CrqfcAddpntCnfirmSearchVO
	* @return List<CrqfcAddpntCnfirmVO>
	* @exception Exception
	*/
	public List<CrqfcAddpntCnfirmVO> selectCrqfcAddpntCnfirmAjaxList(CrqfcAddpntCnfirmSearchVO crqfcAddpntCnfirmSearchVO){
		return selectList("CrqfcAddpntCnfirmDAO.selectCrqfcAddpntCnfirmAjaxList", crqfcAddpntCnfirmSearchVO);
	}
}
