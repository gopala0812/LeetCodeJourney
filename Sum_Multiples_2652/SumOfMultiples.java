package Sum_Multiples_2652;

import java.util.*;

class SumOfMultiples {

    public int sumOfMultiples(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SumOfMultiples obj = new SumOfMultiples();
        System.out.println(obj.sumOfMultiples(7)); 
    }
}
