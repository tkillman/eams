package cpa.biz.am.sp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cpa.biz.am.sp.model.StdntAllwncAcnutVO;
import cpa.cmm.service.impl.EgovComAbstractDAO;

@Repository("StdntAllwncAcnutDAO")
public class StdntAllwncAcnutDAO extends EgovComAbstractDAO{
	public List selectStdntAllwncAcnutAjaxList(StdntAllwncAcnutVO stdntAllwncAcnutVO){
		return selectList("StdntAllwncAcnutDAO.selectStdntAllwncAcnutAjaxList", stdntAllwncAcnutVO);
	}
}
