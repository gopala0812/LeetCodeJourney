package Harshad_Number_3099;

import java.util.*;

class HarshadNumber {

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int n = x;

        while(n != 0) {
            sum += (n % 10);
            n /= 10;
        }

        if(x % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        HarshadNumber obj = new HarshadNumber();
        System.out.println(obj.sumOfTheDigitsOfHarshadNumber(18)); // 9
        System.out.println(obj.sumOfTheDigitsOfHarshadNumber(23)); // -1
    }
}
