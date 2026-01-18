package Easy;

import java.util.Stack;

public class LC20 {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // gặp ngoặc mở thì push
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else if (c == ')' || c == ']' || c == '}') { // gặp ngoặc đóng

                // đóng mà không có mở
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                // không khớp cặp
                if ((top == '(' && c != ')') ||
                        (top == '[' && c != ']') ||
                        (top == '{' && c != '}')) {
                    return false;
                }
            }
        }

        // còn ngoặc mở chưa đóng
        return st.isEmpty();
    }

    public static void main(String[] args) {
        LC20 lc = new LC20();
        String s = "([]{";
        System.out.println(lc.isValid(s)); // true
    }
}