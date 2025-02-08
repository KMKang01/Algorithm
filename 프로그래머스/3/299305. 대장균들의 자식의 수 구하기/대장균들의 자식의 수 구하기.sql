-- select e1.id, count(e1.parent_id)
select e1.id as ID, count(e2.parent_id) as CHILD_COUNT
from ECOLI_DATA as e1
    left outer join ecoli_data as e2 on e1.id = e2.parent_id
group by e1.id