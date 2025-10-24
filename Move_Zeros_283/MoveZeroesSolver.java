package Move_Zeros_283;

import java.util.Arrays;

public class MoveZeroesSolver {
    
    // Method to move all zeros to the end
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                // Swap only if current and lastNonZeroFoundAt are different
                int temp = nums[current];
                nums[current] = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = temp;

                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroesSolver solver = new MoveZeroesSolver();

        // Test cases
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] nums2 = {0, 0, 1};
        int[] nums3 = {1, 0, 1, 0};

        solver.moveZeroes(nums1);
        solver.moveZeroes(nums2);
        solver.moveZeroes(nums3);

        System.out.println("After moving zeros:");
        System.out.println("Test 1: " + Arrays.toString(nums1));
        System.out.println("Test 2: " + Arrays.toString(nums2));
        System.out.println("Test 3: " + Arrays.toString(nums3));
    }
}
