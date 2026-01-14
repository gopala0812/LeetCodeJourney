package Check_if_a_Number_Is_Divisible_by_the_Sum_and_Product_of_Its_Digits_2997;

import java.util.*;

class CheckDivisibility {

    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int num = n;

        while(n != 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }

        int div = sum + prod;
        return num % div == 0;
    }

    public static void main(String[] args) {
        CheckDivisibility obj = new CheckDivisibility();
        System.out.println(obj.checkDivisibility(99)); // true
        System.out.println(obj.checkDivisibility(23)); // false
    }
}
