package Maximum_Product_of_Two_Elements_in_an_Array_1464;

import java.util.*;

class MaxProduct {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1] - 1;
        int b = nums[nums.length - 2] - 1;
        return a * b;
    }

    public static void main(String[] args) {
        MaxProduct obj = new MaxProduct();
        int[] nums = {3, 4, 5, 2};
        System.out.println(obj.maxProduct(nums));
    }
}
