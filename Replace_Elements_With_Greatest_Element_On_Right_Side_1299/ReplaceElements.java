package Replace_Elements_With_Greatest_Element_On_Right_Side_1299;

import java.util.*;

class ReplaceElements {

    public int[] replaceElements(int[] arr) {
        int max = -1;

        for(int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = max;
            if(current > max) {
                max = current;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        ReplaceElements obj = new ReplaceElements();
        int[] arr = {17, 18, 5, 4, 6, 1};

        arr = obj.replaceElements(arr);

        System.out.println(Arrays.toString(arr)); // [18, 6, 6, 6, 1, -1]
    }
}
