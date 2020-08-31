package cpa.biz.ad.ms.model;

public class PwChangeCycleVO {
	private int changeCycle; /** 변경주기 */
	private String changeCycmngUno; /** 변경주기관리고유번호 */
	private String registDt; /** 등록일시 */
	
	public int getChangeCycle() {
		return changeCycle;
	}
	public void setChangeCycle(int changeCycle) {
		this.changeCycle = changeCycle;
	}
	public String getChangeCycmngUno() {
		return changeCycmngUno;
	}
	public void setChangeCycmngUno(String changeCycmngUno) {
		this.changeCycmngUno = changeCycmngUno;
	}
	public String getRegistDt() {
		return registDt;
	}
	public void setRegistDt(String registDt) {
		this.registDt = registDt;
	}
	
	

}
