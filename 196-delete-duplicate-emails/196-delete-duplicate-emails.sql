# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE b 
FROM Person a , Person b 
where a.Email = b.Email
AND a.Id < b.Id;
