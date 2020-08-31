package cpa.biz.sa.ts.service;

import java.util.List;

import cpa.biz.sa.ts.model.CmmnJobUtilSearchVO;
import cpa.biz.sa.ts.model.CmmnTnCnoEvlMngVO;
import cpa.biz.sa.ts.model.CmmnTnCnoSylbsInfoVO;
import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnStdntInfoVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CmmnJobUtilService.java
* 클래스 설명 : 공통업무유틸서비스
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
public interface CmmnJobUtilService {

	/**
	* Author : 김동규
	* 입교정보를 조회한다.
	*
	* @param cmmnJobUtilSearchVO - 조회할 정보가 담긴 cmmnJobUtilSearchVO
	* @return CmmnTnEntschInfoVO
	* @exception Exception
	*/
	public CmmnTnEntschInfoVO searchTnEntschInfo(CmmnJobUtilSearchVO cmmnJobUtilSearchVO);
	
	
	/**
	* Author : 김동규
	* 기수요목정보를 조회한다.
	*
	* @param CmmnJobUtilSearchVO - 조회할 정보가 담긴 CmmnJobUtilSearchVO
	* @return CmmnTnCnoSylbsInfo
	* @exception Exception
	*/
	public CmmnTnCnoSylbsInfoVO searchTnCnoSylbsInfo(CmmnJobUtilSearchVO cmmnJobUtilSearchVO);
	
	/**
	* Author : 김동규
	* 기수평가관리를 조회한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 BbsManageVO
	* @return CmmnTnCnoEvlMngVO
	* @exception Exception
	*/
	public CmmnTnCnoEvlMngVO searchTnCnoEvlMng(CmmnJobUtilSearchVO cmmnJobUtilSearchVO);
	
	/**
	* Author : 김동규
	* 학생정보 목록조회한다.
	*
	* @param String - 조회할 정보가 담긴 String
	* @return List<CmmnTnStdntInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnStdntInfoVO> searchTnStdntInfoAjaxList(CmmnJobUtilSearchVO cmmnJobUtilSearchVO);
}
