package cpa.biz.sa.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.sm.dao.StdntInfoHistDAO;
import cpa.biz.sa.sm.model.StdntInfoHistVO;
import cpa.biz.sa.sm.service.StdntInfoHistService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntInfoHistServiceImpl.java
* 클래스 설명 : 교육생정보변경내역
* 		
* @author 송광진
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   송광진	최초 생성
* </pre>
*/
@Service("StdntInfoHistService")
public class StdntInfoHistServiceImpl implements StdntInfoHistService {
	
	@Autowired
	StdntInfoHistDAO stdntInfoHistDAO;
	
	@Override
	public List<StdntInfoHistVO> searchStdntInfoHistList(StdntInfoHistVO stdntInfoHistVO) throws Exception {
		stdntInfoHistDAO.selectList("StdntInfoHistDAO.searchStdntInfoHistList", stdntInfoHistVO);
		return null;
	}

}
