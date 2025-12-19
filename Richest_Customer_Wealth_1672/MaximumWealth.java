package Richest_Customer_Wealth_1672;

import java.util.*;

class MaximumWealth {

    public int maximumWealth(int[][] accounts) {
        int[] total = new int[accounts.length];
        int index = 0;
        int t = 0;

        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                t += accounts[i][j];
            }
            total[index] = t;
            index++;
            t = 0;
        }

        Arrays.sort(total);
        return total[total.length - 1];
    }

    public static void main(String[] args) {
        MaximumWealth obj = new MaximumWealth();
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };
        System.out.println(obj.maximumWealth(accounts)); // 6
    }
}
