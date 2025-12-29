## Problem: ***Find N Unique Integers Sum up to Zero*** (LeetCode ***#1304***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Arrays***

**Problem Statement:**  
Given an integer `n`, return **any array** containing `n` **unique integers** such that their **sum is 0**.

**Example:**
```
Input: n = 5
Output: [0, 1, -1, 2, -2]
Explanation: All elements are unique and their sum is 0.


Input: n = 4
Output: [1, -1, 2, -2]
```
**Solution:**

1. Create an array of size ***n***.  
2. If `n` is **odd**, include ***0*** as one element.  
3. Add pairs of numbers ***i*** and ***-i*** to the array.  
4. Continue until the array is filled.  
5. Since every positive number has its negative counterpart, the total sum becomes
