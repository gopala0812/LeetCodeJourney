package Recover_the_Original_Array_2855;

import java.util.*;

class RecoverOrder {

    public int[] recoverOrder(int[] order, int[] friends) {
        int result[] = new int[friends.length];
        int k = 0;

        for(int i = 0; i < order.length; i++) {
            for(int j = 0; j < friends.length; j++) {
                if(order[i] == friends[j]) {
                    result[k] = order[i];
                    k++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RecoverOrder obj = new RecoverOrder();
        int[] order = {3, 1, 2, 5, 4};
        int[] friends = {1, 3, 4};

        System.out.println(Arrays.toString(obj.recoverOrder(order, friends)));
        // Output: [3, 1, 4]
    }
}
