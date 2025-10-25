package Palindrome_Number_9;

public class PalindromeChecker {

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(num + " → " + isPalindrome(num));
    }
}
