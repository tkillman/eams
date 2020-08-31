package cpa.biz.sa.tm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.tm.model.ExevlScoreInqireVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;


/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ExevlScoreInqireDAO.java
* 클래스 설명 : 수행점수조회
* 		
* @author 김동규
* @since 2020.08.26
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.26                   김동규	최초 생성
* </pre>
*/
@Repository("ExevlScoreInqireDAO")
public class ExevlScoreInqireDAO extends EgovComAbstractDAO{

	public List<ExevlScoreInqireVO> selectExevlScoreInqireAjaxList(ExevlScoreInqireVO exevlScoreInqireVO){
		return selectList("ExevlScoreInqireDAO.selectExevlScoreInqireAjaxList", exevlScoreInqireVO);
	}
}
