package Minimum_Element_After_Replacement_With_Digit_Sum_3300;

import java.util.*;

class MinimumElement {

    public int minElement(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            while(nums[i] > 0) {
                int digit = nums[i] % 10;
                sum += digit;
                nums[i] /= 10;
            }
            result[i] = sum;
        }

        Arrays.sort(result);
        return result[0];
    }

    public static void main(String[] args) {
        MinimumElement obj = new MinimumElement();
        int[] nums = {10, 21, 30};
        System.out.println(obj.minElement(nums)); // 1
    }
}
