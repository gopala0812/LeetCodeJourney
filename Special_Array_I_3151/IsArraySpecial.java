package Special_Array_I_3151;

import java.util.*;

class IsArraySpecial {

    public boolean isArraySpecial(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsArraySpecial obj = new IsArraySpecial();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 4, 6};

        System.out.println(obj.isArraySpecial(nums1)); // true
        System.out.println(obj.isArraySpecial(nums2)); // false
    }
}
