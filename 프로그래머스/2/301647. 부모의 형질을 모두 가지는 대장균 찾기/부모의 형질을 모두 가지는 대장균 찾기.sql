-- 코드를 작성해주세요
-- conv(N, from_base, to_base)
-- 1 -> 1번을 가짐
-- 10 -> 2번을 가짐
-- 11 -> 1, 2번을 가짐

-- 글자수 LENGTH()
-- RIGHT() 사용
-- 부모 형질을 포함해야함
-- GENOTYPE을 이진수로 변환한 수를 부모 GENOTYPE의 길이만큼 RIGHT()하여 잘랐을 때 일치하면 형질을 포함하는 것.

 select A.ID as ID, A.GENOTYPE as GENOTYPE, B.GENOTYPE as PARENT_GENOTYPE
 from ecoli_data A
 join ecoli_data B on A.PARENT_ID = B.ID
 where A.GENOTYPE & B.GENOTYPE = B.GENOTYPE
 order by A.ID