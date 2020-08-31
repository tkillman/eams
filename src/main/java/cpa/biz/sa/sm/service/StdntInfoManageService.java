package cpa.biz.sa.sm.service;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;

import cpa.biz.sa.sm.model.StdntInfoManageVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntInfoManageService.java
* 클래스 설명 : 교육생정보관리, 교육생정보업로드
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
public interface StdntInfoManageService {
	
	/**
	* Author : 김동규
	* 교육생정보관리, 교육생정보업로드 목록을 조회한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 stdntInfoManageVO
	* @return List<StdntInfoManageVO>
	* @exception Exception
	*/
	public List<StdntInfoManageVO> searchStdntInfoManageAjaxList(StdntInfoManageVO searchVo) throws Exception;
	
	/**
	* Author : 김동규
	* 교육생정보관리, 교육생정보업로드 상세을 조회한다.
	*
	* @param StdntInfoManageVO - 조회할 정보가 담긴 stdntInfoManageVO
	* @return StdntInfoManageVO
	* @exception Exception
	*/
	public StdntInfoManageVO searchStdntInfoManageDetail(StdntInfoManageVO stdntInfoManageVO) throws Exception;
	
	/**
	* Author : 김동규
	* 교육생정보관리 등록한다.
	*
	* @param StdntInfoManageVO - 등록할 정보가 담긴 stdntInfoManageVO
	* @return int
	* @exception Exception
	*/
	public int insertStdntInfoManage(StdntInfoManageVO stdntInfoManageVO) throws Exception;
	
	/**
	* Author : 김동규
	* 교육생정보관리 수정한다.
	*
	* @param StdntInfoManageVO - 수정할 정보가 담긴 stdntInfoManageVO
	* @return int
	* @exception Exception
	*/
	public int updateStdntInfoManage(StdntInfoManageVO stdntInfoManageVO) throws Exception;
	
}
