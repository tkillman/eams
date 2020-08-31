package cpa.biz.ad.lm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.lm.model.SklstfLogVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("SklstfLogDAO")
public class SklstfLogDAO extends EgovComAbstractDAO{
	public List selectSklstfLogAjaxList(SklstfLogVO sklstfLogVO){
		return selectList("SklstfLogDAO.selectSklstfLogAjaxList", sklstfLogVO);
	}
}
