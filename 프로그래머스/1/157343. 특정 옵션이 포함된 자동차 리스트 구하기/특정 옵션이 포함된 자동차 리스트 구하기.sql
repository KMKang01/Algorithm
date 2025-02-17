select *
from car_rental_company_car
where instr(options, '네비게이션') > 0
order by car_id desc