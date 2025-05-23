select 
    board_id, writer_id, title, price,
    case status
        when 'DONE' then '거래완료'
        when 'SALE' then '판매중'
        when 'RESERVED' then '예약중'
    end as 'STATUS'
from USED_GOODS_BOARD
where created_date = '2022-10-05'
order by board_id desc