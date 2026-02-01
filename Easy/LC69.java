package Easy;

public class LC69 {

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        if (x == 1) {
            return 1;
        }

        int max_val = 0;
        for (int i = 0; i <= x / 2; i++) {
            if (i <= x / i) {
                max_val = i;
            }
        }

        return max_val;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2));
    }
}
