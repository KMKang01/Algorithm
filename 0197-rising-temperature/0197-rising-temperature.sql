# Write your MySQL query statement below
SELECT w2.id
FROM Weather as w1
   inner join Weather as w2 on ADDDATE(w1.recordDate, 1) = w2.recordDate
where w1.temperature < w2.temperature
order by w1.id
;