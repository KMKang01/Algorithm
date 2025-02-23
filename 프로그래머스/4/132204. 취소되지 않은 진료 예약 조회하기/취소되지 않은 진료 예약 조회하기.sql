select
    a.apnt_no as 'APNT_NO', p.pt_name as 'PT_NAME', p.pt_no as 'PT_NO',
    a.mcdp_cd as 'MCDP_CD', d.dr_name as 'DR_NAME', a.apnt_ymd as 'APNT_YMD'
from appointment as a 
    inner join patient as p on a.pt_no = p.pt_no
    inner join doctor as d on a.mddr_id = d.dr_id
where a.mcdp_cd = 'CS' and left(a.apnt_ymd, 10) = '2022-04-13' and a.apnt_cncl_yn = 'N'
order by a.apnt_ymd asc
    

