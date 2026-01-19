package Easy;

import java.util.Scanner;

public class LC09 {

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String space = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            space += s.charAt(i);
        }

        if (s.equals(space)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        LC09 lc = new LC09();
        if (lc.isPalindrome(x)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}