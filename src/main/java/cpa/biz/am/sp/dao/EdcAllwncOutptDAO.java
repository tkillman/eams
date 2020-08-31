package cpa.biz.am.sp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.am.sp.model.EdcAllwncOutptVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("EdcAllwncOutptDAO")
public class EdcAllwncOutptDAO extends EgovComAbstractDAO{
	public List selectEdcAllwncOutptAjaxList(EdcAllwncOutptVO edcAllwncOutptVO){
		return selectList("EdcAllwncOutptDAO.selectEdcAllwncOutptAjaxList", edcAllwncOutptVO);
	}
}
