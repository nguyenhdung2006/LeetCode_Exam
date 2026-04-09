Select email
From Person
WHERE email is not null
GROUP BY email
Having Count(email) > 1;