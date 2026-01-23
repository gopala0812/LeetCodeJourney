package Smallest_Even_Multiple_2413;

import java.util.*;

class SmallestEvenMultiple {

    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0) {
            return n;
        }

        int r = n;
        int result;
        n += 1;

        while(true) {
            if(n % r == 0 && n % 2 == 0) {
                result = n;
                break;
            }
            n += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        SmallestEvenMultiple obj = new SmallestEvenMultiple();
        System.out.println(obj.smallestEvenMultiple(5)); // 10
        System.out.println(obj.smallestEvenMultiple(6)); // 6
    }
}
