package Find_the_Difference_389;



public class findDifference {
 public char findTheDifference(String s, String t) {
     int x = 0;
     for (char c : s.toCharArray()) x ^= c;
     for (char c : t.toCharArray()) x ^= c;
     return (char) x;
 }

 // quick main to test
 public static void main(String[] args) {
	 findDifference sol = new findDifference ();
     System.out.println(sol.findTheDifference("abcd", "abcde")); // e
     System.out.println(sol.findTheDifference("", "y")); // y
     System.out.println(sol.findTheDifference("a", "aa")); // a
 }
}
