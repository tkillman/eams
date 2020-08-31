package cpa.biz.sm.lm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cpa.biz.sm.lm.dao.LvlhCchProfMngDAO;
import cpa.biz.sm.lm.service.LvlhCchProfMngService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* LvlhCchProfMngServiceImpl.java
* 클래스 설명 : 학생계 생활지도교수관리
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

@Service("lvlhCchProfMngService")
public class LvlhCchProfMngServiceImpl extends EgovAbstractServiceImpl implements LvlhCchProfMngService {

	@Resource(name = "lvlhCchProfMngDAO")
	private LvlhCchProfMngDAO lvlhCchProfMngDAO;
	
}
