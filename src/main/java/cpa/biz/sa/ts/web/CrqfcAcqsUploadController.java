package cpa.biz.sa.ts.web;

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
* CrqfcAcqsUploadController.java
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
public class CrqfcAcqsUploadController {
	
	private static final Logger Logger = LoggerFactory.getLogger(CrqfcAcqsUploadController.class);
	
	@Autowired
	CrqfcAcqsUploadService crqfcAcqsUploadService;
	
	@Autowired
	private DefaultBeanValidator beanValidator;
	
	/**
	* Author : 김동규
	* 자격증취득내역업로드 조회한다.
	*
	* @param CrqfcAcqsUploadVO - 조회할 정보가 담긴 CrqfcAcqsUploadVO
	* @return String
	* @exception Exception
	*/
	@RequestMapping("/sa/ts/searchCrqfcAcqsUploadForm.do")
	public String searchCrqfcAcqsUploadForm(CrqfcAcqsUploadVO crqfcAcqsUploadVO) {
		
		return "sa/ts/crqfcAcqsUploadForm";
	}
	
	
	/**
	* Author : 김동규
	* 자격증취득내역업로드 수정한다.
	*
	* @param CrqfcAcqsUploadVO - 조회할 정보가 담긴 CrqfcAcqsUploadVO
	* @return String
	* @exception Exception
	*/
	@RequestMapping("/sa/ts/updateCrqfcAcqsUploadExcel.do")
	public String updateCrqfcAcqsUploadExcel(CrqfcAcqsUploadVO crqfcAcqsUploadVO
											, BindingResult bindingResult
											, MultipartHttpServletRequest mptRequest
											, Model model) {
		
		boolean isSuccess = false;
		//beanValidator.validate(crqfcAcqsUploadVO, bindingResult);
		
		Logger.debug("hello world");
		//crqfcAcqsUploadService.updateCrqfcAcqsUploadExcel(crqfcAcqsUploadVO);
		
		crqfcAcqsUploadService.validate(crqfcAcqsUploadVO, bindingResult);
		
		if (!bindingResult.hasErrors()) {
			isSuccess = true;
		}
		
		model.addAttribute("isSuccess", isSuccess);
		return "sa/ts/crqfcAcqsUploadForm";
	}
	
	/**
	* Author : 김동규
	* 자격증취득내역업로드 엑셀다운로드한다.
	*
	* @param CrqfcAcqsUploadVO - 조회할 정보가 담긴 CrqfcAcqsUploadVO
	* @return String
	* @exception Exception
	*/
	@RequestMapping("/sa/ts/writeCrqfcAcqsSampleUploadExcel.do")
	public String writeCrqfcAcqsSampleUploadExcel(CrqfcAcqsUploadVO crqfcAcqsUploadVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String filePath = "C:\\Users\\dkkim\\git\\eams\\src\\main\\webapp\\upload\\자격증엑셀업로드샘플.xlsx";
		
		request.setAttribute("downFile", filePath);
		request.setAttribute("orgFileName", "자격증엑셀업로드샘플.xlsx");
		request.setAttribute("orginFile", "자격증엑셀업로드샘플.xlsx");
		
		EgovFileMngUtil.downFile(request, response);
		
		return null;
	}
	
	
	/**
	* Author : 김동규
	* 자격증취득내역업로드 조회한다.
	*
	* @param CrqfcAcqsUploadVO - 조회할 정보가 담긴 CrqfcAcqsUploadVO
	* @return String
	* @exception Exception
	*/
	@RequestMapping("/jasmin/sa/ts/searchCrqfcAcqsUploadForm.do")
	public String searchCrqfcAcqsUploadFormJasmine(CrqfcAcqsUploadVO crqfcAcqsUploadVO) {
		Logger.debug("hello world");
		
		return "sa/ts/crqfcAcqsUploadFormJasmine";
	}
}
