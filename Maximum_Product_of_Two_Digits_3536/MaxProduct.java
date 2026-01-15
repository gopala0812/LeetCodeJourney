package Maximum_Product_of_Two_Digits_3536;

import java.util.*;

class MaxProduct {

    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;

        while(n != 0) {
            int d = n % 10;
            if(d > max1) {
                max2 = max1;
                max1 = d;
            } else if(d > max2) {
                max2 = d;
            }
            n /= 10;
        }
        return max1 * max2;
    }

    public static void main(String[] args) {
        MaxProduct obj = new MaxProduct();
        System.out.println(obj.maxProduct(123)); // 6
        System.out.println(obj.maxProduct(987)); // 72
    }
}
