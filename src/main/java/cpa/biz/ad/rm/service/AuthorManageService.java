package cpa.biz.ad.rm.service;

import java.util.List;

import cpa.biz.ad.rm.model.AuthorManageVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 권한 관리
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
public interface AuthorManageService {
	
	/**
	* Author : 송광진
	* 권한 관리 목록을 조회한다.
	*
	* @param 
	* @return List<AuthorManageVO>
	* @exception Exception
	*/
	public List<AuthorManageVO> searchAuthorManageAjaxList(AuthorManageVO AuthorManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 권한 관리을 등록한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return int
	* @exception Exception
	*/
	public int insertAjaxAuthorManage(AuthorManageVO AuthorManageVO) throws Exception;
	
	
	/**
	* Author : 송광진
	* 공통상세코드 상세/수정 화면을 조회한다.
	*
	* @param 
	* @return List<AuthorManageVO>
	* @exception Exception
	*/
	public AuthorManageVO searchAuthorManageView(AuthorManageVO AuthorManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 권한 관리을 수정한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return int
	* @exception Exception
	*/
	public int updateAjaxAuthorManage(AuthorManageVO AuthorManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 권한 관리을 삭제한다.
	*
	* @param AuthorManageVO - 조회할 정보가 담긴 AuthorManageVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxAuthorManage(AuthorManageVO AuthorManageVO) throws Exception;
	
}
