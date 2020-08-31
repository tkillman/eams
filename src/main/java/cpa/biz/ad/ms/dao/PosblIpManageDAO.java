package cpa.biz.ad.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.ms.model.PosblIpManageVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("PosblIpManageDAO")
public class PosblIpManageDAO extends EgovComAbstractDAO{
	public List selectPosblIpManageAjaxList(){
		return selectList("PosblIpManageDAO.selectPosblIpManageAjaxList");
	}
	
	public int insertAjaxPosblIpManage(PosblIpManageVO posblIpManageVO){
		return insert("PosblIpManageDAO.insertAjaxPosblIpManage", posblIpManageVO);
	}
	
	public int updateAjaxPosblIpManage(PosblIpManageVO posblIpManageVO){
		return update("PosblIpManageDAO.updateAjaxPosblIpManage", posblIpManageVO);
	}
	
	public int deleteAjaxPosblIpManage(PosblIpManageVO posblIpManageVO){
		return delete("PosblIpManageDAO.deleteAjaxPosblIpManage", posblIpManageVO);
	}
}
