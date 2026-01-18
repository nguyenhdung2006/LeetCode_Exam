package Easy;

public class LC14 {

    public static int shortestString(String[] s) {
        int min = s[0].length();
        for (int i = 1; i < s.length; i++) {
            if (s[i].length() < min) {
                min = s[i].length();
            }
        }

        return min;
    }

    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int lengthOfString = shortestString(strs);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lengthOfString; i++) { // letter index
            char letter = strs[0].charAt(i);

            for (int j = 1; j < n; j++) { // String index
                if (strs[j].charAt(i) != letter) {
                    return result.toString();
                }
            }
            result.append(letter);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LC14 lc = new LC14();
        String[] s = { "flower", "flow", "flight" };
        System.out.println(lc.longestCommonPrefix(s));
    }
}
