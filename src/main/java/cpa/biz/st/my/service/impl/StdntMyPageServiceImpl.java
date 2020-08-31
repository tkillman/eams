package cpa.biz.st.my.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cpa.biz.st.my.dao.StdntMyPageDAO;
import cpa.biz.st.my.service.StdntMyPageService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMyPageServiceImpl.java
* 클래스 설명 : 교육생 마이페이지
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

@Service("stdntMyPageService")
public class StdntMyPageServiceImpl extends EgovAbstractServiceImpl implements StdntMyPageService {

	@Resource(name = "stdntMyPageDAO")
	private StdntMyPageDAO stdntMyPageDAO;
	
}
