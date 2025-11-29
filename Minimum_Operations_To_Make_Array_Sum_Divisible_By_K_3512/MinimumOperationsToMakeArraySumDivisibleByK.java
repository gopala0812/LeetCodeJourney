package Minimum_Operations_To_Make_Array_Sum_Divisible_By_K_3512;

import java.util.*;

class MinimumOperationsToMakeArraySumDivisibleByK {

    public int minOperations(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % k == 0) {
            return 0;
        } else {
            return sum % k;
        }
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeArraySumDivisibleByK obj =
                new MinimumOperationsToMakeArraySumDivisibleByK();

        int[] nums = {3, 1, 4};
        int k = 5;

        int result = obj.minOperations(nums, k);
        System.out.println(result);
    }
}
