select aout.animal_id as 'ANIMAL_ID', aout.NAME as 'NAME'
from animal_outs as aout
where aout.animal_id not in (
    select animal_id from animal_ins
)

