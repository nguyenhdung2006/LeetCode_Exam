SELECT e.name AS Employee
From Employee e
Join Employee m ON e.managerId = m.id
Where e.salary > m.salary;