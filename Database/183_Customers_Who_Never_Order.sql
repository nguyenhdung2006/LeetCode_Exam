Select c.name AS Customers
From Customers c
Left Join Orders o
ON c.id = o.customerId
WHERE o.customerId is null;