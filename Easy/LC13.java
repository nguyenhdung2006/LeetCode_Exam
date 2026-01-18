package Easy;

public class LC13 {

    boolean validSubtractive(char a, char b) {
        return (a == 'I' && (b == 'V' || b == 'X')) ||
                (a == 'X' && (b == 'L' || b == 'C')) ||
                (a == 'C' && (b == 'D' || b == 'M'));
    }

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
        return -1;
    }

    public int romanToInt(String s) {
        int n = s.length();
        int sumDigit = 0;
        int repeat = 1;

        for (int i = 0; i < n; i++) {
            int cur = value(s.charAt(i));

            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                repeat++;

                if (s.charAt(i) == 'V' || s.charAt(i) == 'L' || s.charAt(i) == 'D') {
                    return -1;
                }

                if (repeat > 3) {
                    return -1;
                }
            } else {
                repeat = 1;
            }

            if (i < n - 1) {
                int next = value(s.charAt(i + 1));
                if (cur < next) {
                    if (!validSubtractive(s.charAt(i), s.charAt(i + 1))) {
                        return -1;
                    } else {
                        sumDigit -= cur;
                        continue;
                    }
                }
            }
            sumDigit += cur;
        }

        return sumDigit;
    }

    public static void main(String[] args) {
        LC13 lc = new LC13();
        String s = "XCIX";

        int res = lc.romanToInt(s);

        System.out.println(res);
    }
}
