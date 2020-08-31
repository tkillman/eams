package cpa.biz.sa.ts.service;

import java.util.List;

import org.springframework.validation.BindingResult;

import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnIemInfoVO;
import cpa.biz.sa.ts.model.CmmnTnRealmInfoVO;
import cpa.biz.sa.ts.model.CmmnTnSbjectInfoVO;
import cpa.biz.sa.ts.model.EvlScoreUploadVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* EvlScoreUploadService.java
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
public interface EvlScoreUploadService {
	
	/**
	* Author : 김동규
	* 평가항목점수업로드 수정한다.
	*
	* @param EvlScoreUploadVO - 조회할 정보가 담긴 EvlScoreUploadVO
	* @return int
	* @exception Exception
	*/
	public int updateEvlScoreUploadExcel(EvlScoreUploadVO evlScoreUploadVO) throws Exception;
	
	/**
	* Author : 김동규
	* 기수 목록조회한다.
	*
	* @return List<CmmnTnEntschInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnEntschInfoVO> searchTnEntschInfoAjaxList();
	
	/**
	* Author : 김동규
	* 분야 목록조회한다.
	*
	* @return List<CmmnTnIemInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnIemInfoVO> searchTnIemInfoAjaxList();
	
	/**
	* Author : 김동규
	* 항목 목록조회한다.
	*
	* @return List<CmmnTnRealmInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnRealmInfoVO> searchTnRealmInfoAjaxList();
	
	/**
	* Author : 김동규
	* 과목 목록조회한다.
	*
	* @return List<CmmnTnSbjectInfoVO>
	* @exception Exception
	*/
	public List<CmmnTnSbjectInfoVO> searchTnSbjectInfoAjaxList();
	
	/**
	* Author : 김동규
	* 게시판의 목록을 조회한다.
	*
	* @param EvlScoreUploadVO - 조회할 정보가 담긴 EvlScoreUploadVO
	* @param BindingResult - 에러 BindingResult
	* @return void
	* @exception Exception
	*/
	public void validate(EvlScoreUploadVO evlScoreUploadVO, BindingResult bindingResult);
}
