package cpa.biz.sa.ts.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cpa.biz.sa.ts.model.EvlScoreUploadVO;
import cpa.biz.sa.ts.service.EvlScoreUploadService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlScoreUploadController.java
* 클래스 설명 : 평가항목점수업로드
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
public class EvlScoreUploadController {
	
	private static final Logger Logger = LoggerFactory.getLogger(EvlScoreUploadController.class);
	
	@Autowired
	EvlScoreUploadService evlScoreUploadService;
	
	/**
	* Author : 김동규
	* 평가항목점수업로드 조회한다.
	*
	* @param EvlScoreUploadVO - 조회할 정보가 담긴 EvlScoreUploadVO
	* @return String
	* @exception Exception
	*/
	public String searchEvlScoreUploadForm(EvlScoreUploadVO evlScoreUploadVO) {
		
		return null;
	}
	
	/**
	* Author : 김동규
	* 평가항목점수업로드 수정한다.
	*
	* @param EvlScoreUploadVO - 조회할 정보가 담긴 EvlScoreUploadVO
	* @return String
	* @exception Exception
	*/
	public String updateEvlScoreUploadExcel(EvlScoreUploadVO evlScoreUploadVO) throws Exception {
		evlScoreUploadService.updateEvlScoreUploadExcel(evlScoreUploadVO);
		return null;
	}
	
}
