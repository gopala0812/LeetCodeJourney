package Count_Negative_Numbers_in_a_Sorted_Matrix_1351;

import java.util.*;

class CountNegatives {

    public int countNegatives(int[][] grid) {
        int negative = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    negative += 1;
                }
            }
        }
        return negative;
    }

    public static void main(String[] args) {
        CountNegatives obj = new CountNegatives();
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        System.out.println(obj.countNegatives(grid)); // 8
    }
}
