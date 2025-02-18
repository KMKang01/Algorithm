select
    history_id as 'HISTORY_ID',
    car_id as 'CAR_ID',
    left(start_date, 10) as 'START_DATE',
    left(end_date, 10) as 'END_DATE',
    case 
        when datediff(end_date, start_date) + 1 >= 30 then '장기 대여'
        else '단기 대여'
    end as 'RENT_TYPE'
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where start_date between '2022-09-01' and '2022-09-30'
order by history_id desc