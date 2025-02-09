/*
    구해야 하는 것: 서울에 위치한 식당들의 식당 ID, 식당 이름, 
    음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수(소수점 세 번째 자리에서 반올림)를 조회 / 
    평균점수를 기준으로 내림차순, 즐겨찾기 수 기준으로 내림차순 

*/

SELECT
    ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES, ri.ADDRESS,
    ROUND(AVG(rr.REVIEW_SCORE), 2) as 'SCORE'
FROM REST_INFO as ri
    INNER JOIN REST_REVIEW as rr on ri.REST_ID = rr.REST_ID
WHERE LEFT(ri.ADDRESS, 2) = '서울'
GROUP BY ri.REST_ID
ORDER BY SCORE desc, ri.FAVORITES desc