package cpa.biz.sa.tm.model;

import cpa.biz.sa.ss.model.CmmnTnEvlScoreVO;
import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* IemAvrgVO.java
* 클래스 설명 : 항목별평균표
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
public class IemAvrgVO extends CmmnTnEvlScoreVO{
	private String fnm; /** 이름 */
	private String stdntNo; /** 교번 */
}
