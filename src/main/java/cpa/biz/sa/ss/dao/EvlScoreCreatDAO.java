package cpa.biz.sa.ss.dao;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.ss.model.EvlScoreCreatVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlScoreCreatDAO.java
* 클래스 설명 : 평가과목점수생성(평가)
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
@Repository("EvlScoreCreatDAO")
public class EvlScoreCreatDAO extends EgovComAbstractDAO{
	/**
	* Author : 김동규
	*  평가과목점수생성(평가) 수정한다.
	*
	* @param EvlScoreCreatVO - 조회할 정보가 담긴 EvlScoreCreatVO
	* @return int
	* @exception Exception
	*/
	public int updateEvlScoreCreat(EvlScoreCreatVO evlScoreCreatVO) {
		return update("EvlScoreCreatDAO.updateEvlScoreCreat", evlScoreCreatVO);
	}
}
