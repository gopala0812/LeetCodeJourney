package Single_Number_136;

import java.util.*;

class SingleNumber {

    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int n : nums) {
            ans ^= n;
        }
        return ans;
    }

    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(obj.singleNumber(nums)); // 4
    }
}
