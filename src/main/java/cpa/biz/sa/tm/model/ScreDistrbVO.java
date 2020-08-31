package cpa.biz.sa.tm.model;

import java.util.List;
import java.util.Map;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScreDistrbVO.java
* 클래스 설명 : 성적분포표
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
public class ScreDistrbVO {
	
	private List<Map<String, String>> gnrlzScoreList; /** 종합점수리스트*/
	
	private List<Map<String, String>> prthScoreList; /** 실무이론점수리스트*/
}
