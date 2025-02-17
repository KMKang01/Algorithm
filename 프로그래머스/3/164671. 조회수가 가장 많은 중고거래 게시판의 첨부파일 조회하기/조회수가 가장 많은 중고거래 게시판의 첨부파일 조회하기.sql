select
   concat('/', concat_ws('/', 'home', 'grep', 'src',
              ugf.board_id, concat(ugf.file_id, ugf.file_name, ugf.file_ext))) as 'FILE_PATH'
from USED_GOODS_BOARD as ugb
    inner join USED_GOODS_FILE as ugf on ugb.board_id = ugf.board_id
where ugf.board_id = (
    select board_id
    from USED_GOODS_BOARD 
    order by `views` desc
    limit 1
)
order by ugf.file_id desc