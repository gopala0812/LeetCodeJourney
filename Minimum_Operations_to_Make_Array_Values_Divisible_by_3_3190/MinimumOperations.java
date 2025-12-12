package Minimum_Operations_to_Make_Array_Values_Divisible_by_3_3190;

import java.util.*;

class MinimumOperations {

    public int minimumOperations(int[] nums) {
        int result = 0;
        for(int num : nums) {
            if(num % 3 != 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MinimumOperations obj = new MinimumOperations();
        int[] nums = {1, 2, 3, 4};
        System.out.println(obj.minimumOperations(nums)); // 3
    }
}
