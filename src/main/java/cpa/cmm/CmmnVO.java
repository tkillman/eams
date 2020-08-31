package cpa.cmm;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CmmnVO implements Serializable {

    private int pageIndex = 1; /** 현재페이지 */
    private int pageUnit = 10; /** 페이지갯수 */
    private int pageSize = 10; /** 페이지사이즈 */
    private int firstIndex = 1; /** 첫페이지 인덱스 */
    private int lastIndex = 1; /** 마지막페이지 인덱스 */
    private int recordCountPerPage = 10; /** 페이지당 레코드 개수 */
    
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
