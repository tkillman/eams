package cpa.biz.sa.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.tm.dao.SchulRgistrPrntngDAO;
import cpa.biz.sa.tm.model.SchulRgistrPrntngVO;
import cpa.biz.sa.tm.service.SchulRgistrPrntngService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SchulRgistrPrntngServiceImpl.java
* 클래스 설명 : 학적부인쇄
* 		
* @author 김동규
* @since 2020.08.19
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.19                   김동규	최초 생성
* </pre>
*/
@Service("SchulRgistrPrntngService")
public class SchulRgistrPrntngServiceImpl implements SchulRgistrPrntngService {

	@Autowired
	SchulRgistrPrntngDAO schulRgistrPrntngDAO;
	
	@Override
	public List<SchulRgistrPrntngVO> writeSchulRgistrPrntng(SchulRgistrPrntngVO schulRgistrPrntngVO) {
		
		schulRgistrPrntngDAO.selectList("SchulRgistrPrntngDAO.writeSchulRgistrPrntng", schulRgistrPrntngVO);
		return null;
	}

}
