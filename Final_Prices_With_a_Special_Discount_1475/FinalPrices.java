package Final_Prices_With_a_Special_Discount_1475;

import java.util.*;

class FinalPrices {

    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        FinalPrices obj = new FinalPrices();
        int[] prices = {8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(obj.finalPrices(prices))); 
        // Output: [4, 2, 4, 2, 3]
    }
}
