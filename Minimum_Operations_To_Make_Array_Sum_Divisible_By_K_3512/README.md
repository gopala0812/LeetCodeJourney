## Problem: ***Minimum Operations to Make Array Sum Divisible by K*** (LeetCode ***#3512***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Modulo***

**Problem Statement:**  
Given an array of integers `nums` and an integer `k`, return the **minimum number of operations** required to make the **sum** of the array **divisible by `k`**.

In one operation, you may **remove any one element** from the array.

**Example:**
```
Input: nums = [3, 1, 4], k = 5
Sum = 3 + 1 + 4 = 8
8 % 5 = 3 → not divisible
Output: 3


Input: nums = [2, 5, 6], k = 3
Sum = 13
13 % 3 = 1 → remove one element with remainder 1
Output: 1

```

**Solution:**

1. Compute the total ***sum*** of the array.  
2. Check `sum % k`:  
   - If result is ***0*** → already divisible → answer = ***0***  
3. Otherwise, the modulo result gives the **minimum operations** needed.  
4. Return the value of `sum % k`.
