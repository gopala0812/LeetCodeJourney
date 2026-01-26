package Kids_With_the_Greatest_Number_of_Candies_1431;

import java.util.*;

class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int n : candies) {
            max = Math.max(max, n);
        }

        List<Boolean> r = new ArrayList<>();
        for(int n : candies) {
            int current = n + extraCandies;
            if(current >= max) {
                r.add(true);
            } else {
                r.add(false);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        KidsWithCandies obj = new KidsWithCandies();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(obj.kidsWithCandies(candies, extraCandies));
        // Output: [true, true, true, false, true]
    }
}
