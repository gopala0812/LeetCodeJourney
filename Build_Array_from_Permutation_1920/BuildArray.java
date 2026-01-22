package Build_Array_from_Permutation_1920;

import java.util.*;

class BuildArray {

    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public static void main(String[] args) {
        BuildArray obj = new BuildArray();
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(obj.buildArray(nums)));
    }
}
