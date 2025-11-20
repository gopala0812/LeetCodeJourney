package Plus_One_66;

public class PlusOne {
    // Implementation of plusOne
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) break;
        }
        if (carry == 0) return digits;
        int[] res = new int[n + 1];
        res[0] = 1;
        for (int i = 0; i < n; i++) res[i + 1] = digits[i];
        return res;
    }

    // Helper to print array
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1,2,3},
            {4,3,2,1},
            {9},
            {9,9,9},
            {0},
            {1,9,9}
        };

        for (int[] t : tests) {
            int[] ans = plusOne(t.clone()); // clone to keep original for printing if needed
            System.out.print("Input: ");
            printArray(t);
            System.out.print("Output: ");
            printArray(ans);
            System.out.println("-----");
        }
    }
}
