package cpa.biz.sa.ss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ss.model.ReEvlScoreCreatVO;
import cpa.biz.sa.ss.service.ReEvlScoreCreatService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ReEvlScoreCreatController.java
* 클래스 설명 : 평가과목점수생성(재평가)
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
public class ReEvlScoreCreatController {
	
	@Autowired
	ReEvlScoreCreatService reEvlScoreCreatService;
	
	/**
	* Author : 김동규
	* 평가과목점수생성(재평가) 조회한다.
	*
	* @param ReEvlScoreCreatVO - 조회할 정보가 담긴 ReEvlScoreCreatVO
	* @return String
	* @exception Exception
	*/
	public String searchReEvlScoreCreatForm(ReEvlScoreCreatVO reEvlScoreCreatVO) {
		
		return null;
	}
	
	/**
	* Author : 김동규
	* 평가과목점수생성(재평가) 수정한다.
	*
	* @param ReEvlScoreCreatVO - 조회할 정보가 담긴 ReEvlScoreCreatVO
	* @return String
	* @exception Exception
	*/
	public String updateReEvlScoreCreat(ReEvlScoreCreatVO reEvlScoreCreatVO) throws Exception {
		
		reEvlScoreCreatService.updateReEvlScoreCreat(reEvlScoreCreatVO);
		return null;
		
	}
	
}
