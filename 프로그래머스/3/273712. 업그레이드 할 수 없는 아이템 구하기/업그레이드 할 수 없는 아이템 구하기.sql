select
    ii.item_id as 'ITEM_ID',
    ii.item_name as 'ITEM_NAME',
    ii.RARITY as 'RARITY'
from item_info as ii
where not exists (
    select item_id
    from item_tree as it
    where it.parent_item_id = ii.item_id
)
order by item_id desc;