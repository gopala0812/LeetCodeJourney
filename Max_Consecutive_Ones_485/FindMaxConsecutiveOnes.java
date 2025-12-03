package Max_Consecutive_Ones_485;

import java.util.*;

class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        FindMaxConsecutiveOnes obj = new FindMaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        System.out.println(obj.findMaxConsecutiveOnes(nums)); // 3
    }
}
