# Write your MySQL query statement below
select e.name as Employee FROM employee e JOIN employee m on e.managerId = m.id WHERE e.salary>m.salary;