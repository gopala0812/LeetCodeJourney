package Contains_Duplicate_217;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return nums.length != set.size();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println("Array 1 has duplicate? " + containsDuplicate(nums1)); // false
        System.out.println("Array 2 has duplicate? " + containsDuplicate(nums2)); // true
    }
}
