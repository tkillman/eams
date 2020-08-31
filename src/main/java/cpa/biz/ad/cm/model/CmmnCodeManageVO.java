package cpa.biz.ad.cm.model;

public class CmmnCodeManageVO {
	private String codeId; /** 코드아이디 */
	private String codeIdAbrvNm; /** 코드아이디약칭 */
	private String codeIdNm; /** 코드아이디명 */
	private String useAt; /** 사용여부 */
	private String clCodeNm; /** 분류코드명 */
	
	public String getCodeId() {
		return codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}
	public String getCodeIdAbrvNm() {
		return codeIdAbrvNm;
	}
	public void setCodeIdAbrvNm(String codeIdAbrvNm) {
		this.codeIdAbrvNm = codeIdAbrvNm;
	}
	public String getCodeIdNm() {
		return codeIdNm;
	}
	public void setCodeIdNm(String codeIdNm) {
		this.codeIdNm = codeIdNm;
	}
	public String getUseAt() {
		return useAt;
	}
	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}
	public String getClCodeNm() {
		return clCodeNm;
	}
	public void setClCodeNm(String clCodeNm) {
		this.clCodeNm = clCodeNm;
	}
	

}
