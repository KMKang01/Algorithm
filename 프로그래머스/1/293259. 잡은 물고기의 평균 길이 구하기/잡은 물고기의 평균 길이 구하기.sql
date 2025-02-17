select round(avg(t1.length), 2) as 'AVERAGE_LENGTH'
from (
    select
        case
            when length is null then 10
            else length
        end as length
    from fish_info
) as t1