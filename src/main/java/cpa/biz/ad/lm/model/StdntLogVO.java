package cpa.biz.ad.lm.model;

public class StdntLogVO {
	private String brwsrNm; /** 브라우져명 */
	private String conectIp; /** 접속아이피 */
	private String cours; /** 경로 */
	private String menuNm; /** 메뉴명 */
	private String registDt; /** 등록일시 */
	private String fnm; /** 성명 */
	private int stdntNo; /** 교번 */
	private int cno; /** 기수 */
	
	public String getBrwsrNm() {
		return brwsrNm;
	}
	public void setBrwsrNm(String brwsrNm) {
		this.brwsrNm = brwsrNm;
	}
	public String getConectIp() {
		return conectIp;
	}
	public void setConectIp(String conectIp) {
		this.conectIp = conectIp;
	}
	public String getCours() {
		return cours;
	}
	public void setCours(String cours) {
		this.cours = cours;
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
	public int getStdntNo() {
		return stdntNo;
	}
	public void setStdntNo(int stdntNo) {
		this.stdntNo = stdntNo;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	
	
}
