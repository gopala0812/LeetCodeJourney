package Maximum_Product_Difference_Between_Two_Pairs_1913;

import java.util.*;

class MaxProductDifference {

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2]
             - nums[0] * nums[1];
    }

    public static void main(String[] args) {
        MaxProductDifference obj = new MaxProductDifference();
        int[] nums = {5, 6, 2, 7, 4};
        System.out.println(obj.maxProductDifference(nums)); // 34
    }
}
