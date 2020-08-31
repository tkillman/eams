package cpa.biz.ad.bi.service;

import java.util.List;

import cpa.biz.ad.bi.model.EntschInfoVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 입교정보
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
public interface EntschInfoService {
	
	/**
	* Author : 송광진
	* 입교정보 목록을 조회한다.
	*
	* @param 
	* @return List<EntschInfoVO>
	* @exception Exception
	*/
	public List<EntschInfoVO> searchEntschInfoAjaxList(EntschInfoVO EntschInfoVO) throws Exception;
	
	/**
	* Author : 송광진
	* 입교정보을 등록한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return int
	* @exception Exception
	*/
	public int insertAjaxEntschInfo(EntschInfoVO EntschInfoVO) throws Exception;
	
	
	/**
	* Author : 송광진
	* 공통상세코드 상세/수정 화면을 조회한다.
	*
	* @param 
	* @return List<EntschInfoVO>
	* @exception Exception
	*/
	public EntschInfoVO searchEntschInfoView(EntschInfoVO EntschInfoVO) throws Exception;
	
	/**
	* Author : 송광진
	* 입교정보을 수정한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return int
	* @exception Exception
	*/
	public int updateAjaxEntschInfo(EntschInfoVO EntschInfoVO) throws Exception;
	
	/**
	* Author : 송광진
	* 입교정보을 삭제한다.
	*
	* @param EntschInfoVO - 조회할 정보가 담긴 EntschInfoVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxEntschInfo(EntschInfoVO EntschInfoVO) throws Exception;
	
}
