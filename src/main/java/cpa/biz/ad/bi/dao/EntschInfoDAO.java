package cpa.biz.ad.bi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.bi.model.EntschInfoVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("EntschInfoDAO")
public class EntschInfoDAO extends EgovComAbstractDAO{
	public List selectEntschInfoAjaxList(EntschInfoVO EntschInfoVO){
		return selectList("EntschInfoDAO.selectEntschInfoAjaxList", EntschInfoVO);
	}
	
	public int insertAjaxEntschInfo(EntschInfoVO EntschInfoVO){
		return insert("EntschInfoDAO.insertAjaxEntschInfo", EntschInfoVO);
	}
	
	public EntschInfoVO selectEntschInfoView(EntschInfoVO EntschInfoVO){
		return selectOne("EntschInfoDAO.selectEntschInfoView", EntschInfoVO);
	}
	
	public int updateAjaxEntschInfo(EntschInfoVO EntschInfoVO){
		return update("EntschInfoDAO.updateAjaxEntschInfo", EntschInfoVO);
	}
	
	public int deleteAjaxEntschInfo(EntschInfoVO EntschInfoVO){
		return delete("EntschInfoDAO.deleteAjaxEntschInfo", EntschInfoVO);
	}
}
