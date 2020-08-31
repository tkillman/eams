package cpa.biz.ad.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.ad.ms.model.PwChangeCycleVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("PwChangeCycleDAO")
public class PwChangeCycleDAO extends EgovComAbstractDAO{
	public List selectPwChangeCycleAjaxList(){
		return selectList("PwChangeCycleDAO.selectPwChangeCycleAjaxList");
	}
	
	public int insertAjaxPwChangeCycle(PwChangeCycleVO PwChangeCycleVO){
		return insert("PwChangeCycleDAO.insertAjaxPwChangeCycle", PwChangeCycleVO);
	}
	
	public int updateAjaxPwChangeCycle(PwChangeCycleVO PwChangeCycleVO){
		return update("PwChangeCycleDAO.updateAjaxPwChangeCycle", PwChangeCycleVO);
	}
	
	public int deleteAjaxPwChangeCycle(PwChangeCycleVO PwChangeCycleVO){
		return delete("PwChangeCycleDAO.deleteAjaxPwChangeCycle", PwChangeCycleVO);
	}
}
