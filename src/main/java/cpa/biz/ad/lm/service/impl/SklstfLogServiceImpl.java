package cpa.biz.ad.lm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.lm.dao.SklstfLogDAO;
import cpa.biz.ad.lm.model.SklstfLogVO;
import cpa.biz.ad.lm.service.SklstfLogService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SklstfLogServiceImpl.java
* 클래스 설명 : 교직원로그
* 		
* @author 송광진
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   송광진	최초 생성
* </pre>
*/
@Service("SklstfLogService")
public class SklstfLogServiceImpl implements SklstfLogService{
	
	@Autowired
	SklstfLogDAO SklstfLogDAO;
	
	@Override
	public List<SklstfLogVO> searchSklstfLogAjaxList(SklstfLogVO sklstfLogVO) throws Exception {
		return SklstfLogDAO.selectSklstfLogAjaxList(sklstfLogVO);
	}

}
