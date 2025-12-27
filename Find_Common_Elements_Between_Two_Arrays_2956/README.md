## Problem: ***Find Intersection Values*** (LeetCode ***#2956***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Brute Force***

**Problem Statement:**  
You are given two integer arrays `nums1` and `nums2`.

- Let `n` be the number of elements in `nums1` that appear **at least once** in `nums2`.  
- Let `m` be the number of elements in `nums2` that appear **at least once** in `nums1`.

Return an integer array `[n, m]`.

**Example:**

Input: nums1 = [2, 3, 2], nums2 = [1, 2]
Output: [2, 1]
Explanation:
nums1 elements present in nums2 → 2, 2 → count = 2
nums2 elements present in nums1 → 2 → count = 1

Input: nums1 = [4, 3, 2, 3, 1], nums2 = [2, 2, 5, 2, 3, 6]
Output: [3, 2]

**Solution:**

1. Initialize two counters: ***n*** and ***m***.  
2. For each element in `nums1`, check if it exists in `nums2`:  
   - If found, increment ***n*** and **break** to avoid double counting.  
3. For each element in `nums2`, check if it exists in `nums1`:  
   - If found, increment ***m*** and **break**.  
4. Return the result array ***[n, m]***.
