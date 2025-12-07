package Count_of_Matches_in_Tournament_1688;

import java.util.*;

class CountMatches {

    public int numberOfMatches(int n) {
        int m = 0;
        while(n != 1) {
            if(n % 2 == 0) {
                m += n / 2;
                n = n / 2;
            } else {
                m += (n - 1) / 2;
                n = ((n - 1) / 2) + 1;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        CountMatches obj = new CountMatches();
        System.out.println(obj.numberOfMatches(7)); // 6
    }
}
