package cpa.biz.sa.ts.service.impl;

import java.util.List;
import java.util.stream.IntStream;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import cpa.biz.sa.ts.dao.EvlScoreUploadDAO;
import cpa.biz.sa.ts.model.CmmnTnEntschInfoVO;
import cpa.biz.sa.ts.model.CmmnTnIemInfoVO;
import cpa.biz.sa.ts.model.CmmnTnRealmInfoVO;
import cpa.biz.sa.ts.model.CmmnTnSbjectInfoVO;
import cpa.biz.sa.ts.model.EvlScoreUploadExcelMappingEnum;
import cpa.biz.sa.ts.model.EvlScoreUploadVO;
import cpa.biz.sa.ts.service.EvlScoreUploadService;
import egovframework.rte.fdl.excel.EgovExcelService;

@Service("EvlScoreUploadService")
public class EvlScoreUploadServiceImpl implements EvlScoreUploadService {
	
	private static final Logger Logger = LoggerFactory.getLogger(EvlScoreUploadServiceImpl.class);
	
	private static final String errorField = "evlScoreExcelAtchmnflFile";
	
	@Autowired
	EvlScoreUploadDAO evlScoreUploadDAO;
	
	//@Resource(name = "evlScoreUploadExcelService")
	//private EgovExcelService evlScoreUploadExcelService;
	
	@Override
	public int updateEvlScoreUploadExcel(EvlScoreUploadVO evlScoreUploadVO) throws Exception {
		
		return evlScoreUploadDAO.updateEvlScoreUploadExcel(evlScoreUploadVO);
	}

	@Override
	public List<CmmnTnEntschInfoVO> searchTnEntschInfoAjaxList() {
		return evlScoreUploadDAO.selectTnEntschInfoAjaxList();
	}

	@Override
	public List<CmmnTnIemInfoVO> searchTnIemInfoAjaxList() {
		return evlScoreUploadDAO.selectTnIemInfoAjaxList();
	}

	@Override
	public List<CmmnTnRealmInfoVO> searchTnRealmInfoAjaxList() {
		return evlScoreUploadDAO.selectTnRealmInfoAjaxList();
	}

	@Override
	public List<CmmnTnSbjectInfoVO> searchTnSbjectInfoAjaxList() {
		return evlScoreUploadDAO.selectTnSbjectInfoAjaxList();
	}

	@Override
	public void validate(EvlScoreUploadVO evlScoreUploadVO, BindingResult bindingResult) {
		MultipartFile mptFile = evlScoreUploadVO.getEvlScoreExcelAtchmnflFile();
		Workbook wbT = null;
		
		if (mptFile.getSize() == 0) {
			bindingResult.rejectValue(errorField, "evlScoreExcelAtchmnflFile.empty"); //
			return;
		}
		
		//엑셀파일인지 체크
		if (!(mptFile.getOriginalFilename().endsWith(".xls") || mptFile.getOriginalFilename().endsWith(".XLS")
				|| mptFile.getOriginalFilename().endsWith(".xlsx") || mptFile.getOriginalFilename().endsWith(".XLSX"))) {
			bindingResult.rejectValue(errorField, "evlScoreExcelAtchmnflFile.notExcel");
			return;
		}
		
		try {
			
			if (mptFile.getOriginalFilename().endsWith(".xls") || mptFile.getOriginalFilename().endsWith(".XLS")) {
				//wbT = evlScoreUploadExcelService.loadWorkbook(mptFile.getInputStream());
			} else if (mptFile.getOriginalFilename().endsWith(".xlsx") || mptFile.getOriginalFilename().endsWith(".XLSX")) {
				//wbT = evlScoreUploadExcelService.loadWorkbook(mptFile.getInputStream(), new XSSFWorkbook());
			}
			
			Sheet sheet = wbT.getSheetAt(0);
			if (sheet.getLastRowNum() == 0) {
				bindingResult.rejectValue(errorField, "evlScoreExcelAtchmnflFile.empty");
				return;
			}
			
			IntStream.range(1, sheet.getLastRowNum() + 1)
			.forEach(i -> {
				Row row = sheet.getRow(i);
				IntStream.range(0, EvlScoreUploadExcelMappingEnum.values().length)
							.forEach(j -> {
								Cell cell = row.getCell(j);
								if (cell == null) {
									Integer[] excelRowAndColIndexInfo = {i + 1, j + 1};
									bindingResult.rejectValue(errorField,"evlScoreExcelAtchmnflFile.cell.empty", excelRowAndColIndexInfo,""); // 자격증엑셀업로드파일에서 해당 셀이 비어있습니다. 행 : {0} 열 : {0}
								} else {
									validateCellTypeAndValue(cell, bindingResult);
								}
								
							});
			});
			
		} catch (Exception e) {
			bindingResult.rejectValue(errorField, "evlScoreExcelAtchmnflFile.uploadError"); // 자격증엑셀업로드 중 에러가 발생했습니다.
			Logger.debug(e.getMessage());
		}

	}
	
	//cell 유효성 체크
	public void validateCellTypeAndValue(Cell cell, BindingResult bindingResult) {
		int colIndex = cell.getColumnIndex();
		
		if (colIndex == EvlScoreUploadExcelMappingEnum.STDNT_NO.getEvlScoreUploadExcelCellIndex()
				|| colIndex == EvlScoreUploadExcelMappingEnum.EVL_SCORE.getEvlScoreUploadExcelCellIndex()) { //교번, 평가점수
			validateNumericCellTypeAndValue(cell, bindingResult);	
		} else if (colIndex == EvlScoreUploadExcelMappingEnum.FNM.getEvlScoreUploadExcelCellIndex()) { //이름
			validateStringCellTypeAndValue(cell, bindingResult);
		}
	}

	// numeric validate 체크
	public void validateNumericCellTypeAndValue(Cell cell, BindingResult  bindingResult) {
		if (!(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)) { //숫자형식이 아닌경우
			bindingResult.rejectValue(errorField, "evlScoreExcelAtchmnflFile.cell.notNumeric", getRowAndColIndexByCell(cell), "");
		}
	}
	
	// string validate 체크
	public void validateStringCellTypeAndValue(Cell cell, BindingResult  bindingResult) {
		if (!(cell.getCellType() == Cell.CELL_TYPE_STRING)) { //문자형식이 아닌경우
			bindingResult.rejectValue(errorField, "evlScoreExcelAtchmnflFile.cell.notString", getRowAndColIndexByCell(cell), "");
		} else if(StringUtils.isEmpty(cell.getStringCellValue())){ //숫자형식이지만 값이 없는 경우	
			bindingResult.rejectValue(errorField, "evlScoreExcelAtchmnflFile.cell.empty", getRowAndColIndexByCell(cell), "");
		}
	}
	
	//cell 정보 받아서 Integer 반환
	public Integer[] getRowAndColIndexByCell(Cell cell) {
		Integer[] excelRowAndColIndexInfo = new Integer[2];
		excelRowAndColIndexInfo[0] = cell.getRowIndex() + 1;
		excelRowAndColIndexInfo[1] = cell.getColumnIndex() + 1;
		return excelRowAndColIndexInfo;
	}
}
