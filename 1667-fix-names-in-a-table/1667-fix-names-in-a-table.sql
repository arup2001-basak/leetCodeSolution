# Write your MySQL query statement below
# Time:  O(nlogn)
# Space: O(n)

select user_id, concat(UPPER(substring(name,1,1)) , LOWER(substring(name,2))) as name
from users
order by user_id;