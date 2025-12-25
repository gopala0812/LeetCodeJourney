package Difference_Between_Element_Sum_and_Digit_Sum_2535;

import java.util.*;

class DifferenceOfSum {

    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;

        for(int i = 0; i < nums.length; i++) {
            esum += nums[i];
            while(nums[i] > 0) {
                int d = nums[i] % 10;
                dsum += d;
                nums[i] /= 10;
            }
        }
        return esum - dsum;
    }

    public static void main(String[] args) {
        DifferenceOfSum obj = new DifferenceOfSum();
        int[] nums = {1, 15, 6, 3};
        System.out.println(obj.differenceOfSum(nums)); // 9
    }
}
