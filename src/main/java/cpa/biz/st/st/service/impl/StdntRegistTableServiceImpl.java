package cpa.biz.st.st.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cpa.biz.st.st.dao.StdntRegistTableDAO;
import cpa.biz.st.st.model.StdntRegistTableVO;
import cpa.biz.st.st.service.StdntRegistTableService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* StdntRegistTableServiceImpl.java
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

@Service("stdntRegistTableService")
public class StdntRegistTableServiceImpl extends EgovAbstractServiceImpl implements StdntRegistTableService {

	@Resource(name = "stdntRegistTableDAO")
	private StdntRegistTableDAO stdntRegistTableDAO;

	@Override
	public StdntRegistTableVO searchStdntBassInfo(StdntRegistTableVO stdntRegistTableVO) {
		return stdntRegistTableDAO.selectStdntBassInfo(stdntRegistTableVO);
	}
	
	@Override
	public Map<String, Object> searchStdntDetailInfo(StdntRegistTableVO stdntRegistTableVO) {
		
		String tab = "";
		Map<String, Object> map = new HashMap<>();
		StdntRegistTableVO vo = new StdntRegistTableVO();
		List<?> list = new ArrayList<>();
		
		if(stdntRegistTableVO.getTabUnit() != null && !stdntRegistTableVO.getTabUnit().equals("")) {
			tab = stdntRegistTableVO.getTabUnit();
		} else { // 에러
			
		}
		
		switch(tab) {
		case "2": // 개인신상 및 교우관계
			vo = stdntRegistTableDAO.selectIndvdlMatter(stdntRegistTableVO);
			list = stdntRegistTableDAO.selectFrndList(stdntRegistTableVO.getStdntUno());
			break;
		case "3": // 가족사항
			list = stdntRegistTableDAO.selectFamilyMatter(stdntRegistTableVO);
			break;
		case "4": // 학력사항
			list = stdntRegistTableDAO.selectAcdmcrMatter(stdntRegistTableVO);
			break;
		case "5": // 자격 및 면허
			list = stdntRegistTableDAO.selectQualfLcns(stdntRegistTableVO);
			break;
		case "6": // 경력사항
			list = stdntRegistTableDAO.selectCareerMatter(stdntRegistTableVO);
			break;
		default: // 병역사항
			vo = stdntRegistTableDAO.selectMtrscMatter(stdntRegistTableVO);
			break;
		}
		
		map.put("resultInfoVO", vo);
		map.put("resultInfoList", list);
		
		return map;
	}

	@Override
	public void saveStdntDetailInfo(StdntRegistTableVO stdntRegistTableVO) {
		
		String tab = "";
		
		if(stdntRegistTableVO.getTabUnit() != null && !stdntRegistTableVO.getTabUnit().equals("")) {
			tab = stdntRegistTableVO.getTabUnit();
		} else { // 에러
			
		}
		
		switch(tab) {
		case "1":
			stdntRegistTableDAO.updateStdntBassInfo(stdntRegistTableVO);
			break;
		case "2": // 개인신상 및 교우관계
			stdntRegistTableDAO.updateIndvdlMatter(stdntRegistTableVO);
			stdntRegistTableDAO.deleteFrndList(stdntRegistTableVO.getStdntUno());
			for(int i = 0; i < stdntRegistTableVO.getStdntFrndList().size(); i++) {
				stdntRegistTableDAO.insertFrndList(stdntRegistTableVO.getStdntFrndList().get(i));
			}
			break;
		case "3": // 가족사항
			stdntRegistTableDAO.deleteFamilyMatter(stdntRegistTableVO.getStdntUno());
			for(int i = 0; i < stdntRegistTableVO.getStdntFamilyList().size(); i++) {
				stdntRegistTableDAO.insertFamilyMatter(stdntRegistTableVO.getStdntFamilyList().get(i));
			} 
			break;
		case "4": // 학력사항
			stdntRegistTableDAO.deleteAcdmcMatter(stdntRegistTableVO.getStdntUno());
			for(int i = 0; i < stdntRegistTableVO.getStdntAcdmcrList().size(); i++) {
				stdntRegistTableDAO.insertAcdmcrMatter(stdntRegistTableVO.getStdntAcdmcrList().get(i));
			}
			break;
		case "5": // 자격 및 면허
			stdntRegistTableDAO.deleteQualfLcnsMatter(stdntRegistTableVO.getStdntUno());
			for(int i = 0; i < stdntRegistTableVO.getStdntQualfLcnsList().size(); i++) {
				stdntRegistTableDAO.insertQualfLcns(stdntRegistTableVO.getStdntQualfLcnsList().get(i));
			}
			break;
		case "6": // 경력사항
			stdntRegistTableDAO.deleteCareerMatter(stdntRegistTableVO.getStdntUno());
			for(int i = 0; i < stdntRegistTableVO.getStdntCareerList().size(); i++) {
				stdntRegistTableDAO.insertCareerMatter(stdntRegistTableVO.getStdntCareerList().get(i));
			}
			break;
		default: // 병역사항
			stdntRegistTableDAO.updateMtrscMatter(stdntRegistTableVO);
			break;
		}
		
	}
	
}
