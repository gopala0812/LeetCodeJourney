package Running_Sum_of_1D_Array;

public class runningsum {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] runningSum = new int[len];

        runningSum[0] = nums[0];

        for (int i = 1; i < len; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }

    public static void main(String[] args) {
        runningsum obj = new runningsum();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.runningSum(nums);

        System.out.print("Running Sum: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
