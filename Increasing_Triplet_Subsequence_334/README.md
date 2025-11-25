## Problem: ***Increasing Triplet Subsequence*** (LeetCode ***#334***)

**Difficulty:** ***Medium***  
**Language:** ***Java***  
**Topic:** ***Greedy / Arrays***

**Problem Statement:**  
Given an integer array `nums`, return ***true*** if there exists a **strictly increasing subsequence of length 3**, i.e.,  
`a < b < c` appearing in that order in the array  
(not necessarily consecutively).

Otherwise, return ***false***.

**Example:**

```
Input: nums = [1, 2, 3, 4, 5]
Output: true
Explanation: 1 < 2 < 3


Input: nums = [5, 4, 3, 2, 1]
Output: false


Input: nums = [2, 1, 5, 0, 4, 6]
Output: true
Explanation: 0 < 4 < 6 is an increasing triplet.

```

**Solution:**

1. Maintain two variables:  
   - ***first*** → the smallest value seen so far  
   - ***second*** → the second smallest value greater than `first`  
2. Traverse the array:  
   - If the current number is ≤ first → update ***first***.  
   - Else if current number is ≤ second → update ***second***.  
   - Else → current number is greater than both → an increasing triplet exists → return ***true***.  
3. If the iteration ends without finding such a number, return ***false***.
