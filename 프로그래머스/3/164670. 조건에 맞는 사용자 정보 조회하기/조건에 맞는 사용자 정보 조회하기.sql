select distinct
    ugu.user_id as 'USER_ID', ugu.nickname as 'NICKNAME', 
    concat_ws(' ', ugu.city,  ugu.street_address1, ugu.street_address2) as '전체주소',
    concat_ws('-', left(ugu.tlno, 3), mid(ugu.tlno, 4, 4), right(ugu.tlno, 4)) as '전화번호'
from used_goods_board as ugb
    inner join used_goods_user as ugu on ugb.writer_id = ugu.user_id
where ugb.writer_id in 
(
    select writer_id
    from used_goods_board
    group by writer_id
    having count(writer_id) >= 3
)
order by USER_ID desc;