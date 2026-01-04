package Total_Distance_Traveled_2739;

import java.util.*;

class DistanceTraveled {

    public int distanceTraveled(int mainTank, int additionalTank) {
        int count = 5;
        int distance = 0;

        while(mainTank > 0) {
            mainTank -= 1;
            distance += 10;
            count--;

            if(count == 0 && additionalTank != 0) {
                mainTank += 1;
                additionalTank--;
                count = 5;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        DistanceTraveled obj = new DistanceTraveled();
        System.out.println(obj.distanceTraveled(5, 10)); // 60
    }
}
