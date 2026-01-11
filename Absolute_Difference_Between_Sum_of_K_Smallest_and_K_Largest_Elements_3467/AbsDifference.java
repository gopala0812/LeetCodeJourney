package Absolute_Difference_Between_Sum_of_K_Smallest_and_K_Largest_Elements_3467;

import java.util.*;

class AbsDifference {

    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int min = 0;
        int max = 0;

        for(int i = 0; i < k; i++) {
            min += nums[i];
        }

        int j = k;
        int x = nums.length - 1;
        while(j != 0) {
            max += nums[x];
            x--;
            j--;
        }

        return Math.abs(min - max);
    }

    public static void main(String[] args) {
        AbsDifference obj = new AbsDifference();
        int[] nums = {3, 1, 5, 2, 9, 8};
        int k = 2;
        System.out.println(obj.absDifference(nums, k)); // 13
    }
}
