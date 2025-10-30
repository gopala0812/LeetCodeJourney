package Missing_Number_268;

import java.util.*;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;

        int total = (n * (n + 1)) / 2; // Formula for sum of first n natural numbers
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
    	int[] nums = {3, 0, 1}; 
        System.out.println("Missing Number: " + missingNumber(nums));
    }
}