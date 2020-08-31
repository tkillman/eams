package cpa.biz.ad.cm.service;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import cpa.biz.ad.cm.model.CmmnClCodeVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 분류코드 관리
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
public interface CmmnClCodeService {
	
	/**
	* Author : 송광진
	* 분류코드 관리 목록을 조회한다.
	*
	* @param 
	* @return List<DataDeleteVO>
	* @exception Exception
	*/
	public List<CmmnClCodeVO> searchCmmnClCodeAjaxList(CmmnClCodeVO CmmnClCodeVO) throws Exception;
	
	/**
	* Author : 송광진
	* 분류코드 상세/수정 화면을 조회한다.
	*
	* @param CmmnClCodeVO - 조회할 정보가 담긴 CmmnClCodeVO
	* @return "/cpa/biz/co/sm/web/stdntInfoHist"
	* @exception Exception
	*/
	public CmmnClCodeVO searchCmmnClCodeView(CmmnClCodeVO CmmnClCodeVO) throws Exception;
	/**
	* Author : 송광진
	* 분류코드 관리을 등록한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return int
	* @exception Exception
	*/
	public int insertAjaxCmmnClCode(CmmnClCodeVO CmmnClCodeVO) throws Exception;
	
	/**
	* Author : 송광진
	* 분류코드 관리을 수정한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return int
	* @exception Exception
	*/
	public int updateAjaxCmmnClCode(CmmnClCodeVO CmmnClCodeVO) throws Exception;
	
	/**
	* Author : 송광진
	* 분류코드 관리을 삭제한다.
	*
	* @param PrsrvTrmManageVO - 조회할 정보가 담긴 PrsrvTrmManageVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxCmmnClCode(CmmnClCodeVO CmmnClCodeVO) throws Exception;
	
}
