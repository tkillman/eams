package cpa.biz.sa.tm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.sa.tm.model.SubjctProfExevlVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SubjctProfExevlDAO.java
* 클래스 설명 : 학과교수별수행평가
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
@Repository("SubjctProfExevlDAO")
public class SubjctProfExevlDAO extends EgovComAbstractDAO{

	public List<SubjctProfExevlVO> selectSubjctProfExevlAjaxList(SubjctProfExevlVO subjctProfExevlVO) {
		return selectList("SubjctProfExevlDAO.selectSubjctProfExevlAjaxList", subjctProfExevlVO);
	}
}
