package cpa.biz.sa.sm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.sm.model.ReEntschManageVO;
import cpa.biz.sa.sm.service.ReEntschManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ReEntschManageController.java
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
@Controller
public class ReEntschManageController {
	
	@Autowired
	ReEntschManageService reEntschManageService;
	
	/**
	* Author : 김동규
	* 퇴교생 목록을 조회한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 BbsManageVO
	* @param SessionVO
	* @return "/common/bbs/selectBbsManageList"
	* @exception Exception
	*/
	public String searchReEntschManageList(ReEntschManageVO reEntschManageVO) throws Exception {
		reEntschManageService.searchReEntschManageList(reEntschManageVO);
		return "/cpa/biz/co/sm/web/stdntInfoHist";
	}
	
	
}
