package cpa.biz.co.ma.model;

import java.io.Serializable;

import cpa.cmm.CmmnVO;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* MainVO.java
* 클래스 설명 : 메인 VO
* 		
* @author 안선영
* @since 2020.8.20
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.8.20            안선영	최초 생성
* </pre>
*/

@SuppressWarnings("serial")
public class MainVO extends CmmnVO implements Serializable {
	
	private String stdntUno; /** 학생고유번호 */
	private int stdntNo; /** 교번 */
	private String clasUno; /** 학급 고유번호 */
	private String brckInfoUno; /** 생활관정보 고유번호 */
	private String entschUno; /** 입교고유번호 */
	private String reEntschMngUno; /** 재입교관리고유번호 */
	private String ihidnum; /** 주민등록번호 */
	private String fnm; /** 성명 */
	private String password; /** 비밀번호 */
	private String bbsUno; /** 게시판고유번호 */
	private String deleteAt; /** 삭제여부 */
	private String nttCn; /** 게시물내용 */
	private String nttSj; /** 게시물제목 */
	private String nttUno; /** 게시물고유번호 */
	private String registDt; /** 등록일시 */
	private String register; /** 등록자 */
	private String updtDt; /** 수정일시 */
	private String updusr; /** 수정자 */
	private String upperBbscttNo; /** 부모글번호 */
	private String pnum;

}
