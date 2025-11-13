package Finding_3_Digit_Even_Numbers;

import java.util.*;

public class findeven{
    public int[] findEvenNumbers(int[] digits) {
        int[] cnt = new int[10];
        for (int d : digits) cnt[d]++;

        List<Integer> result = new ArrayList<>();

        
        for (int num = 100; num < 1000; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] need = new int[10];
            need[a]++; need[b]++; need[c]++;

            boolean ok = true;
            for (int d = 0; d < 10; d++) {
                if (need[d] > cnt[d]) {
                    ok = false;
                    break;
                }
            }
            if (ok) result.add(num);
        }

        // convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) ans[i] = result.get(i);
        return ans;
    }
}
