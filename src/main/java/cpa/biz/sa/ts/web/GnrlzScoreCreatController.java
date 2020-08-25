package cpa.biz.sa.ts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ts.model.GnrlzScoreCreatVO;
import cpa.biz.sa.ts.service.GnrlzScoreCreatService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* GnrlzScoreCreatController.java
* 클래스 설명 : 종합점수생성
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
public class GnrlzScoreCreatController {
	
	@Autowired
	GnrlzScoreCreatService gnrlzScoreCreatService;
	
	/**
	* Author : 김동규
	* 종합점수생성 조회한다.
	*
	* @param GnrlzScoreCreatVO - 조회할 정보가 담긴 GnrlzScoreCreatVO
	* @return String
	* @exception Exception
	*/
	public String searchGnrlzScoreCreatForm(GnrlzScoreCreatVO gnrlzScoreCreatVO) {
		
		return null;
	}
	
	/**
	* Author : 김동규
	* 종합점수생성 수정한다.
	*
	* @param GnrlzScoreCreatVO - 조회할 정보가 담긴 GnrlzScoreCreatVO
	* @return String
	* @exception Exception
	*/
	public String updateGnrlzScoreCreat(GnrlzScoreCreatVO gnrlzScoreCreatVO) {
		gnrlzScoreCreatService.updateGnrlzScoreCreat(gnrlzScoreCreatVO);
		return null;
	}
}
