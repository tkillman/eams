package cpa.biz.am.sp.model;

public class EdcAllwncRegistVO {
	private String acnutno; /** 계좌번호 */
	private String bankCode; /** 은행코드 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String stdntUno; /** 학생고유번호 */
	private String fnm; /** 성명 */
	private int stdntNo; /** 교번 */
	private int amount; /** 금액 */
	
	public String getAcnutno() {
		return acnutno;
	}
	public void setAcnutno(String acnutno) {
		this.acnutno = acnutno;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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
	public String getStdntUno() {
		return stdntUno;
	}
	public void setStdntUno(String stdntUno) {
		this.stdntUno = stdntUno;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
