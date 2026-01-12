## Problem: ***Maximize the Expression of Three Elements*** (LeetCode ***#3024***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting / Math***

**Problem Statement:**  
Given an integer array `nums`, select **three distinct elements** `a`, `b`, and `c` such that the value  
`(a + b) - c` is **maximized**.

Return the **maximum possible value** of the expression.

**Example:**
```
Input: nums = [1, 2, 3, 4]
Output: 6
Explanation:
Choose a = 4, b = 3, c = 1
(4 + 3) - 1 = 6

Input: nums = [2, 5, 1]
Output: 6
```
**Solution:**

1. Sort the array in **ascending order**.  
2. Choose the **two largest elements** to maximize the sum `(a + b)`.  
3. Choose the **smallest element** to minimize subtraction `- c`.  
4. Compute the value:  
   ***(largest + secondLargest) − smallest***  
5. Return the computed result.
