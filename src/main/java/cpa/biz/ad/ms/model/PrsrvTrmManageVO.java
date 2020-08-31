package cpa.biz.ad.ms.model;

public class PrsrvTrmManageVO {
	private String deleteYear; /** 삭제연도 */
	private String prsrvTrmUno; /** 보존연한고유번호 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	
	public String getDeleteYear() {
		return deleteYear;
	}
	public void setDeleteYear(String deleteYear) {
		this.deleteYear = deleteYear;
	}
	public String getPrsrvTrmUno() {
		return prsrvTrmUno;
	}
	public void setPrsrvTrmUno(String prsrvTrmUno) {
		this.prsrvTrmUno = prsrvTrmUno;
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

}
