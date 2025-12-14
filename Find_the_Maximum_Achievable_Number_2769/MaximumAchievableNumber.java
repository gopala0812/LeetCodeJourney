package Find_the_Maximum_Achievable_Number_2769;

import java.util.*;

class MaximumAchievableNumber {

    public int theMaximumAchievableX(int num, int t) {
        return num + t + t;
    }

    public static void main(String[] args) {
        MaximumAchievableNumber obj = new MaximumAchievableNumber();
        System.out.println(obj.theMaximumAchievableX(3, 2)); // 7
    }
}
