package Matrix_Diagonal_Sum_1572;

import java.util.*;

class DiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if(i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        DiagonalSum obj = new DiagonalSum();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(obj.diagonalSum(mat)); // 25
    }
}
