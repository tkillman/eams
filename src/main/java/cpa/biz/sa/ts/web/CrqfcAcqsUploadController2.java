package cpa.biz.sa.ts.web;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import cpa.biz.sa.ts.model.CmmnJobUtilSearchVO;
import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnStdntInfoVO;
import cpa.biz.sa.ts.model.CpaTeVO;
import cpa.biz.sa.ts.model.CrqfcAcqsUploadVO;
import cpa.biz.sa.ts.model.CrqfcAcqsUploadVO2;
import cpa.biz.sa.ts.service.CmmnJobUtilService;
import cpa.biz.sa.ts.service.CrqfcAcqsUploadService2;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadController2.java
* 클래스 설명 : 게시판관리 Business
* 		
* @author 김동규
* @since 2020.08.28
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.28                   김동규	최초 생성
* </pre>
*/
@Controller
public class CrqfcAcqsUploadController2 {
	
	private static final Logger Logger = LoggerFactory.getLogger(CrqfcAcqsUploadController2.class);
	
	@Autowired
	CrqfcAcqsUploadService2 crqfcAcqsUploadService2;
	
	@Autowired
	CmmnJobUtilService cmmnJobUtilService;
	
	/**
	* Author : 김동규
	* 자격증취득내역업로드 조회한다.
	*
	* @param CrqfcAcqsUploadVO - 조회할 정보가 담긴 CrqfcAcqsUploadVO
	* @return String
	* @exception Exception
	*/
	@RequestMapping("/sa/ts/searchCrqfcAcqsUploadForm.do")
	public String searchCrqfcAcqsUploadForm(CrqfcAcqsUploadVO crqfcAcqsUploadVO, Model model) {

		return "sa/ts/crqfcAcqsUpload2";
	}
	
	@RequestMapping("/sa/ts/updateCrqfcAcqsUploadExcel.do")
	public String updateCrqfcAcqsUploadExcel(@RequestBody Map<String, Object> crqfcAcqsUploadVO) {
		
		// 입교정보 가져오기
		CmmnTnEntschInfoVO cmmnTnEntschInfoVO = cmmnJobUtilService.searchTnEntschInfo(CmmnJobUtilSearchVO
																						.build()
																						.cno(Integer.parseInt((String)crqfcAcqsUploadVO.get("cno")))//기수
																						.crseCode((String)crqfcAcqsUploadVO.get("crseCode"))//과정
																						.year((String)crqfcAcqsUploadVO.get("year")));//연도
		
		// 학생정보리스트 가져오기
		List<CmmnTnStdntInfoVO> cmmnTnStdntInfoVOList = cmmnJobUtilService.searchTnStdntInfoAjaxList(CmmnJobUtilSearchVO.build().entschUno(cmmnTnEntschInfoVO.getEntschUno()));
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			//List<CpaTeVO> excelDataList = crqfcAcqsUploadVO.get("excelFileJsonData");
			
			List<CpaTeVO> excelDataList = Arrays.asList(mapper.readValue(crqfcAcqsUploadVO.get("excelFileJsonData").toString(), CpaTeVO[].class));
			
			//학생고유번호설정
			crqfcAcqsUploadService2.setStdntNoInfoToExcelList(excelDataList, cmmnTnStdntInfoVOList);
			//TODO db 업데이트
			crqfcAcqsUploadService2.updateCrqfcAcqsUploadExcel(excelDataList);
		} catch (Exception e) {
			Logger.debug(e.getMessage());
		}
		return "jsonView";
	}
	
	@RequestMapping("/sa/ts/updateCrqfcAcqsUploadExcel2.do")
	public String updateCrqfcAcqsUploadExcel2(@RequestBody CrqfcAcqsUploadVO2 crqfcAcqsUploadVO2) {
		
		Logger.debug(crqfcAcqsUploadVO2.getExcelFileJsonData().toString());
		
		return "jsonView";
	}
}
