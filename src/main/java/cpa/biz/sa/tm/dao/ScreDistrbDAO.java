package cpa.biz.sa.tm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.tm.model.ScreDistrbSearchVO;
import cpa.biz.sa.tm.model.ScreDistrbVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScreDistrbDAO.java
* 클래스 설명 : 성적분포표
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
@Repository("ScreDistrbDAO")
public class ScreDistrbDAO extends EgovComAbstractDAO{

	public List<ScreDistrbVO> selectScreDistrbAjaxList(ScreDistrbSearchVO screDistrbSearchVO){
		return selectList("ScreDistrbDAO.selectScreDistrbAjaxList", screDistrbSearchVO);
	}
}
