package cpa.biz.sa.ts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ts.model.LastScoreUpdtSearchVO;
import cpa.biz.sa.ts.model.LastScoreUpdtVO;
import cpa.biz.sa.ts.service.LastScoreUpdtService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LastScoreUpdtController.java
* 클래스 설명 : 최종점수수정
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
public class LastScoreUpdtController {
	
	@Autowired
	LastScoreUpdtService lastScoreUpdtService;
	
	/**
	* Author : 김동규
	* 최종점수수정 조회한다.
	*
	* @param LastScoreUpdtVO - 조회할 정보가 담긴 LastScoreUpdtVO
	* @return String
	* @exception Exception
	*/
	public String searchLastScoreUpdt(LastScoreUpdtSearchVO lastScoreUpdtSearchVO) {
		
		lastScoreUpdtService.searchLastScoreUpdt(lastScoreUpdtSearchVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 최종점수수정 수정한다.
	*
	* @param LastScoreUpdtVO - 조회할 정보가 담긴 LastScoreUpdtVO
	* @return String
	* @exception Exception
	*/
	public String updateLastScoreUpdt(LastScoreUpdtVO LastScoreUpdtVO) throws Exception {
		
		lastScoreUpdtService.updateLastScoreUpdt(LastScoreUpdtVO);
		return null;
	}
	
	/**
	* Author : 김동규
	* 석차를 재산정한다.
	*
	* @param LastScoreUpdtVO - 조회할 정보가 담긴 LastScoreUpdtVO
	* @return String
	* @exception Exception
	*/
	public String updateRankLastScoreUpdt(LastScoreUpdtVO LastScoreUpdtVO) throws Exception{
		lastScoreUpdtService.updateRankLastScoreUpdt(LastScoreUpdtVO);
		
		return null;
	}
	
	
}
