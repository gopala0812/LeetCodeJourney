package Minimum_Number_of_Boxes_to_Store_Apples_3074;

import java.util.*;

class MinimumBoxes {

    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;

        for(int n : apple) {
            total += n;
        }

        Arrays.sort(capacity);
        int count = 0;

        for(int i = capacity.length - 1; i >= 0; i--) {
            if(capacity[i] >= total) {
                return ++count;
            } else {
                total -= capacity[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MinimumBoxes obj = new MinimumBoxes();
        int[] apple = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5};

        System.out.println(obj.minimumBoxes(apple, capacity)); // 2
    }
}
