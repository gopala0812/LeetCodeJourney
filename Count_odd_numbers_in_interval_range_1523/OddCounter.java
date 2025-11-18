package Count_odd_numbers_in_interval_range_1523;

class OddCounter {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
    public static void main(String[] args) {
        OddCounter obj = new OddCounter();

        int low = 3;
        int high = 9;

        int result = obj.countOdds(low, high);
        System.out.println("Odd numbers between " + low + " and " + high + ": " + result);
    }
}
