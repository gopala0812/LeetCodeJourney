package Sum_of_Unique_Elements_1748;

import java.util.*;

class SumOfUnique {

    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int sum = 0;
        for(int n : map.keySet()) {
            if(map.get(n) == 1) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfUnique obj = new SumOfUnique();
        int[] nums = {1, 2, 3, 2};
        System.out.println(obj.sumOfUnique(nums)); 
    }
}
