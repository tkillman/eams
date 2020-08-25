package cpa.biz.sa.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.tm.dao.GrdtnLackCurstatDAO;
import cpa.biz.sa.tm.model.GrdtnLackCurstatVO;
import cpa.biz.sa.tm.service.GrdtnLackCurstatService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* GrdtnLackCurstatServiceImpl.java
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
@Service("GrdtnLackCurstatService")
public class GrdtnLackCurstatServiceImpl implements GrdtnLackCurstatService {
	
	@Autowired
	GrdtnLackCurstatDAO grdtnLackCurstatDAO;
	
	@Override
	public List<GrdtnLackCurstatVO> searchGrdtnLackCurstatList(GrdtnLackCurstatVO grdtnLackCurstatVO) {
		grdtnLackCurstatDAO.selectList("GrdtnLackCurstatDAO.searchGrdtnLackCurstatList", grdtnLackCurstatVO);
		return null;
	}

}
