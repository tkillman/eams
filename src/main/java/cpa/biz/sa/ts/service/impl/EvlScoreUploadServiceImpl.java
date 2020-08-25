package cpa.biz.sa.ts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ts.dao.EvlScoreUploadDAO;
import cpa.biz.sa.ts.model.EvlScoreUploadVO;
import cpa.biz.sa.ts.service.EvlScoreUploadService;

@Service("EvlScoreUploadService")
public class EvlScoreUploadServiceImpl implements EvlScoreUploadService {

	@Autowired
	EvlScoreUploadDAO evlScoreUploadDAO;
	
	@Override
	public int updateEvlScoreUploadExcel(EvlScoreUploadVO evlScoreUploadVO) throws Exception {
		
		return evlScoreUploadDAO.updateEvlScoreUploadExcel(evlScoreUploadVO);
	}

}
