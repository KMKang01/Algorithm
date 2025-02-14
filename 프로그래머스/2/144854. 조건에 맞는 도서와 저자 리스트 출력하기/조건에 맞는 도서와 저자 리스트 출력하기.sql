select b.book_id as 'BOOK_ID', a.author_name as 'AUTHOR_NAME', LEFT(b.published_date, 10) as 'PUBLISHED_DATE'
from book as b
    inner join author as a on b.author_id = a.author_id
where b.category = '경제'
order by PUBLISHED_DATE asc