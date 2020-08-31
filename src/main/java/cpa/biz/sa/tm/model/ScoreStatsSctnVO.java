package cpa.biz.sa.tm.model;

import lombok.Data;

/**
* 
* 시스템명 : 중앙경찰학교 차세대 통합교육평가시스템
* ScoreStatsSctnVO.java
* 클래스 설명 : 점수통계구간
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
public class ScoreStatsSctnVO {
	
	private String cno; /** 기수 */
	
	private Integer gnrlzScoreMin1; /** 종합점수1 최저 */
	private Integer gnrlzScoreMax1; /** 종합점수1 최고 */
	
	private Integer gnrlzScoreMin2; /** 종합점수2 최저 */
	private Integer gnrlzScoreMax2; /** 종합점수2 최고 */
	
	private Integer gnrlzScoreMin3; /** 종합점수3 최저 */
	private Integer gnrlzScoreMax3; /** 종합점수3 최고 */
	
	private Integer gnrlzScoreMin4; /** 종합점수4 최저 */
	private Integer gnrlzScoreMax4; /** 종합점수4 최고 */
	
	private Integer gnrlzScoreMin5; /** 종합점수5 최저 */
	private Integer gnrlzScoreMax5; /** 종합점수5 최고 */
	
	private Integer gnrlzScoreMin6; /** 종합점수6 최저 */
	private Integer gnrlzScoreMax6; /** 종합점수6 최고 */
	
	private Integer gnrlzScoreMin7; /** 종합점수7 최저 */
	private Integer gnrlzScoreMax7; /** 종합점수7 최고 */
	
	///////////// 실무이론
	private Integer prthScoreMin1; /** 실무이론점수1최저*/
	private Integer prthScoreMax1; /** 실무이론점수1최고*/
	
	private Integer prthScoreMin2; /** 실무이론점수2최저*/
	private Integer prthScoreMax2; /** 실무이론점수2최고*/
	
	private Integer prthScoreMin3; /** 실무이론점수3최저*/
	private Integer prthScoreMax3; /** 실무이론점수3최고*/
	
	private Integer prthScoreMin4; /** 실무이론점수4최저*/
	private Integer prthScoreMax4; /** 실무이론점수4최고*/
	
	private Integer prthScoreMin5; /** 실무이론점수5최저*/
	private Integer prthScoreMax5; /** 실무이론점수5최고*/
	
	private Integer prthScoreMin6; /** 실무이론점수6최저*/
	private Integer prthScoreMax6; /** 실무이론점수6최고*/
	
	private Integer prthScoreMin7; /** 실무이론점수7최저*/
	private Integer prthScoreMax7; /** 실무이론점수7최고*/
}
