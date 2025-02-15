select
    fp.product_id as 'PRODUCT_ID',
    fp.product_name as 'PRODUCT_NAME',
    SUM(fp.price * fo.amount) as 'TOTAL_SALES'
from food_product as fp
    inner join food_order as fo on fp.product_id = fo.product_id
where left(fo.produce_date, 7) = '2022-05'
group by fp.product_id, fp.product_name
order by TOTAL_SALES desc, PRODUCT_ID asc
    