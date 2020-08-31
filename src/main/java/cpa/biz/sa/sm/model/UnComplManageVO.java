package cpa.biz.sa.sm.model;

public class UnComplManageVO {
	private String resn; /** 사유 */
	private String stdrDe; /** 기준일 */
	private String sylbsCode; /** 요목코드 */
	private int unComptTime; /** 미이수시간 */
	private String unComptUno; /** 미이수고유번호 */
	private String updtDt; /** 수정일시 */
	
	public String getResn() {
		return resn;
	}
	public void setResn(String resn) {
		this.resn = resn;
	}
	public String getStdrDe() {
		return stdrDe;
	}
	public void setStdrDe(String stdrDe) {
		this.stdrDe = stdrDe;
	}
	public String getSylbsCode() {
		return sylbsCode;
	}
	public void setSylbsCode(String sylbsCode) {
		this.sylbsCode = sylbsCode;
	}
	public int getUnComptTime() {
		return unComptTime;
	}
	public void setUnComptTime(int unComptTime) {
		this.unComptTime = unComptTime;
	}
	public String getUnComptUno() {
		return unComptUno;
	}
	public void setUnComptUno(String unComptUno) {
		this.unComptUno = unComptUno;
	}
	public String getUpdtDt() {
		return updtDt;
	}
	public void setUpdtDt(String updtDt) {
		this.updtDt = updtDt;
	}
	
	
}
