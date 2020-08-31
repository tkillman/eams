package cpa.biz.sa.sm.service;

import java.util.List;

import cpa.biz.sa.sm.model.UnComplManageVO;

public interface UnComplManageService {
	/**
	* Author : 송광진
	* 권한 관리 목록을 조회한다.
	*
	* @param 
	* @return List<UnComplManageVO>
	* @exception Exception
	*/
	public List<UnComplManageVO> searchUnComplManageAjaxList(UnComplManageVO UnComplManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 권한 관리을 등록한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return int
	* @exception Exception
	*/
	public int insertAjaxUnComplManage(UnComplManageVO UnComplManageVO) throws Exception;
	
	
	/**
	* Author : 송광진
	* 공통상세코드 상세/수정 화면을 조회한다.
	*
	* @param 
	* @return List<UnComplManageVO>
	* @exception Exception
	*/
	public UnComplManageVO searchUnComplManageView(UnComplManageVO UnComplManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 권한 관리을 수정한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return int
	* @exception Exception
	*/
	public int updateAjaxUnComplManage(UnComplManageVO UnComplManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 권한 관리을 삭제한다.
	*
	* @param UnComplManageVO - 조회할 정보가 담긴 UnComplManageVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxUnComplManage(UnComplManageVO UnComplManageVO) throws Exception;
}
