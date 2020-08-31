package cpa.biz.sa.tm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.tm.model.ApyexmPoliceScreVO;
import cpa.biz.sa.tm.service.ApyexmPoliceScreService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ApyexmPoliceScreController.java
* 클래스 설명 : 응시청별성적일람표
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
public class ApyexmPoliceScreController {
	
	@Autowired
	ApyexmPoliceScreService apyexmPoliceScreService;
	
	/**
	* Author : 김동규
	* 응시청별성적일람표 목록조회한다.
	*
	* @param ApyexmPoliceScreVO - 조회할 정보가 담긴 ApyexmPoliceScreVO
	* @return String
	* @exception Exception
	*/
	public String searchApyexmPoliceScreAjaxList(ApyexmPoliceScreVO apyexmPoliceScreVO) {
		apyexmPoliceScreService.searchApyexmPoliceScreAjaxList(apyexmPoliceScreVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 응시청별성적일람표 엑셀다운로드한다.
	*
	* @param ApyexmPoliceScreVO - 조회할 정보가 담긴 ApyexmPoliceScreVO
	* @return String
	* @exception Exception
	*/
	public String writeApyexmPoliceScre(ApyexmPoliceScreVO apyexmPoliceScreVO) {
		
		return null;
	}
}
