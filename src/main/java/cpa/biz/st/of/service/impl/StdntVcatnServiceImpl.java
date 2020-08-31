package cpa.biz.st.of.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cpa.biz.st.of.dao.StdntVcatnDAO;
import cpa.biz.st.of.service.StdntVcatnService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntVcatnServiceImpl.java
* 클래스 설명 : 교육생 외출/외박/휴가
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

@Service("stdntVcatnService")
public class StdntVcatnServiceImpl extends EgovAbstractServiceImpl implements StdntVcatnService {
	
	@Resource(name="stdntVcatnDAO")
	private StdntVcatnDAO stdntVcatnDAO;
	
}
