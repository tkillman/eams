package cpa.biz.ad.ms.service;

import java.util.List;

import cpa.biz.ad.ms.model.DataDeleteVO;
import cpa.biz.am.sp.model.EdcAllwncRegistVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvskulStdntSearchService.java
* 클래스 설명 : 데이터삭제
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
public interface DataDeleteService {
	
	/**
	* Author : 송광진
	* 데이터삭제 목록을 조회한다.
	*
	* @param DataDeleteVO - 조회할 정보가 담긴 DataDeleteVO
	* @return List<DataDeleteVO>
	* @exception Exception
	*/
	public List<DataDeleteVO> searchDataDeleteAjaxList(DataDeleteVO dataDeleteVO) throws Exception;
	
	/**
	* Author : 송광진
	* 데이터삭제한다.
	*
	* @param DataDeleteVO - 조회할 정보가 담긴 DataDeleteVO
	* @return int
	* @exception Exception
	*/
	public int deleteAjaxDataDelete(DataDeleteVO dataDeleteVO) throws Exception;
	
}
