package cpa.biz.sa.tm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.tm.model.GrdtnLackCurstatSearchVO;
import cpa.biz.sa.tm.model.GrdtnLackCurstatVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* GrdtnLackCurstatDAO.java
* 클래스 설명 : 졸업요건미달자현황
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
@Repository("GrdtnLackCurstatDAO")
public class GrdtnLackCurstatDAO extends EgovComAbstractDAO{

	public List<GrdtnLackCurstatVO> selectGrdtnLackCurstatList(GrdtnLackCurstatSearchVO grdtnLackCurstatSearchVO){
		return selectList("GrdtnLackCurstatDAO.selectGrdtnLackCurstatList", grdtnLackCurstatSearchVO);
	}
	
}
