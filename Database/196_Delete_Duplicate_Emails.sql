DELETE From person p1 -- bảng 1 nơi xóa
    Using person p2 -- bản sao
WHERE p1.email = p2.email
  AND p1.id > p2.id; -- hàng nào có id lớn hơn sẽ bị xóa