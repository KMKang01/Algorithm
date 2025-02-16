select
    animal_type as 'ANIMAL_TYPE',
    case 
        when name is null then 'No name'
        else name
    end as 'NAME',
    SEX_UPON_INTAKE 
from animal_ins