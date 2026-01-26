## Problem: ***Kids With the Greatest Number of Candies*** (LeetCode ***#1431***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Greedy***

**Problem Statement:**  
You are given an integer array `candies`, where `candies[i]` represents the number of candies the `iᵗʰ` kid has,  
and an integer `extraCandies`.

For each kid, check whether giving them all the `extraCandies` would make them have **the greatest number of candies** among all kids.

Return a list of boolean values where:
- ***true*** means the kid **can have the greatest number of candies**
- ***false*** otherwise

**Example:**
```
Input: candies = [2, 3, 5, 1, 3], extraCandies = 3
Output: [true, true, true, false, true]

Input: candies = [4, 2, 1, 1, 2], extraCandies = 1
Output: [true, false, false, false, false]
```
**Solution:**

1. Find the **maximum number of candies** any kid currently has.  
2. For each kid, add ***extraCandies*** to their candies.  
3. If the resulting value is **greater than or equal to** the maximum, add ***true*** to the result list.  
4. Otherwise, add ***false***.  
5. Return the final list of boolean values.
