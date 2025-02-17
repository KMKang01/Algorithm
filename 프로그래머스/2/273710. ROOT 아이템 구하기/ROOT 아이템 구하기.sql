select ii.item_id as 'ITEM_ID', ii.item_name as 'ITEM_NAME'
from item_info as ii
    inner join item_tree as it on ii.item_id = it.item_id
where it.parent_item_id is null
