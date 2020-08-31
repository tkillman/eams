package cpa.biz.ad.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.ms.model.DataDeleteVO;
import cpa.biz.am.sp.model.EdcAllwncOutptVO;
import cpa.biz.am.sp.model.EdcAllwncRegistVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("DataDeleteDAO")
public class DataDeleteDAO extends EgovComAbstractDAO{
	public List selectDataDeleteAjaxList(DataDeleteVO dataDeleteVO){
		return selectList("DataDeleteDAO.selectDataDeleteAjaxList", dataDeleteVO);
	}
	
	public int deleteAjaxDataDelete(DataDeleteVO dataDeleteVO){
		return delete("DataDeleteDAO.deleteAjaxDataDelete", dataDeleteVO);
	}
}
