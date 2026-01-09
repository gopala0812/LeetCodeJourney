## Problem: ***Special Array I*** (LeetCode ***#3151***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Parity***

**Problem Statement:**  
An array is considered **special** if the **parity (even or odd)** of its elements **alternates** between consecutive positions.

Given an integer array `nums`, return ***true*** if the array is special; otherwise, return ***false***.

**Example:**
```
Input: nums = [1, 2, 3, 4]
Parities → odd, even, odd, even
Output: true

Input: nums = [2, 4, 6]
Parities → even, even, even
Output: false
```
**Solution:**

1. Traverse the array from index ***0*** to ***n - 2***.  
2. For each adjacent pair, compare their parity using ***num % 2***.  
3. If two consecutive elements have the **same parity**, return ***false*** immediately.  
4. If the loop completes without conflicts, return ***true***.
