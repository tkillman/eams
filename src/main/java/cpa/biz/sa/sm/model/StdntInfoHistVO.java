package cpa.biz.sa.sm.model;

public class StdntInfoHistVO {
	private int cno; /** 기수 */
	private String fnm; /** 성명 */
	private int stdntNo; /** 교번 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getFnm() {
		return fnm;
	}
	public void setFnm(String fnm) {
		this.fnm = fnm;
	}
	public int getStdntNo() {
		return stdntNo;
	}
	public void setStdntNo(int stdntNo) {
		this.stdntNo = stdntNo;
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
	
	
}
