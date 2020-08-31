package cpa.biz.sa.sm.model;

public class ReEntschManageVO {
	private String fnm; /** 성명 */
	private String reEntschMngUno; /** 재입교관리고유번호 */
	private int stdntNo; /** 교번 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private int tme; /** 회차 */
	
	public String getFnm() {
		return fnm;
	}
	public void setFnm(String fnm) {
		this.fnm = fnm;
	}
	public String getReEntschMngUno() {
		return reEntschMngUno;
	}
	public void setReEntschMngUno(String reEntschMngUno) {
		this.reEntschMngUno = reEntschMngUno;
	}
	public int getStdntNo() {
		return stdntNo;
	}
	public void setStdntNo(int stdntNo) {
		this.stdntNo = stdntNo;
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
	public int getTme() {
		return tme;
	}
	public void setTme(int tme) {
		this.tme = tme;
	}
	
	
}
