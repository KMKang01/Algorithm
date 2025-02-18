select distinct a.car_id as 'CAR_ID'
from CAR_RENTAL_COMPANY_CAR as a
    inner join CAR_RENTAL_COMPANY_RENTAL_HISTORY as b on a.car_id = b.car_id
where car_type = '세단' and start_date between '2022-10-01' and '2022-10-31'
order by a.car_id desc;