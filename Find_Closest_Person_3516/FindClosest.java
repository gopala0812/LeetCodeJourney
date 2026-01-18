package Find_Closest_Person_3516;

import java.util.*;

class FindClosest {

    public int findClosest(int x, int y, int z) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);

        if(a > b) {
            return 2;
        } else if(b > a) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindClosest obj = new FindClosest();
        System.out.println(obj.findClosest(2, 7, 4)); // 0
        System.out.println(obj.findClosest(1, 4, 7)); // 2
    }
}
