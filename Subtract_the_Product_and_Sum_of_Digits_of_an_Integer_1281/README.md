## Problem: ***Subtract the Product and Sum of Digits of an Integer*** (LeetCode ***#1281***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math***

**Problem Statement:**  
Given an integer `n`, return the value obtained by subtracting the **sum** of its digits from the **product** of its digits.

**Example:**
```
Input: n = 234
Product = 2 * 3 * 4 = 24
Sum = 2 + 3 + 4 = 9
Output: 15

Explanation: 24 - 9 = 15


Input: n = 4421
Product = 4 * 4 * 2 * 1 = 32
Sum = 4 + 4 + 2 + 1 = 11
Output: 21

```

**Solution:**

1. Initialize ***prod = 1*** and ***sum = 0***.  
2. Extract each digit using ***n % 10***.  
3. Add the digit to ***sum*** and multiply it with ***prod***.  
4. Remove the last digit using ***n /= 10***.  
5. Finally return ***prod - sum***.
