## Problem: ***Sum of Squares of Special Elements*** (LeetCode ***#2778***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Math***

**Problem Statement:**  
You are given an integer array `nums`.  
An element `nums[i]` is considered **special** if the **length of the array** is divisible by `(i + 1)`.

Return the **sum of squares** of all such special elements.

**Example:**
```
Input: nums = [1, 2, 3, 4]
Length = 4

Special indices:
i = 0 → 4 % (0 + 1) = 0 → include 1²
i = 1 → 4 % (1 + 1) = 0 → include 2²
i = 3 → 4 % (3 + 1) = 0 → include 4²

Output: 1 + 4 + 16 = 21

Input: nums = [2, 7, 1, 19, 18, 3]
Output: 63
```
**Solution:**

1. Initialize a variable ***squares = 0***.  
2. Loop through the array using index `i`.  
3. Check if `nums.length % (i + 1) == 0`.  
4. If true, add ***nums[i] × nums[i]*** to `squares`.  
5. After the loop, return the final sum of squares.
