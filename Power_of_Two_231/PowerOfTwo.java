package Power_of_Two_231;

import java.util.*;

class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }

        while(n > 1) {
            if(n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(16)); // true
        System.out.println(obj.isPowerOfTwo(18)); // false
    }
}
