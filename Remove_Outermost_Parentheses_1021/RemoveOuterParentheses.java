package Remove_Outermost_Parentheses_1021;

import java.util.*;

class RemoveOuterParentheses {

    public String removeOuterParentheses(String s) {
        StringBuilder fin = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) fin.append(ch);
                depth++;
            } else {
                depth--;
                if (depth > 0) fin.append(ch);
            }
        }

        return fin.toString();
    }

    public static void main(String[] args) {
        RemoveOuterParentheses obj = new RemoveOuterParentheses();
        System.out.println(obj.removeOuterParentheses("(()())(())")); 
    }
}
