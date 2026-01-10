package Mirror_Distance_of_an_Integer_3783;

import java.util.*;

class MirrorDistance {

    public int mirrorDistance(int n) {
        int rev = 0;
        int num = n;

        while(n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        return Math.abs(num - rev);
    }

    public static void main(String[] args) {
        MirrorDistance obj = new MirrorDistance();
        System.out.println(obj.mirrorDistance(123)); 
        System.out.println(obj.mirrorDistance(21));  
    }
}
