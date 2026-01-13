## Problem: ***Alternating Sum of an Array*** (LeetCode ***#1914***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Math***

**Problem Statement:**  
You are given an integer array `nums`.  
Compute the **alternating sum**, defined as the sum of elements at **even indices** minus the sum of elements at **odd indices**.

Return the resulting value.

**Example:**
```
Input: nums = [4, 2, 5, 3]
Even index sum = 4 + 5 = 9
Odd index sum = 2 + 3 = 5
Output: 4

Input: nums = [1, 2, 3]
Output: 2
```
**Solution:**

1. Initialize two variables:  
   - ***even*** → sum of elements at even indices  
   - ***odd*** → sum of elements at odd indices  
2. Traverse the array by index:  
   - If index is even → add value to ***even***  
   - If index is odd → add value to ***odd***  
3. Return ***even − odd*** as the alternating sum.
