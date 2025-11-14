package Happy_Number_202;

public class HappyNumberSolution {
    public static void main(String[] args) {
        int[] tests = {19, 2, 7, 116}; 
        for (int n : tests) {
            System.out.println(n + " is happy? " + isHappy(n));
        }
    }

    public static boolean isHappy(int n) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
