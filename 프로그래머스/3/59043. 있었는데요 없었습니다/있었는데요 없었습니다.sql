select ai.animal_id as 'ANIMAL_ID', ai.NAME as 'NAME'
from animal_ins as ai
    inner join animal_outs as ao on ai.animal_id = ao.animal_id
where timediff(ao.DATETIME, ai.DATETIME) < 0
order by ai.DATETIME ASC;
