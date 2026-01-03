package How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365;

import java.util.*;

class SmallerNumbers {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sorted.length; i++) {
            if(!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        SmallerNumbers obj = new SmallerNumbers();
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(nums)));
        // Output: [4, 0, 1, 1, 3]
    }
}
