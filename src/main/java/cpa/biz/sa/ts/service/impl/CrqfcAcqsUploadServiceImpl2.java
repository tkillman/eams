package cpa.biz.sa.ts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpa.biz.sa.ts.dao.CrqfcAcqsUploadDAO;
import cpa.biz.sa.ts.model.CmmnTnStdntInfoVO;
import cpa.biz.sa.ts.model.CpaTeVO;
import cpa.biz.sa.ts.service.CrqfcAcqsUploadService2;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* CrqfcAcqsUploadServiceImpl2.java
* 클래스 설명 : 자격증취득내역업로드
* 		
* @author 김동규
* @since 2020.08.31
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.31                   김동규	최초 생성
* </pre>
*/
@Service("CrqfcAcqsUploadServiceImpl2")
public class CrqfcAcqsUploadServiceImpl2 implements CrqfcAcqsUploadService2 {
	
	@Autowired
	CrqfcAcqsUploadDAO crqfcAcqsUploadDAO;

	@Override
	public int updateCrqfcAcqsUploadExcel(List<CpaTeVO> excelDataList) {
		crqfcAcqsUploadDAO.update("CrqfcAcqsUploadDAO.updateCrqfcAcqsUploadExcel", excelDataList);
		return 0;
	}
	
	@Override
	public void setStdntNoInfoToExcelList(List<CpaTeVO> excelDataList, List<CmmnTnStdntInfoVO> cmmnTnStdntInfoVOList) throws Exception {
		
		excelDataList.stream().forEach(cpaTeVo -> {
			cmmnTnStdntInfoVOList.stream().forEach(cmmnTnStdntInfoVO -> {
				String excelStdntNo = cpaTeVo.getStdntNo(); //엑셀 교번
				String excelFnm = cpaTeVo.getFnm(); //엑셀 이름
				String tableStdntNo = cmmnTnStdntInfoVO.getStdntNo(); //테이블 교번
				String tableFnm = cmmnTnStdntInfoVO.getFnm(); //테이블 이름
				
				if (excelStdntNo.equals(tableStdntNo) && excelFnm.equals(tableFnm)) {
					cpaTeVo.setStdntUno(cmmnTnStdntInfoVO.getStdntUno()); //학생고유번호 설정
				}
			});
		});
	}
}
