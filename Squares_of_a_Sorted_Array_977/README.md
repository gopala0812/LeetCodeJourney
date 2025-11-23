## Problem: ***Squares of a Sorted Array*** (LeetCode ***#977***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Two Pointers***

**Problem Statement:**  
Given an integer array `nums` sorted in non-decreasing order, return an array of the **squares of each number** also sorted in non-decreasing order.

**Example:**
```
Input: nums = [-4, -1, 0, 3, 10]
Output: [0, 1, 9, 16, 100]


Input: nums = [-7, -3, 2, 3, 11]
Output: [4, 9, 9, 49, 121]

```

**Solution:**

1. Square each element of the array (e.g., `nums[i] = nums[i] * nums[i]`).  
2. After squaring, the array may not remain sorted because negative values turn positive.  
3. Use ***Arrays.sort()*** to sort the squared results.  
4. Return the final sorted squared array.
