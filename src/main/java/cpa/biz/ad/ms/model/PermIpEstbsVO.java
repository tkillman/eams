package cpa.biz.ad.ms.model;

public class PermIpEstbsVO {
	private String permIp; /** 허용아이피 */
	private String permIpMngUno; /** 허용아이피관리고유번호 */
	private String registDt; /** 등록일시 */
	private String userSeCode; /** 사용자구분코드 */
	
	public String getPermIp() {
		return permIp;
	}
	public void setPermIp(String permIp) {
		this.permIp = permIp;
	}
	public String getPermIpMngUno() {
		return permIpMngUno;
	}
	public void setPermIpMngUno(String permIpMngUno) {
		this.permIpMngUno = permIpMngUno;
	}
	public String getRegistDt() {
		return registDt;
	}
	public void setRegistDt(String registDt) {
		this.registDt = registDt;
	}
	public String getUserSeCode() {
		return userSeCode;
	}
	public void setUserSeCode(String userSeCode) {
		this.userSeCode = userSeCode;
	}
	
	
}
