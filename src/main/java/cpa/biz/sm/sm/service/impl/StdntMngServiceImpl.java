package cpa.biz.sm.sm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cpa.biz.sm.sm.dao.StdntMngDAO;
import cpa.biz.sm.sm.model.StdntMngVO;
import cpa.biz.sm.sm.service.StdntMngService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMngServiceImpl.java
* 클래스 설명 : 학생계 학생조회
* 		
* @author 박태준
* @since 2020.08.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	           수정내용
* -------        --------    --------------------------
* 2020.08.20     tjpark      최초 생성
* </pre>
*/

@Service("stdntMngService")
public class StdntMngServiceImpl extends EgovAbstractServiceImpl implements StdntMngService {

	@Resource(name = "stdntMngDAO")
	private StdntMngDAO stdntMngDAO;

	
}
