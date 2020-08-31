package cpa.biz.ad.ms.service;

import java.util.List;

import cpa.biz.ad.ms.model.PermIpEstbsVO;
import cpa.biz.ad.ms.model.PermIpEstbsVO;
import cpa.biz.am.sp.model.EdcAllwncRegistVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 패스워드변경주기
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
public interface PermIpEstbsService {
	
	/**
	* Author : 송광진
	* 패스워드변경주기 목록을 조회한다.
	*
	* @param 
	* @return List<DataDeleteVO>
	* @exception Exception
	*/
	public List<PermIpEstbsVO> searchPermIpEstbsAjaxList() throws Exception;
	
	/**
	* Author : 송광진
	* 패스워드변경주기을 등록한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return int
	* @exception Exception
	*/
	public int insertAjaxPermIpEstbs(PermIpEstbsVO PermIpEstbsVO) throws Exception;
	
	/**
	* Author : 송광진
	* 패스워드변경주기을 삭제한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxPermIpEstbs(PermIpEstbsVO PermIpEstbsVO) throws Exception;
	
}
