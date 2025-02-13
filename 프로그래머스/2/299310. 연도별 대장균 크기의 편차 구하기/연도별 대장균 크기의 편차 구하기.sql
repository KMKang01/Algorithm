select
    year(e1.differentiation_date) as 'YEAR',
    t1.max - e1.size_of_colony as 'YEAR_DEV',
    e1.ID as 'ID'
from
    ecoli_data as e1
    left join (
        select year(differentiation_date) as 'YEAR', max(size_of_colony) as 'max'
        from ecoli_data
        group by year(differentiation_date)
    ) as t1 on year(e1.differentiation_date) = t1.YEAR
order by YEAR asc, YEAR_DEV ASC
;