package cpa.biz.sa.tm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.tm.model.ScreDistrbSearchVO;
import cpa.biz.sa.tm.model.ScreDistrbVO;
import cpa.biz.sa.tm.service.ScreDistrbService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScreDistrbController.java
* 클래스 설명 : 성적분포표
* 		
* @author 김동규
* @since 2020.08.19
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.19                   김동규	최초 생성
* </pre>
*/
@Controller
public class ScreDistrbController {
	
	@Autowired
	ScreDistrbService screDistrbService;
	
	/**
	* Author : 김동규
	* 성적분포표 목록조회한다.
	*
	* @param ScreDistrbSearchVO - 조회할 정보가 담긴 ScreDistrbSearchVO
	* @return String
	* @exception Exception
	*/
	public String searchScreDistrbAjaxList(ScreDistrbSearchVO screDistrbSearchVO) {
		screDistrbService.searchScreDistrbAjaxList(screDistrbSearchVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 게시판의 목록을 조회한다.
	*
	* @param BbsManageVO - 조회할 정보가 담긴 BbsManageVO
	* @return String
	* @exception Exception
	*/
	public String writeScreDistrbExcel(ScreDistrbVO screDistrbServiceVO) {
		
		return null;
	}
}
