-- 코드를 작성해주세요
select count(*) as 'COUNT'
from ecoli_data
where RIGHT(CONV(GENOTYPE, 10, 2), 3) in ( '101', '1', '100', '001' )
;


