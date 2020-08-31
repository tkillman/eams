package cpa.biz.ad.ms.service;

import java.util.List;

import cpa.biz.ad.ms.model.DataDeleteVO;
import cpa.biz.ad.ms.model.PosblIpManageVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 접속가능IP대역관리
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
public interface PosblIpManageService {
	
	/**
	* Author : 송광진
	* 접속가능IP대역관리 목록을 조회한다.
	*
	* @param 
	* @return List<DataDeleteVO>
	* @exception Exception
	*/
	public List<PosblIpManageVO> searchPosblIpManageAjaxList() throws Exception;
	
	/**
	* Author : 송광진
	* 접속가능IP대역관리을 등록한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return int
	* @exception Exception
	*/
	public int insertAjaxPosblIpManage(PosblIpManageVO posblIpManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 접속가능IP대역관리을 수정한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return int
	* @exception Exception
	*/
	public int updateAjaxPosblIpManage(PosblIpManageVO posblIpManageVO) throws Exception;
	
	/**
	* Author : 송광진
	* 접속가능IP대역관리을 삭제한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxPosblIpManage(PosblIpManageVO posblIpManageVO) throws Exception;
	
}
