# Write your MySQL query statement below
select employee_id,
case 
    when mod(employee_id,2) =  0 or substring(name,1,1) = 'M' then 0 
    else salary end as bonus
from Employees emp order by employee_id;