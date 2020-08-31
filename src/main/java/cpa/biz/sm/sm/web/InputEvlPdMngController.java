package cpa.biz.sm.sm.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cpa.biz.sm.sm.model.InputEvlPdMngVO;
import cpa.biz.sm.sm.service.InputEvlPdMngService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* InputEvlPdMngController.java
* 클래스 설명 : 학생계 입력기간설정
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
public class InputEvlPdMngController {
	
	@Resource(name = "inputEvlPdMngService")
	private InputEvlPdMngService inputEvlPdMngService;
	
}
