package cpa.biz.sa.tm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.tm.model.GnrlzScoreInqireVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* GnrlzScoreInqireDAO.java
* 클래스 설명 : 종합점수조회
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
@Repository("GnrlzScoreInqireDAO")
public class GnrlzScoreInqireDAO extends EgovComAbstractDAO{
	
	/**
	* Author : 김동규
	* 종합점수조회 목록을 조회한다.
	*
	* @param GnrlzScoreInqireVO - 조회할 정보가 담긴 GnrlzScoreInqireVO
	* @return List<GnrlzScoreInqireVO>
	* @exception Exception
	*/
	public List<GnrlzScoreInqireVO> selectGnrlzScoreInqireAjaxList(GnrlzScoreInqireVO gnrlzScoreInqireVO){
		return selectList("GnrlzScoreInqireDAO.selectGnrlzScoreInqireAjaxList");
	}	
}
