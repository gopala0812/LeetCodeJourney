## Problem: ***Find if Digit Game Can Be Won*** (LeetCode ***#3232***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Simulation***

**Problem Statement:**  
You are given an integer array `nums` consisting of **single-digit** and **double-digit** numbers.

- Alice scores the **sum of all single-digit numbers**.  
- Bob scores the **sum of all double-digit numbers**.

Alice **wins** if her total score is **not equal** to Bob’s score.

Return ***true*** if Alice can win the game; otherwise, return ***false***.

**Example:**
```
Input: nums = [1, 12, 3, 24]
Single-digit sum = 1 + 3 = 4
Double-digit sum = 12 + 24 = 36
Output: true

Input: nums = [5, 14, 9]
Single-digit sum = 5 + 9 = 14
Double-digit sum = 14
Output: false
```
**Solution:**

1. Initialize two variables:  
   - ***singleD*** → sum of single-digit numbers  
   - ***doubleD*** → sum of double-digit numbers  
2. Traverse through the array:  
   - If a number is less than ***10***, add it to ***singleD***.  
   - Otherwise, add it to ***doubleD***.  
3. Compare the two sums.  
4. If ***singleD ≠ doubleD*** → Alice wins → return ***true***; else return ***false
