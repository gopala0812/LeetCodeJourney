## Problem: ***Number of Good Pairs*** (LeetCode ***#1512***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Hashing / Counting***

**Problem Statement:**  
```
Given an integer array `nums`, return the number of **good pairs**.  
A pair `(i, j)` is called good if:

- `nums[i] == nums[j]`
- and `i < j`

**Example:**
Input: nums = [1, 2, 3, 1, 1, 3]
Output: 4
Explanation: (0,3), (0,4), (3,4), (2,5)

Copy code
Input: nums = [1, 1, 1, 1]
Output: 6

```
**Solution:**

1. Initialize a counter ***pairs = 0***.  
2. Loop using two nested indices:  
   - Outer loop → `i = 0` to `n-1`  
   - Inner loop → `j = i+1` to `n-1`  
3. Check if ***nums[i] == nums[j]***  
   - If yes, increment ***pairs***.  
4. Return the total count of good pairs.
