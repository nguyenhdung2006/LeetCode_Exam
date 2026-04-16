Select w1.id
From Weather w1
JOIN Weather w2 -- w1 là hôm sau của w2
ON w1.recordDate = w2.recordDate + INTERVAL '1 day' -- interval: biểu diễn khoảng time như 1 giờ, 2 giờ,....
WHERE w1.temperature > w2.temperature;