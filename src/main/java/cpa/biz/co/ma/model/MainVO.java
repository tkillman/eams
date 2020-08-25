package cpa.biz.co.ma.model;

import java.io.Serializable;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MainVO.java
* 클래스 설명 : 메인 VO
* 		
* @author syan
* @since 2020.8.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.8.20     syan	최초 생성
* </pre>
*/

@SuppressWarnings("serial")
public class MainVO implements Serializable {
	
	private String bbsUno; /** 게시판고유번호 */
	private String deleteAt; /** 삭제여부 */
	private String nttCn; /** 게시물내용 */
	private String nttSj; /** 게시물제목 */
	private String nttUno; /** 게시물고유번호 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	private String upperBbscttNo; /** 부모글번호 */
	
	/** 현재페이지 */
    private int pageIndex = 1;

    /** 페이지갯수 */
    private int pageUnit = 10;

    /** 페이지사이즈 */
    private int pageSize = 10;

    /** 첫페이지 인덱스 */
    private int firstIndex = 1;

    /** 마지막페이지 인덱스 */
    private int lastIndex = 1;

    /** 페이지당 레코드 개수 */
    private int recordCountPerPage = 10;
	
	public String getBbsUno() {
		return bbsUno;
	}
	public void setBbsUno(String bbsUno) {
		this.bbsUno = bbsUno;
	}
	public String getDeleteAt() {
		return deleteAt;
	}
	public void setDeleteAt(String deleteAt) {
		this.deleteAt = deleteAt;
	}
	public String getNttCn() {
		return nttCn;
	}
	public void setNttCn(String nttCn) {
		this.nttCn = nttCn;
	}
	public String getNttSj() {
		return nttSj;
	}
	public void setNttSj(String nttSj) {
		this.nttSj = nttSj;
	}
	public String getNttUno() {
		return nttUno;
	}
	public void setNttUno(String nttUno) {
		this.nttUno = nttUno;
	}
	public String getRegistDt() {
		return registDt;
	}
	public void setRegistDt(String registDt) {
		this.registDt = registDt;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getUpdtDt() {
		return updtDt;
	}
	public void setUpdtDt(String updtDt) {
		this.updtDt = updtDt;
	}
	public String getUpdusr() {
		return updusr;
	}
	public void setUpdusr(String updusr) {
		this.updusr = updusr;
	}
	public String getUpperBbscttNo() {
		return upperBbscttNo;
	}
	public void setUpperBbscttNo(String upperBbscttNo) {
		this.upperBbscttNo = upperBbscttNo;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageUnit() {
		return pageUnit;
	}
	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getFirstIndex() {
		return firstIndex;
	}
	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}
	public int getLastIndex() {
		return lastIndex;
	}
	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}
	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}
	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}
	
}
