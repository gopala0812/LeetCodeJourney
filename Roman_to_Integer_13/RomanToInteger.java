package Roman_to_Integer_13;


import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
 public int romanToInt(String s) {
     Map<Character, Integer> map = new HashMap<>();
     map.put('I', 1);
     map.put('V', 5);
     map.put('X', 10);
     map.put('L', 50);
     map.put('C', 100);
     map.put('D', 500);
     map.put('M', 1000);

     int n = s.length();
     int result = 0;

     for (int i = 0; i < n; i++) {
         int value = map.get(s.charAt(i));
         if (i + 1 < n) {
             int nextValue = map.get(s.charAt(i + 1));
             if (value < nextValue) {
                 result -= value;
             } else {
                 result += value;
             }
         } else {
             result += value;
         }
     }

     return result;
 }

 // quick test
 public static void main(String[] args) {
     RomanToInteger solver = new RomanToInteger();
     System.out.println(solver.romanToInt("III"));      // 3
     System.out.println(solver.romanToInt("IV"));       // 4
     System.out.println(solver.romanToInt("IX"));       // 9
     System.out.println(solver.romanToInt("LVIII"));    // 58
     System.out.println(solver.romanToInt("MCMXCIV"));  // 1994
 }
}
