package Find_if_Digit_Game_Can_Be_Won_3232;

import java.util.*;

class CanAliceWin {

    public boolean canAliceWin(int[] nums) {
        int singleD = 0;
        int doubleD = 0;

        for(int n : nums) {
            if(n < 10) {
                singleD += n;
            } else {
                doubleD += n;
            }
        }
        return singleD != doubleD;
    }

    public static void main(String[] args) {
        CanAliceWin obj = new CanAliceWin();
        int[] nums = {1, 12, 3, 24};
        System.out.println(obj.canAliceWin(nums)); 
    }
}
