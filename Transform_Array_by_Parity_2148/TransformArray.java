package Transform_Array_by_Parity_2148;

import java.util.*;

class TransformArray {

    public int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        TransformArray obj = new TransformArray();
        int[] nums = {4, 3, 2, 1};
        System.out.println(Arrays.toString(obj.transformArray(nums)));
        // Output: [0, 0, 1, 1]
    }
}
