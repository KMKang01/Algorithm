select fi1.ID as 'ID', fni.fish_name as 'FISH_NAME', fi1.length as 'LENGTH'
from fish_info as fi1
    inner join (
    select fish_type as 'ft', max(length) as 'len'
    from fish_info
    group by fish_type
) as fi2 on fi1.fish_type = fi2.ft and fi1.length = fi2.len
    inner join fish_name_info as fni on fi1.fish_type = fni.fish_type
;