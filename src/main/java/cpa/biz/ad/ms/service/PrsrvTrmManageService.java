package cpa.biz.ad.ms.service;

import cpa.biz.ad.ms.model.PrsrvTrmManageVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 보존연한관리
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
public interface PrsrvTrmManageService {
	
	/**
	* Author : 송광진
	* 보존연한을 조회한다.
	*
	* @param EdcAllwncOutptVO - 조회할 정보가 담긴 EdcAllwncOutptVO
	* @return List<EdcAllwncOutptVO>
	* @exception Exception
	*/
	public PrsrvTrmManageVO searchPrsrvTrmManageDetail(PrsrvTrmManageVO prsrvTrmManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 보존연한을 수정한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return List<EdcAllwncRegistVO>
	* @exception Exception
	*/
	public int updateAjaxPrsrvTrmManage(PrsrvTrmManageVO prsrvTrmManageVO) throws Exception;
	
}
