package Separate_the_Digits_in_an_Array_2553;

import java.util.*;

class SeparateDigits {

    public int[] separateDigits(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int element = nums[i];
            while(element != 0) {
                element /= 10;
                count++;
            }
        }

        int[] digits = new int[count];

        for(int i = nums.length - 1; i >= 0; i--) {
            while(nums[i] != 0) {
                int d = nums[i] % 10;
                digits[count - 1] = d;
                nums[i] /= 10;
                count--;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        SeparateDigits obj = new SeparateDigits();
        int[] nums = {13, 25, 83};
        System.out.println(Arrays.toString(obj.separateDigits(nums)));
        // Output: [1, 3, 2, 5, 8, 3]
    }
}
