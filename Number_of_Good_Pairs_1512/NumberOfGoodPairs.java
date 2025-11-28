package Number_of_Good_Pairs_1512;

import java.util.*;

class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs obj = new NumberOfGoodPairs();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = obj.numIdenticalPairs(nums);
        System.out.println("Number of Good Pairs: " + result);
    }
}
