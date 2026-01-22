## Problem: ***Build Array from Permutation*** (LeetCode ***#1920***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Simulation***

**Problem Statement:**  
Given a **zero-based permutation** `nums` (i.e., `nums` contains all integers from `0` to `n - 1` exactly once),  
build an array `ans` such that:

`ans[i] = nums[nums[i]]`

Return the resulting array.

**Example:**
```
Input: nums = [0, 2, 1, 5, 3, 4]
Output: [0, 1, 2, 4, 5, 3]

Input: nums = [5, 0, 1, 2, 3, 4]
Output: [4, 5, 0, 1, 2, 3]
```
**Solution:**

1. Create a new array `ans` of the same length as `nums`.  
2. Traverse the array using index `i`.  
3. For each index, assign:  
   ***ans[i] = nums[nums[i]]***  
4. After processing all elements, return the constructed array.
