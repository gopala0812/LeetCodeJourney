package Sum_of_Squares_of_Special_Elements_2778;

import java.util.*;

class SumOfSquares {

    public int sumOfSquares(int[] nums) {
        int squares = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums.length % (i + 1) == 0) {
                squares += nums[i] * nums[i];
            }
        }
        return squares;
    }

    public static void main(String[] args) {
        SumOfSquares obj = new SumOfSquares();
        int[] nums = {1, 2, 3, 4};
        System.out.println(obj.sumOfSquares(nums)); // 21
    }
}
