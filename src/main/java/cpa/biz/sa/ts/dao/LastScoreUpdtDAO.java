package cpa.biz.sa.ts.dao;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.ts.model.LastScoreUpdtSearchVO;
import cpa.biz.sa.ts.model.LastScoreUpdtVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LastScoreUpdtDAO.java
* 클래스 설명 : 최종점수수정
* 		
* @author 김동규
* @since 2020.08.24
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.24                   김동규	최초 생성
* </pre>
*/
@Repository("LastScoreUpdtDAO")
public class LastScoreUpdtDAO extends EgovComAbstractDAO{
	
	public LastScoreUpdtVO searchLastScoreUpdt(LastScoreUpdtSearchVO lastScoreUpdtSearchVO) {
		return selectOne("LastScoreUpdtDAO.searchLastScoreUpdt", lastScoreUpdtSearchVO);
	}
}
