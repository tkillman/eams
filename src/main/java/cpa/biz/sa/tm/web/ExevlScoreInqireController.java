package cpa.biz.sa.tm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.tm.model.ExevlScoreInqireVO;
import cpa.biz.sa.tm.service.ExevlScoreInqireService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ExevlScoreInqireController.java
* 클래스 설명 : 수행점수조회
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
public class ExevlScoreInqireController {
	
	@Autowired
	ExevlScoreInqireService exevlScoreInqireService;
	
	/**
	* Author : 김동규
	* 수행점수조회 목록조회한다.
	*
	* @param ExevlScoreInqireVO - 조회할 정보가 담긴 ExevlScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String searchExevlScoreInqireList(ExevlScoreInqireVO exevlScoreInqireVO) {
		
		exevlScoreInqireService.searchExevlScoreInqireList(exevlScoreInqireVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 수행점수조회 수정한다.
	*
	* @param ExevlScoreInqireVO - 조회할 정보가 담긴 ExevlScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String updateExevlScoreInqire(ExevlScoreInqireVO exevlScoreInqireVO) {
		exevlScoreInqireService.updateExevlScoreInqire(exevlScoreInqireVO);
		return null;
	}
	
	
	/**
	* Author : 김동규
	* 수행점수조회 엑셀다운로드한다.
	*
	* @param ExevlScoreInqireVO - 조회할 정보가 담긴 ExevlScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String writeExevlScoreInqireExcel(ExevlScoreInqireVO exevlScoreInqireVO) {
		return null;
	}
}
