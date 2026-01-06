## Problem: ***Maximum Product Difference Between Two Pairs*** (LeetCode ***#1913***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting***

**Problem Statement:**  
Given an integer array `nums`, choose **four distinct indices** `a`, `b`, `c`, and `d` such that the value  
`(nums[a] * nums[b]) - (nums[c] * nums[d])` is **maximized**.

Return the **maximum product difference**.

**Example:**
```
Input: nums = [5, 6, 2, 7, 4]
Output: 34

Explanation:
Largest pair → 7 * 6 = 42
Smallest pair → 2 * 4 = 8
Difference → 42 - 8 = 34

Input: nums = [4, 2, 5, 9, 7, 4, 8]
Output: 64
```
**Solution:**

1. Sort the array in **ascending order**.  
2. The **maximum product** comes from the two largest elements.  
3. The **minimum product** comes from the two smallest elements.  
4. Compute the difference:  
   ***largest1 × largest2 − smallest1 × smallest2***  
5. Return the computed result.
