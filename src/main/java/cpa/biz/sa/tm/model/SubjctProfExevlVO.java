package cpa.biz.sa.tm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* SubjctProfExevlVO.java
* 클래스 설명 : 게시판관리 Business
* 		
* @author 김동규
* @since 2020.08.24
* @version 1.0.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정                           수정자	수정내용
* -------                   --------           --------------------------
* 2020.08.24                   김동규	최초 생성
* </pre>
*/
@Data
public class SubjctProfExevlVO {

	private String cno; /** 기수 */
	
	private String clas; /** 학급 */
	
	private String stdntNo; /** 교번 */
	
	private String fnm; /** 이름 */
	
	private String score; /** 점수 */
}
