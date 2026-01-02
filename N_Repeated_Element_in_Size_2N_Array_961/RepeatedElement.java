package N_Repeated_Element_in_Size_2N_Array_961;

import java.util.*;

class RepeatedElement {

    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        RepeatedElement obj = new RepeatedElement();
        int[] nums = {1, 2, 3, 3};
        System.out.println(obj.repeatedNTimes(nums)); // 3
    }
}
