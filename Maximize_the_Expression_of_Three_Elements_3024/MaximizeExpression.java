package Maximize_the_Expression_of_Three_Elements_3024;

import java.util.*;

class MaximizeExpression {

    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int sum = nums[nums.length - 1] + nums[nums.length - 2];
        return sum - nums[0];
    }

    public static void main(String[] args) {
        MaximizeExpression obj = new MaximizeExpression();
        int[] nums = {1, 2, 3, 4};
        System.out.println(obj.maximizeExpressionOfThree(nums)); // 6
    }
}
