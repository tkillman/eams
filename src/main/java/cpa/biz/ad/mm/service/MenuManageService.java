package cpa.biz.ad.mm.service;

import java.util.List;

import cpa.biz.ad.mm.model.MenuManageVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 메뉴 관리
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
public interface MenuManageService {
	
	/**
	* Author : 송광진
	* 메뉴 관리 목록을 조회한다.
	*
	* @param 
	* @return List<MenuManageVO>
	* @exception Exception
	*/
	public List<MenuManageVO> searchMenuManageAjaxList(MenuManageVO MenuManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 메뉴 관리을 등록한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return int
	* @exception Exception
	*/
	public int insertAjaxMenuManage(MenuManageVO MenuManageVO) throws Exception;
	
	
	/**
	* Author : 송광진
	* 공통상세코드 상세/수정 화면을 조회한다.
	*
	* @param 
	* @return List<MenuManageVO>
	* @exception Exception
	*/
	public MenuManageVO searchMenuManageView(MenuManageVO MenuManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 메뉴 관리을 수정한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return int
	* @exception Exception
	*/
	public int updateAjaxMenuManage(MenuManageVO MenuManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 메뉴별 권한을 등록/수정한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return int
	* @exception Exception
	*/
	public int updateAjaxMenuAuthorManage(MenuManageVO MenuManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 메뉴 관리을 삭제한다.
	*
	* @param MenuManageVO - 조회할 정보가 담긴 MenuManageVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxMenuManage(MenuManageVO MenuManageVO) throws Exception;
	
}
