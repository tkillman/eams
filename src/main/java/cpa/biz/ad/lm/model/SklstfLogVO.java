package cpa.biz.ad.lm.model;

public class SklstfLogVO {
	private String conectIp; /** 접속아이피 */
	private String menuNm; /** 메뉴명 */
	private String registDt; /** 등록일시 */
	private String fnm; /** 성명 */
	private String userId; /** 사용자아이디 */
	private int cno; /** 기수 */
	
	public String getConectIp() {
		return conectIp;
	}
	public void setConectIp(String conectIp) {
		this.conectIp = conectIp;
	}
	public String getMenuNm() {
		return menuNm;
	}
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}
	public String getRegistDt() {
		return registDt;
	}
	public void setRegistDt(String registDt) {
		this.registDt = registDt;
	}
	public String getFnm() {
		return fnm;
	}
	public void setFnm(String fnm) {
		this.fnm = fnm;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}

	
}
