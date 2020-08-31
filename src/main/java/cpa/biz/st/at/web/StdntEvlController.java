package cpa.biz.st.at.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cpa.biz.co.ma.service.MainService;
import cpa.biz.st.at.service.StdntEvlService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntEvlMngController.java
* 클래스 설명 : 교육생 평가
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
public class StdntEvlController {

	@Resource(name = "stdntEvlService")
	private StdntEvlService stdntEvlService;
	
}
