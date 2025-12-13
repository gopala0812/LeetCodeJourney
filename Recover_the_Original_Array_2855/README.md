## Problem: ***Recover the Original Array*** (LeetCode ***#2855***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Simulation***

**Problem Statement:**  
You are given two integer arrays `order` and `friends`.  
The array `order` represents the original order of elements, while `friends` contains a subset of elements from `order`.

Your task is to **recover the order of elements in `friends`** as they appear in the `order` array.

**Example:**
```
Input:
order = [3, 1, 2, 5, 4]
friends = [1, 3, 4]

Output: [3, 1, 4]
```

**Solution:**

1. Create a result array of the same length as `friends`.  
2. Traverse each element in the ***order*** array.  
3. For each element, check if it exists in the ***friends*** array.  
4. If found, add it to the result array while maintaining the sequence from `order`.  
5. Continue until all matching elements are collected.  
6. Return the final reordered array.
