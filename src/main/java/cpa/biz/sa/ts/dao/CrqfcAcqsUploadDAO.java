package cpa.biz.sa.ts.dao;

import org.springframework.stereotype.Repository;

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
	
	public int updateCrqfcAcqsUploadExcel(CrqfcAcqsUploadVO crqfcAcqsUploadVO) {
		return update("CrqfcAcqsUploadDAO.updateCrqfcAcqsUploadExcel", crqfcAcqsUploadVO);
	}
}
