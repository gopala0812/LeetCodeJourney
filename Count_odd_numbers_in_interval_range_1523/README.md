## Problem: ***Count Odd Numbers in an Interval Range*** (LeetCode ***#1523***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math***

**Problem Statement:**  
Given two non-negative integers `low` and `high`, return the **number of odd integers** between them (inclusive).

**Example:**

```
Input: low = 3, high = 7
Output: 3
Explanation: Odd numbers → 3, 5, 7


Input: low = 8, high = 10
Output: 1
Explanation: Odd number → 9
```

**Solution:**

1. Count how many odds exist from `0` to `high` → `(high + 1) / 2`.  
2. Count how many odds exist from `0` to `low - 1` → `low / 2`.  
3. Subtract the two values to get the total odds in the interval.  
4. Formula used:  
   ***odd_count = (high + 1) / 2 - low / 2***
