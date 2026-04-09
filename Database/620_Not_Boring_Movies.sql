Select * From Cinema
Where description != 'boring' AND id % 2 <> 0
order by rating DESC;