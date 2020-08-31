package cpa.biz.sa.ts.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnStdntInfoVO;
import cpa.biz.sa.ts.model.CrqfcAcqsUploadVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadDAO.java
* 클래스 설명 : 자격증취득내역업로드
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
@Repository("CrqfcAcqsUploadDAO")
public class CrqfcAcqsUploadDAO extends EgovComAbstractDAO{
	
	/**
	* Author : 김동규
	* 자격증취득내역업로드 수정한다.
	*
	* @param CrqfcAcqsUploadVO - 조회할 정보가 담긴 CrqfcAcqsUploadVO
	* @return int
	* @exception Exception
	*/
	public int updateCrqfcAcqsUploadExcel(CrqfcAcqsUploadVO crqfcAcqsUploadVO) {
		return update("CrqfcAcqsUploadDAO.updateCrqfcAcqsUploadExcel", crqfcAcqsUploadVO);
	}
	
	/**
	* Author : 김동규
	* 게시판의 목록을 조회한다.
	*
	* @param paramMap - 조회할 정보가 담긴 paramMap
	* @return List<CmmnTnStdntInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnStdntInfoVO> selectTnStdntInfoList(Map<String, String> paramMap){
		return selectList("CrqfcAcqsUploadDAO.selectTnStdntInfoList", paramMap);
	}
	
	/**
	* Author : 김동규
	* 게시판의 목록을 조회한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 BbsManageVO
	* @return CmmnTnEntschInfoVO
	* @exception Exception
	*/
	public CmmnTnEntschInfoVO selectTnEntschInfo(CrqfcAcqsUploadVO crqfcAcqsUploadVO) {
		return selectOne("CrqfcAcqsUploadDAO.selectTnEntschInfo", crqfcAcqsUploadVO);
	};
	
}
