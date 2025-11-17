package Perfect_Number_507;

class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1;
        int limit = (int)Math.sqrt(num);

        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                sum += i;
                int pair = num / i;
                if (pair != i) sum += pair;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        PerfectNumber p = new PerfectNumber();

        int num = 28;
        System.out.println("Is " + num + " a perfect number? " + p.checkPerfectNumber(num));
    }
}
