package cpa.biz.ad.rm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.ad.rm.dao.AuthorManageDAO;
import cpa.biz.ad.rm.model.AuthorManageVO;
import cpa.biz.ad.rm.service.AuthorManageService;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* AuthorManageServiceImpl.java
* 클래스 설명 : 권한 관리
* 		
* @author 송광진
* @since 2020.08.18
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.18                   송광진	최초 생성
* </pre>
*/
@Service("AuthorManageService")
public class AuthorManageServiceImpl implements AuthorManageService{
	
	@Autowired
	AuthorManageDAO AuthorManageDAO;
	
	@Override
	public List<AuthorManageVO> searchAuthorManageAjaxList(AuthorManageVO AuthorManageVO) throws Exception {
		return AuthorManageDAO.selectAuthorManageAjaxList(AuthorManageVO);
	}
	
	@Override
	public int insertAjaxAuthorManage(AuthorManageVO AuthorManageVO) throws Exception {
		return AuthorManageDAO.insertAjaxAuthorManage(AuthorManageVO);
	}
	
	@Override
	public AuthorManageVO searchAuthorManageView(AuthorManageVO AuthorManageVO) throws Exception {
		return AuthorManageDAO.selectAuthorManageView(AuthorManageVO);
	}
	
	@Override
	public int updateAjaxAuthorManage(AuthorManageVO AuthorManageVO) throws Exception {
		return AuthorManageDAO.updateAjaxAuthorManage(AuthorManageVO);
	}
	
	@Override
	public int deleteAjaxAuthorManage(AuthorManageVO AuthorManageVO) throws Exception {
		return AuthorManageDAO.deleteAjaxAuthorManage(AuthorManageVO);
	}

}
