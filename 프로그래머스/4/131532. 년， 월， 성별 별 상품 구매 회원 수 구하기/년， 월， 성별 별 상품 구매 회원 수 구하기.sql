-- 코드를 입력하세요

SELECT 
    year(os.sales_date) as 'YEAR', 
    month(os.sales_date) as 'MONTH', 
    ui.gender as 'GENDER', 
    COUNT(distinct os.user_id) as 'USERS'
FROM USER_INFO as ui
    INNER JOIN ONLINE_SALE as os ON ui.user_id = os.user_id
where ui.gender IS NOT NULL
group by  YEAR, MONTH, GENDER
order by  YEAR, MONTH, GENDER
;

/*
select year(os.sales_date) as 'YEAR', month(os.sales_date) as 'MONTH',
    ui.gender as 'GENDER', count(GENDER) as USERS
FROM USER_INFO as ui
    INNER JOIN ONLINE_SALE as os ON ui.user_id = os.user_id
    where ui.gender IS NOT NULL
group by YEAR, MONTH, GENDER
order by YEAR, MONTH, GENDER
;
*/