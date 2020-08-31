package cpa.biz.st.st.web;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cpa.biz.st.st.model.StdntRegistTableVO;
import cpa.biz.st.st.service.StdntRegistTableService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntRegistTableController.java
* 클래스 설명 : 교육생 학생등록표
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
@RequestMapping(value = "/st/st")
public class StdntRegistTableController {
	
	@Resource(name = "stdntRegistTableService")
	private StdntRegistTableService stdntRegistTableService;
	
	/**
	* Author : 박태준
	* 학생등록표 화면을 호출한다. (기본정보 탭)
	*
	* @param StdntRegistTableVO - 조회할 정보가 담긴 StdntRegistTableVO
	* @return ""
	* @exception
	*/
	@RequestMapping(value = "/searchStdntRegistTableForm.do")
	public String searchStdntRegistTableForm(@ModelAttribute("StdntRegistTableVO") StdntRegistTableVO stdntRegistTableVO,
												Model model) {
		
		stdntRegistTableVO.setTabUnit("1");
		
		// 학생정보 및 기본정보
		StdntRegistTableVO stdntBassInfo = stdntRegistTableService.searchStdntBassInfo(stdntRegistTableVO);
		
		model.addAttribute("stdntBassInfo", stdntBassInfo);
		
		return "/st/st/stdntRegistTable";
	}
	
	/**
	* Author : 박태준
	* 학생등록표 탭별 정보를 조회한다.
	*
	* @param StdntRegistTableVO - 조회할 정보가 담긴 StdntRegistTableVO
	* @return ""
	* @exception
	*/
	@RequestMapping(value = "/searchStdntRegistTableAjax.do")
	public ModelAndView searchStdntRegistTableAjax(@RequestBody StdntRegistTableVO stdntRegistTableVO) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		if(!stdntRegistTableVO.getTabUnit().equals("1")) {
			Map<String, Object> map = stdntRegistTableService.searchStdntDetailInfo(stdntRegistTableVO);
			
			modelAndView.addObject("stdntDetailInfo", map.get("resultInfoVO"));
			modelAndView.addObject("stdntDetailList", map.get("resultInfoList"));
		}
		
		return modelAndView;
	}
	
	/**
	* Author : 박태준
	* 학생등록표 탭별 정보를 수정한다.
	*
	* @param StdntRegistTableVO - 조회할 정보가 담긴 StdntRegistTableVO
	* @return ""
	* @exception
	*/
	@RequestMapping(value = "/saveStdntRegistTableAjax.do")
	public ModelAndView saveStdntRegistTableAjax(@RequestBody StdntRegistTableVO stdntRegistTableVO) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		stdntRegistTableService.saveStdntDetailInfo(stdntRegistTableVO);
			
		return modelAndView;
	}
}
