package Find_N_Unique_Integers_Sum_up_to_Zero_1304;

import java.util.*;

class SumZero {

    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        if(n % 2 != 0) {
            result[index++] = 0;
        }

        for(int i = 1; index < n; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        return result;
    }

    public static void main(String[] args) {
        SumZero obj = new SumZero();
        System.out.println(Arrays.toString(obj.sumZero(5)));
    }
}
