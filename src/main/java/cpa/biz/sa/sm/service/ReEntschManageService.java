package cpa.biz.sa.sm.service;

import java.util.List;

import cpa.biz.sa.sm.model.ReEntschManageVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ReEntschManageService.java
* 클래스 설명 : 재입교관리
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
public interface ReEntschManageService {
	/**
	* Author : 김동규
	* 재입교 관리 목록을 조회한다.
	*
	* @param reEntschManageVO - 조회할 정보가 담긴 reEntschManageVO
	* @return "/common/bbs/selectBbsManageList"
	* @exception Exception
	*/
	public List<ReEntschManageVO> searchReEntschManageList(ReEntschManageVO reEntschManageVO) throws Exception;
}
