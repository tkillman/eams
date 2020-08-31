package cpa.biz.sm.sm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cpa.biz.sm.sm.dao.IntrstStdntMngDAO;
import cpa.biz.sm.sm.service.IntrstStdntMngService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* IntrstStdntMngServiceImpl.java
* 클래스 설명 : 학생계 관심교육생 관리
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

@Service("intrstStdntMngService")
public class IntrstStdntMngServiceImpl extends EgovAbstractServiceImpl implements IntrstStdntMngService {

	@Resource(name = "intrstStdntMngDAO")
	private IntrstStdntMngDAO intrstStdntMngDAO;
	
}
