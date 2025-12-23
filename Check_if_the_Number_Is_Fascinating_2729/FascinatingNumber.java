package Check_if_the_Number_Is_Fascinating_2729;

import java.util.*;

class FascinatingNumber {

    public boolean isFascinating(int n) {
        String s = "" + n + 2 * n + 3 * n;

        if(s.length() != 9) {
            return false;
        }

        HashSet<Character> result = new HashSet<>();

        for(char c : s.toCharArray()) {
            if(c == '0') {
                return false;
            }
            result.add(c);
        }

        return result.size() == 9;
    }

    public static void main(String[] args) {
        FascinatingNumber obj = new FascinatingNumber();
        System.out.println(obj.isFascinating(192)); // true
        System.out.println(obj.isFascinating(100)); // false
    }
}
