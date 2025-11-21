package Maximum_Product_of_Three_Numbers_628;

import java.util.Arrays;

public class MaxProductCalculator {

    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int x : nums) {
            // Update the three largest values
            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }

            // Update the two smallest values
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }

        long prod1 = 1L * max1 * max2 * max3;
        long prod2 = 1L * max1 * min1 * min2;

        return (int) Math.max(prod1, prod2);
    }

    public static void main(String[] args) {
        int[] arr = {-10, -10, 5, 2};

        System.out.println("Input: " + Arrays.toString(arr));
        int result = maximumProduct(arr);
        System.out.println("Maximum Product of Three Numbers = " + result);
    }
}