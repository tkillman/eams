package jasmine.cpa.biz.sa.ts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springmodules.validation.commons.DefaultBeanValidator;

import cpa.biz.sa.ts.model.CrqfcAcqsUploadVO;
import cpa.biz.sa.ts.service.CrqfcAcqsUploadService;
import cpa.cmm.service.EgovFileMngUtil;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadJasmineController.java
* 클래스 설명 : 자격증취득내역업로드
* 		
* @author 김동규
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   김동규	최초 생성
* </pre>
*/
@Controller
public class CrqfcAcqsUploadJasmineController {
	
	private static final Logger Logger = LoggerFactory.getLogger(CrqfcAcqsUploadJasmineController.class);
	
	@Autowired
	CrqfcAcqsUploadService crqfcAcqsUploadService;
	
	@Autowired
	private DefaultBeanValidator beanValidator;

	
}
