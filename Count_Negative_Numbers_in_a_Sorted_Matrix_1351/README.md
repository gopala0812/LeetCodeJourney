## Problem: ***Count Negative Numbers in a Sorted Matrix*** (LeetCode ***#1351***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Matrix***

**Problem Statement:**  
Given a matrix `grid` of size `m × n` where each row and each column is sorted in **non-increasing order**, return the **count of negative numbers** in the matrix.

**Example:**
```
Input:
grid = [
[4, 3, 2, -1],
[3, 2, 1, -1],
[1, 1, -1, -2],
[-1, -1, -2, -3]
]

Output: 8

Input:
grid = [
[3, 2],
[1, 0]
]

Output: 0
```
**Solution:**

1. Initialize a counter ***negative = 0***.  
2. Traverse each row and each column of the matrix.  
3. If a value is **less than 0**, increment the counter.  
4. After scanning the entire matrix, return the total count of negative numbers.
