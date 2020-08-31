package cpa.biz.sa.ts.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CpaTeVO implements Serializable{
	private String stdntNo; /** 교번 */
	private String fnm; /** 이름 */
	private String quflcnCode; /** 자격면허코드*/
	private String crqfcNo; /** 자격면허번호 */
	private String acqsDe; /** 취득일 */
	private String stdntUno; /** 학생고유번호*/
	public String getStdntNo() {
		return stdntNo;
	}
	public void setStdntNo(String stdntNo) {
		this.stdntNo = stdntNo;
	}
	public String getFnm() {
		return fnm;
	}
	public void setFnm(String fnm) {
		this.fnm = fnm;
	}
	public String getQuflcnCode() {
		return quflcnCode;
	}
	public void setQuflcnCode(String quflcnCode) {
		this.quflcnCode = quflcnCode;
	}
	public String getCrqfcNo() {
		return crqfcNo;
	}
	public void setCrqfcNo(String crqfcNo) {
		this.crqfcNo = crqfcNo;
	}
	public String getAcqsDe() {
		return acqsDe;
	}
	public void setAcqsDe(String acqsDe) {
		this.acqsDe = acqsDe;
	}
	public String getStdntUno() {
		return stdntUno;
	}
	public void setStdntUno(String stdntUno) {
		this.stdntUno = stdntUno;
	}
	
	
}
