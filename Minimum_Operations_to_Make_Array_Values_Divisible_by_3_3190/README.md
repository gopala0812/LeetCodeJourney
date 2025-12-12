Here is your clean and ready-to-paste README — perfectly formatted, all *** preserved, matching your preferred structure:

## Problem: ***Minimum Operations to Make Array Values Divisible by 3*** (LeetCode ***#3190***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Array***

**Problem Statement:**  
You are given an integer array `nums`.  
In one operation, you may **change any number** to **any other number**.

Your task is to return the **minimum number of operations** needed so that **every** value in the array becomes divisible by `3`.

**Example:**
```
Input: nums = [1, 2, 3, 4]
Numbers not divisible by 3 → 1, 2, 4
Output: 3

Input: nums = [3, 6, 9]
All are divisible by 3
Output: 0
```

**Solution:**

1. Initialize ***result = 0***.  
2. Loop through the array:  
   - If a number is **not** divisible by ***3*** → increment `result`.  
3. Each modification fixes one number in exactly one operation.  
4. Return the total number of required operations.
