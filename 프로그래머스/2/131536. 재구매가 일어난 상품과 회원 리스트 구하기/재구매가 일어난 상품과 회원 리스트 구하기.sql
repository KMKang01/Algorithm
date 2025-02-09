-- 코드를 입력하세요

select t1.user_id as 'USER_ID', t1.product_id as 'PRODUCT_ID'
from online_sale as t1
    inner join online_sale as t2 on t1.user_id = t2.user_id
        and t1.product_id = t2.product_id
group by USER_ID, PRODUCT_ID
having count(t1.PRODUCT_ID) >= 2
order by USER_ID asc, PRODUCT_ID desc
;

/*
select user_id, product_id from online_sale
group by user_id
having count(user_id) >= 2



select USER_ID, PRODUCT_ID
from online_sale
 group by user_id, product_id
 having count(product_id) >= 2
order by user_id
*/


/*
select *
from online_sale as t1
    inner join online_sale as t2
where t1.user_id in (1, 2)
order by t1.user_id asc, t1.product_id desc
limit 10
;
*/