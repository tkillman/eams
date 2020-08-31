package cpa.biz.ad.ms.model;

public class DataDeleteVO {
	private int cno; /** 기수 */
	private String crseCode; /** 과정코드 */
	private String entschDe; /** 입교일 */
	private int stdntNo; /** 교번 */
	private String crseNm; /** 과정명 */
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCrseCode() {
		return crseCode;
	}
	public void setCrseCode(String crseCode) {
		this.crseCode = crseCode;
	}
	public String getEntschDe() {
		return entschDe;
	}
	public void setEntschDe(String entschDe) {
		this.entschDe = entschDe;
	}
	public int getStdntNo() {
		return stdntNo;
	}
	public void setStdntNo(int stdntNo) {
		this.stdntNo = stdntNo;
	}
	public String getCrseNm() {
		return crseNm;
	}
	public void setCrseNm(String crseNm) {
		this.crseNm = crseNm;
	}
	
	
}
