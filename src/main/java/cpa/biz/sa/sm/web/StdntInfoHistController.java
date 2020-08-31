package cpa.biz.sa.sm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.sm.model.StdntInfoHistVO;
import cpa.biz.sa.sm.service.StdntInfoHistService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntInfoHistController.java
* 클래스 설명 : 교육생정보변경내역
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
@Controller
public class StdntInfoHistController {
	
	@Autowired
	StdntInfoHistService stdntInfoHistService;
	
	/**
	* Author : 송광진
	* 교육생정보변경내역 목록을 조회한다.
	*
	* @param StdntInfoHistVO - 조회할 정보가 담긴 StdntInfoHistVO
	* @return "/common/bbs/selectBbsManageList"
	* @exception Exception
	*/
	public String searchStdntInfoHistList(StdntInfoHistVO stdntInfoHistVO) throws Exception {
		stdntInfoHistService.searchStdntInfoHistList(stdntInfoHistVO);
		return "/cpa/biz/co/sm/web/stdntInfoHist";
	}
}
