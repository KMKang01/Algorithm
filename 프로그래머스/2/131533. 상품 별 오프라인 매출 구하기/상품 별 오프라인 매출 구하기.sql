select
pd.product_code as 'PRODUCT_CODE' ,
pd.price * sum(os.sales_amount) as 'SALES'
from product as pd
    inner join offline_sale as os on pd.product_id = os.product_id
group by pd.product_code
order by SALES DESC, PRODUCT_CODE ASC
