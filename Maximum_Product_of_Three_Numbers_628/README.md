## Problem: ***Maximum Product of Three Numbers*** (LeetCode ***#628***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting / Math***

**Problem Statement:**  
Given an integer array, find the maximum product that can be formed by multiplying **three numbers** from the array.

You must consider both:
- The **three largest positive** numbers  
- The combination of **two most negative numbers** (which produce a positive product) with the largest positive number  

**Example:**

```
Input: nums = [1, 2, 3]
Output: 6

Copy code
Input: nums = [-10, -10, 5, 2]
Output: 500
Explanation: (-10 * -10 * 5) = 500

```

**Solution:**

1. Track the ***three largest*** values: max1, max2, max3.  
2. Track the ***two smallest*** values: min1, min2 (useful when negatives multiply to become positive).  
3. Compute two possible products:  
   - ***prod1 = max1 * max2 * max3***  
   - ***prod2 = max1 * min1 * min2***  
4. Return the maximum of prod1 and prod2.  
5. This avoids sorting and provides an efficient O(n) solution.
