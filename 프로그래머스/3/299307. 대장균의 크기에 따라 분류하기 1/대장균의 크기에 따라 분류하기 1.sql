-- 코드를 작성해주세요
select id as ID, 
    case
        when size_of_colony <= 100 then 'LOW'
        when size_of_colony > 100 and size_of_colony <= 1000 then 'MEDIUM'
        when size_of_colony > 1000 then 'HIGH'
    end as SIZE
from ecoli_data
order by id asc