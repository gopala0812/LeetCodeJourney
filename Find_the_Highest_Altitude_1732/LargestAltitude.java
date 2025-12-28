package Find_the_Highest_Altitude_1732;

import java.util.*;

class LargestAltitude {

    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for(int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        LargestAltitude obj = new LargestAltitude();
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(obj.largestAltitude(gain)); // 1
    }
}
