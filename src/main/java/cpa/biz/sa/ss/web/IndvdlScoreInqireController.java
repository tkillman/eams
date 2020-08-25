package cpa.biz.sa.ss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ss.model.IndvdlScoreInqireSearchVO;
import cpa.biz.sa.ss.model.IndvdlScoreInqireVO;
import cpa.biz.sa.ss.service.IndvdlScoreInqireService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* IndvdlScoreInqireController.java
* 클래스 설명 : 개인별점수조회
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
public class IndvdlScoreInqireController {
	
	@Autowired
	IndvdlScoreInqireService indvdlScoreInqireService;
	
	/**
	* Author : 김동규
	* 개인별점수조회 조회한다.
	*
	* @param IndvdlScoreInqireVO - 조회할 정보가 담긴 IndvdlScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String searchIndvdlScoreInqire(IndvdlScoreInqireSearchVO indvdlScoreInqireSearchVO) {
		indvdlScoreInqireService.searchIndvdlScoreInqire(indvdlScoreInqireSearchVO);
		return null;
	}
}
