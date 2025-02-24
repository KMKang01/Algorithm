select
animal_id, name, left(datetime, 10) as 'DATETIME'
from animal_ins
order by animal_id asc;
