package cpa.biz.st.my.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.st.my.model.StdntMyPageVO;
import cpa.biz.st.my.service.StdntMyPageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntMyPageController.java
* 클래스 설명 : 교육생 마이페이지
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
@RequestMapping(value = "/st/my")
public class StdntMyPageController {
	
	@Resource(name = "stdntMyPageService")
	private StdntMyPageService stdntMyPageService;
	
	//TODO requestMapping
	/**
	* Author : 박태준
	* 마이페이지 화면을 호출한다.
	*
	* @param StdntMyPageVO - 조회할 정보가 담긴 StdntMyPageVO
	* @return "/cpa/st/my/stdntMyPage"
	* @exception Exception
	*/
	@RequestMapping(value = "/searchStdntMyPageForm.do")
	public String searchStdntMyPageForm(@ModelAttribute("stdntMyPageVO") StdntMyPageVO stdntMyPageVO) throws Exception {
	
		return "/st/my/stdntMyPage";
	}
	
	//TODO requestMapping
	/**
	* Author : 박태준
	* 비밀번호 변경 팝업을 호출한다.
	*
	* @param StdntMyPageVO - 조회할 정보가 담긴 StdntMyPageVO
	* @return "/cpa/st/my/passwordChange"
	* @exception Exception
	*/
	@RequestMapping(value = "/searchPasswordChangeForm.do")
	public String searchPasswordChangeForm(@ModelAttribute("stdntMyPageVO") StdntMyPageVO stdntMyPageVO) throws Exception {
	
		return "/st/my/passwordChange";
	}
	
	//TODO requestMapping
	/**
	* Author : 박태준
	* 비밀번호 변경한다.
	*
	* @param StdntMyPageVO - 조회할 정보가 담긴 StdntMyPageVO
	* @return "/cpa/st/my/passwordChange"
	* @exception Exception
	*/
	@RequestMapping(value = "/updatePasswordChange.do")
	public ModelAndView updatePasswordChange(@RequestBody StdntMyPageVO stdntMyPageVO) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		return modelAndView;
	}
	
	//TODO requestMapping
	/**
	* Author : 박태준
	* 계좌번호 변경 팝업을 호출한다.
	*
	* @param StdntMyPageVO - 조회할 정보가 담긴 StdntMyPageVO
	* @return "/cpa/st/my/acnutnoChange"
	* @exception Exception
	*/
	@RequestMapping(value = "/searchAcnutnoChangeForm.do")
	public String searchAcnutnoChangeForm(@ModelAttribute("stdntMyPageVO") StdntMyPageVO stdntMyPageVO) throws Exception {
	
		return "/st/my/acnutnoChange";
	}
	
	//TODO requestMapping
	/**
	* Author : 박태준
	* 계좌번호 변경한다.
	*
	* @param StdntMyPageVO - 조회할 정보가 담긴 StdntMyPageVO
	* @return "/cpa/st/my/passwordChange"
	* @exception Exception
	*/
	@RequestMapping(value = "/updateAcnutnoChange.do")
	public ModelAndView updateAcnutnoChange(@RequestBody StdntMyPageVO stdntMyPageVO) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		return modelAndView;
	}
}
