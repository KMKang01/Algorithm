-- 코드를 작성해주세요
select count(*) as 'FISH_COUNT'
from fish_info as fi
    inner join fish_name_info as fni on fi.fish_type = fni.fish_type
where fish_name = 'BASS' or fish_name = 'SNAPPER'

