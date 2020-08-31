package cpa.biz.ad.ms.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.ad.ms.model.PosblIpManageVO;
import cpa.biz.ad.ms.service.PosblIpManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* posblIpManageController.java
* 클래스 설명 : 접속가능IP대역관리
* 		
* @author 송광진
* @since 2020.08.26
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.26                   송광진	최초 생성
* </pre>
*/
@Controller
public class PosblIpManageController {
	
	@Autowired
	PosblIpManageService posblIpManageService;
	
	/**
	* Author : 송광진
	* 접속가능IP대역관리 목록 화면을 호출한다.
	*
	* @param
	* @return "ad/ms/posblIpManageForm"
	* @exception Exception
	*/
	public String posblIpManageForm() throws Exception {		
		return "ad/ms/posblIpManageForm";
	}
	
	/**
	* Author : 송광진
	* 접속가능IP대역관리 목록을 조회한다.
	*
	* @param posblIpManageVO - 조회할 정보가 담긴 posblIpManageVO
	* @return null
	* @exception Exception
	*/
	public ModelAndView searchPosblIpManageAjaxList(HttpServletRequest request,   HttpServletResponse response, @RequestBody PosblIpManageVO posblIpManageVO) throws Exception {		
		ModelAndView modelandview = new ModelAndView();
		//List<PosblIpManageVO> sList = posblIpManageService.searchPosblIpManageAjaxList(posblIpManageVO);
		//modelandview.addObject("sList", sList);  
		//modelandview.setViewName("ajaxView");
		return null;
	}
}
