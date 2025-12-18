package Divisible_and_Non_divisible_Sums_Difference_2894;

import java.util.*;

class DifferenceOfSums {

    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int i = 1; i <= n; i++) {
            if(i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        DifferenceOfSums obj = new DifferenceOfSums();
        System.out.println(obj.differenceOfSums(10, 3)); // 19
    }
}
