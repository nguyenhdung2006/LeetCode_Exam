package Easy;

public class LC13 {

    // Kiểm tra phép trừ có hợp lệ hay không
    // I chỉ trừ cho V, X
    // X chỉ trừ cho L, C
    // C chỉ trừ cho D, M
    boolean validSubtractive(char a, char b) {
        return (a == 'I' && (b == 'V' || b == 'X')) ||
                (a == 'X' && (b == 'L' || b == 'C')) ||
                (a == 'C' && (b == 'D' || b == 'M'));
    }

    // Trả về giá trị số tương ứng của ký tự La Mã
    int value(char c) {
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return -1; // ký tự không hợp lệ
    }

    // Hàm chuyển số La Mã sang số nguyên
    public int romanToInt(String s) {
        int n = s.length();
        int sumDigit = 0; // tổng kết quả
        int repeat = 1; // đếm số lần lặp ký tự liên tiếp

        // Duyệt từng ký tự từ trái sang phải
        for (int i = 0; i < n; i++) {
            int cur = value(s.charAt(i));

            // Kiểm tra lặp ký tự
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                repeat++;

                // V, L, D không được lặp
                if (s.charAt(i) == 'V' || s.charAt(i) == 'L' || s.charAt(i) == 'D') {
                    return -1;
                }

                // I, X, C, M không được lặp quá 3 lần
                if (repeat > 3) {
                    return -1;
                }
            } else {
                repeat = 1;
            }

            // Kiểm tra phép trừ
            if (i < n - 1) {
                int next = value(s.charAt(i + 1));

                // Nếu ký tự sau lớn hơn ký tự hiện tại → trừ
                if (cur < next) {
                    // Kiểm tra trừ có đúng luật không
                    if (!validSubtractive(s.charAt(i), s.charAt(i + 1))) {
                        return -1;
                    } else {
                        sumDigit -= cur;
                        continue;
                    }
                }
            }

            // Trường hợp cộng bình thường
            sumDigit += cur;
        }

        return sumDigit;
    }

    public static void main(String[] args) {
        LC13 lc = new LC13();

        // Ví dụ test
        String s = "XCIX"; // 99

        int res = lc.romanToInt(s);
        System.out.println(res);
    }
}
