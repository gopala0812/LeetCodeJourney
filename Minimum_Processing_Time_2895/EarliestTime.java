package Minimum_Processing_Time_2895;

import java.util.*;

class EarliestTime {

    public int earliestTime(int[][] tasks) {
        int[] sums = new int[tasks.length];

        for(int i = 0; i < tasks.length; i++) {
            int sum = 0;
            for(int j = 0; j < tasks[i].length; j++) {
                sum += tasks[i][j];
            }
            sums[i] = sum;
        }

        Arrays.sort(sums);
        return sums[0];
    }

    public static void main(String[] args) {
        EarliestTime obj = new EarliestTime();
        int[][] tasks = {
            {1, 2, 3},
            {3, 1, 1},
            {2, 2, 2}
        };
        System.out.println(obj.earliestTime(tasks)); // 5
    }
}
