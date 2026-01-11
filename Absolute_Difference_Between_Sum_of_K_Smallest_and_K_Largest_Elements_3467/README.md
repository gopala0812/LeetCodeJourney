## Problem: ***Absolute Difference Between Sum of K Smallest and K Largest Elements*** (LeetCode ***#3467***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting***

**Problem Statement:**  
Given an integer array `nums` and an integer `k`, calculate the **absolute difference** between:

- The **sum of the k smallest elements**, and  
- The **sum of the k largest elements**.

Return the absolute difference between these two sums.

**Example:**
```
Input: nums = [3, 1, 5, 2, 9, 8], k = 2
K smallest → [1, 2] → sum = 3
K largest → [9, 8] → sum = 17
Output: |3 − 17| = 14

Input: nums = [1, 4, 7, 10], k = 1
K smallest → [1]
K largest → [10]
Output: 9
```
**Solution:**

1. Sort the array in **ascending order**.  
2. Sum the first ***k*** elements to get the sum of the **k smallest** elements.  
3. Sum the last ***k*** elements to get the sum of the **k largest** elements.  
4. Compute the **absolute difference** between the two sums.  
5. Return the final result.
