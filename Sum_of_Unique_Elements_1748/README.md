## Problem: ***Sum of Unique Elements*** (LeetCode ***#1748***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***HashMap / Counting***

**Problem Statement:**  
Given an integer array `nums`, return the **sum of all unique elements** in the array.  
An element is considered **unique** if it appears **exactly once**.

**Example:**
```
Input: nums = [1, 2, 3, 2]
Unique elements → [1, 3]
Output: 4

Input: nums = [1, 1, 1, 1]
Output: 0
```
**Solution:**

1. Use a ***HashMap*** to count the frequency of each number.  
2. Traverse the array and update counts using the map.  
3. Iterate through the map keys:  
   - If a number’s frequency is ***1***, add it to the sum.  
4. Return the final sum of all unique elements.
