package cpa.biz.sa.ss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ss.model.SylbsScoreInqireSearchVO;
import cpa.biz.sa.ss.model.SylbsScoreInqireVO;
import cpa.biz.sa.ss.service.SylbsScoreInqireService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SylbsScoreInqireController.java
* 클래스 설명 : 요목별점수알림표
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
public class SylbsScoreInqireController {
	
	@Autowired
	SylbsScoreInqireService sylbsScoreInqireService;
	
	/**
	* Author : 김동규
	* 요목별점수알림표 목록조회한다.
	*
	* @param sylbsScoreInqireVO - 조회할 정보가 담긴 sylbsScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String searchSylbsScoreInqireAjaxList(SylbsScoreInqireSearchVO sylbsScoreInqireSearchVO) throws Exception {
		
		sylbsScoreInqireService.searchSylbsScoreInqireAjaxList(sylbsScoreInqireSearchVO);
		return null;
	}
	
	
	/**
	* Author : 김동규
	* 요목별점수알림표 엑셀다운로드한다.
	*
	* @param sylbsScoreInqireVO - 조회할 정보가 담긴 sylbsScoreInqireVO
	* @return String
	* @exception Exception
	*/
	public String writeSylbsScoreInqireExcel(SylbsScoreInqireVO sylbsScoreInqireVO) {
		return null;
	}
}
