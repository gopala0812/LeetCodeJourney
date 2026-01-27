package To_Lower_Case_709;

import java.util.*;

class ToLowerCase {

    public String toLowerCase(String s) {
        String r = s.toLowerCase();
        return r;
    }

    public static void main(String[] args) {
        ToLowerCase obj = new ToLowerCase();
        System.out.println(obj.toLowerCase("Hello")); // hello
        System.out.println(obj.toLowerCase("LOVELY")); // lovely
    }
}
