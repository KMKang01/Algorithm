select ai.name as 'NAME', ai.datetime as 'DATETIME'
from animal_ins as ai
where  not exists (
    select ao.animal_id from animal_outs as ao
    where ai.animal_id = ao.animal_id
)
order by ai.datetime asc
limit 3
;