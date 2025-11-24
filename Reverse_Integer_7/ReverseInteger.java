package Reverse_Integer_7;

import java.util.*;

class ReverseInteger {

    public int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;

            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }

            x /= 10;
        }

        return (int) rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        ReverseInteger obj = new ReverseInteger();
        int result = obj.reverse(x);

        System.out.println("Reversed Integer: " + result);
    }
}
