package cpa.biz.st.my.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import cpa.biz.st.my.service.StdntMngCurStatService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMngCurStatController.java
* 클래스 설명 : 교육생 내 관리현황
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
public class StdntMngCurStatController {
	
	@Resource(name = "stdntMngCurStatService")
	private StdntMngCurStatService stdntMngCurStatService;
	
}
