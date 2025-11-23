## Problem: ***Happy Number*** (LeetCode ***#202***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***HashSet / Math***

**Problem Statement:**  
A number is called **happy** if repeatedly replacing it with the **sum of the squares of its digits** eventually leads to `1`.  
If the process ends in a loop that does not include `1`, the number is **not happy**.

**Example:**

```
Input: n = 19
Output: true
Explanation:
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1 → Happy number

Input: n = 2
Output: false
Explanation: Loops endlessly without reaching 1.

```

**Solution:**

1. Use a ***HashSet*** to track numbers that have already appeared.  
2. Repeatedly replace the number with the ***sum of squares of its digits***.  
3. If the number becomes ***1*** → it is a happy number.  
4. If we see the same number again → a loop is detected → not a happy number.  
5. Return ***true*** for happy numbers, ***false*** for non-happy numbers.
