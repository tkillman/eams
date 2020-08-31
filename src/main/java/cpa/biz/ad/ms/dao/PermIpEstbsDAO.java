package cpa.biz.ad.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.ms.model.PermIpEstbsVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("PermIpEstbsDAO")
public class PermIpEstbsDAO extends EgovComAbstractDAO{
	public List selectPermIpEstbsAjaxList(){
		return selectList("PermIpEstbsDAO.selectPermIpEstbsAjaxList");
	}
	
	public int insertAjaxPermIpEstbs(PermIpEstbsVO PermIpEstbsVO){
		return insert("PermIpEstbsDAO.insertAjaxPermIpEstbs", PermIpEstbsVO);
	}
	
	public int deleteAjaxPermIpEstbs(PermIpEstbsVO PermIpEstbsVO){
		return delete("PermIpEstbsDAO.deleteAjaxPermIpEstbs", PermIpEstbsVO);
	}
}
