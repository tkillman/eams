package cpa.biz.ad.cm.service;

import java.util.List;

import cpa.biz.ad.cm.model.CmmnCodeManageVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 공통코드관리
* 		
* @author 송광진
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   송광진	최초 생성
* </pre>
*/
public interface CmmnCodeManageService {
	
	/**
	* Author : 송광진
	* 공통코드관리 목록을 조회한다.
	*
	* @param 
	* @return List<CmmnCodeManageVO>
	* @exception Exception
	*/
	public List<CmmnCodeManageVO> searchCmmnCodeManageAjaxList(CmmnCodeManageVO CmmnCodeManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 공통코드관리을 등록한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return int
	* @exception Exception
	*/
	public int insertAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 공통코드관리 상세/수정 화면을 조회한다.
	*
	* @param 
	* @return List<CmmnCodeManageVO>
	* @exception Exception
	*/
	public CmmnCodeManageVO searchCmmnCodeManageView(CmmnCodeManageVO CmmnCodeManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 공통코드관리을 수정한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return int
	* @exception Exception
	*/
	public int updateAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 공통코드관리을 삭제한다.
	*
	* @param CmmnCodeManageVO - 조회할 정보가 담긴 CmmnCodeManageVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxCmmnCodeManage(CmmnCodeManageVO CmmnCodeManageVO) throws Exception;
	
}
