

select ai.animal_id as 'ANIMAL_ID', ai.name as 'NAME'
from animal_ins as ai
    inner join (
        select ai.animal_id as 'id', datediff(ao.datetime, ai.datetime) as 'date'
        from animal_ins as ai
            inner join animal_outs as ao on ai.animal_id = ao.animal_id
        order by date desc
        limit 2
    ) as t1 on ai.animal_id = t1.id