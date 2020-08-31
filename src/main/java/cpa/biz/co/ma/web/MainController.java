package cpa.biz.co.ma.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cpa.biz.co.ma.model.MainVO;
import cpa.biz.co.ma.service.MainService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MainController.java
* 클래스 설명 : 메인 Controller
* 		
* @author syan
* @since 2020.07.27
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.07.27     syan	최초 생성
* </pre>
*/

@Controller
public class MainController {
	
	@Resource(name = "MainService")
    private MainService mainService;
	
	/**
	* Author : syan
	* 게시판의 목록을 조회한다.
	*
	* @param MainVO - 조회할 정보가 담긴 MainVO
	* @return "main"
	* @exception Exception
	*/	
    @RequestMapping(value="/main")
    public String main(@ModelAttribute("searchVO") MainVO mainVO, ModelMap model) throws Exception {

		Map<String, Object> map = mainService.selectBbsList(mainVO);

		model.addAttribute("resultList", map.get("resultList"));
		model.addAttribute("resultCnt", map.get("resultCnt"));
		model.addAttribute("paginationInfo", map.get("paginationInfo"));

    	return "Main";
    }
    
    @RequestMapping(value="/co/ma/loginProc")
    public String loginProc(@ModelAttribute("searchVO") MainVO mainVO, ModelMap model) throws Exception {

    	MainVO resultVO = mainService.loginProc(mainVO);

		model.addAttribute("result", resultVO);

    	return "Main";
    }
    
    @RequestMapping(value="/co/ma/searchPassword")
    public String searchPassword(@ModelAttribute("searchVO") MainVO mainVO, ModelMap model) throws Exception {

    	MainVO resultVO = mainService.searchPassword(mainVO);

		model.addAttribute("result", resultVO);

    	return "Main";
    }
    
    @RequestMapping(value={"/co/ma/testJson"})
    public String gdsInfoInqr(@RequestBody Map<String, Object> mainVO, Model model) throws Exception {

        Map<String, Object> data = new HashMap<String, Object>();

        data.put("data", "test");
        
        model.addAttribute("result", data);

        return "jsonView";
    }
}
