package Height_Checker_1051;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HeightChecker obj = new HeightChecker();

        int[] heights = {1, 1, 4, 2, 1, 3};
        int result = obj.heightChecker(heights);

        System.out.println("Number of students out of place: " + result);
    }
}