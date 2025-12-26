## Problem: ***Maximum Product of Two Elements in an Array*** (LeetCode ***#1464***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting***

**Problem Statement:**  
Given an integer array `nums`, choose two **different indices** `i` and `j` such that  
the value `(nums[i] - 1) * (nums[j] - 1)` is **maximized**.

Return the **maximum possible product**.

**Example:**
```
Input: nums = [3, 4, 5, 2]
Output: 12
Explanation:
Choose 5 and 4 → (5 - 1) * (4 - 1) = 4 * 3 = 12

Input: nums = [1, 5, 4, 5]
Output: 16
```
**Solution:**

1. Sort the array in **ascending order**.  
2. Take the two **largest elements** in the array.  
3. Subtract ***1*** from each of them.  
4. Multiply the results to get the maximum product.  
5. Return the computed value.
