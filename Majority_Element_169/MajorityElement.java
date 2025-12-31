package Majority_Element_169;

import java.util.*;

class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int majority = nums.length / 2;

        for(Integer key : map.keySet()) {
            if(map.get(key) > majority) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(obj.majorityElement(nums)); // 2
    }
}
