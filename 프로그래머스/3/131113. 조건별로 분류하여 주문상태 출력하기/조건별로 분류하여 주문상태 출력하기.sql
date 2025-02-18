select
    ORDER_ID, PRODUCT_ID, LEFT(OUT_DATE, 10) as 'OUT_DATE',
    CASE
        WHEN OUT_DATE  <= '2022-05-01' THEN '출고완료'
        WHEN OUT_DATE > '2022-05-01' THEN '출고대기'
        ELSE '출고미정'
    end as '출고여부'
from FOOD_ORDER
order by ORDER_ID asc;