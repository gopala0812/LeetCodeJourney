package Reverse_Prefix_3794;

import java.util.*;

class ReversePrefix {

    public String reversePrefix(String s, int k) {
        String st = "";

        for(int i = k - 1; i >= 0; i--) {
            st += s.charAt(i);
        }

        for(int i = k; i < s.length(); i++) {
            st += s.charAt(i);
        }

        return st;
    }

    public static void main(String[] args) {
        ReversePrefix obj = new ReversePrefix();
        System.out.println(obj.reversePrefix("abcdef", 3)); // cbadef
        System.out.println(obj.reversePrefix("leetcode", 4)); // teelcode
    }
}
