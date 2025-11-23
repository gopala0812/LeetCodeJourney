## Problem: Sqrt(x) (LeetCode #69)

**Difficulty:** ***Easy***
**Language:** ***Java***
**Topic:** ***Math / Binary Search***

**Problem Statement:**
Given a non-negative integer x, compute and return the square root of x rounded down to the nearest integer. The returned integer should be the floor value of the actual square root.

**Example:**
```
Input: x = 8
Output: 2

Explanation: The square root of 8 is 2.828...
Since the decimal part is ignored, the answer is 2.

Input: x = 4
Output: 2
```

**Solution:**

1. Math.sqrt(x) → finds the square root of x.  
2. Math.floor(res) → rounds it down to the nearest whole number.  
3. (int) → converts the result from double to int.  
4. return fin → gives the final integer square root.
