package cpa.biz.st.of.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import cpa.biz.st.of.service.StdntVcatnService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntVcatnController.java
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

@Controller
public class StdntVcatnController {

	@Resource(name = "stdntVcatnService")
	private StdntVcatnService stdntVcatnService;
	
}
