package cpa.biz.sm.sm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cpa.biz.sm.sm.dao.LockProcessStdntDAO;
import cpa.biz.sm.sm.service.LockProcessStdntService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LockProcessStdntServiceImpl.java
* 클래스 설명 : 학생계 잠김처리학생
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

@Service("lockProcessStdntService")
public class LockProcessStdntServiceImpl extends EgovAbstractServiceImpl implements LockProcessStdntService {

	@Resource(name = "lockProcessStdntDAO")
	private LockProcessStdntDAO lockProcessStdntDAO;
	
}
