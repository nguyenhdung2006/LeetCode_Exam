package Easy;

public class LC58 {

    public int lengthOfLastWord(String s) {
        String[] parts = s.split(" ");
        int n = parts[parts.length - 1].length();
        int wordLength = 0;

        for (int i = 1; i <= n; i++) {
            wordLength++;
        }

        return wordLength;
    }

    public static void main(String[] args) {
        LC58 lc = new LC58();
        String s = "Hello world";
        int k = lc.lengthOfLastWord(s);
        System.out.println(k);
    }
}
