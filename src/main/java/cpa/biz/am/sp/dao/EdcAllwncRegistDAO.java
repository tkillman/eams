package cpa.biz.am.sp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.am.sp.model.EdcAllwncRegistVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("EdcAllwncRegistDAO")
public class EdcAllwncRegistDAO extends EgovComAbstractDAO{
	public int insertAjaxEdcAllwnc(EdcAllwncRegistVO edcAllwncRegistVO){
		return insert("EdcAllwncRegistDAO.insertAjaxEdcAllwnc", edcAllwncRegistVO);
	}
}
