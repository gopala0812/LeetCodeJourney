package Alternating_Sum_of_an_Array_1914;

import java.util.*;

class AlternatingSum {

    public int alternatingSum(int[] nums) {
        int even = 0;
        int odd = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                even += nums[i];
            } else {
                odd += nums[i];
            }
        }
        return even - odd;
    }

    public static void main(String[] args) {
        AlternatingSum obj = new AlternatingSum();
        int[] nums = {4, 2, 5, 3};
        System.out.println(obj.alternatingSum(nums)); 
    }
}
