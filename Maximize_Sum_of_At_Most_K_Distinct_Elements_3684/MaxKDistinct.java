package Maximize_Sum_of_At_Most_K_Distinct_Elements_3684;

import java.util.*;

class MaxKDistinct {

    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        int[] unique = new int[set.size()];
        int idx = 0;
        for(int n : set) {
            unique[idx++] = n;
        }

        Arrays.sort(unique);

        int size = Math.min(k, unique.length);
        int[] result = new int[size];

        int j = 0;
        for(int i = unique.length - 1; i >= 0 && j < size; i--) {
            result[j++] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {
        MaxKDistinct obj = new MaxKDistinct();
        int[] nums = {4, 2, 5, 2, 1, 5};
        int k = 3;

        System.out.println(Arrays.toString(obj.maxKDistinct(nums, k)));
        // Output: [5, 4, 2]
    }
}
