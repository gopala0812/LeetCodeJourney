## Problem: ***Transform Array by Parity*** (LeetCode ***#2148***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting***

**Problem Statement:**  
Given an integer array `nums`, transform the array such that:

- Replace every **even** number with **0**  
- Replace every **odd** number with **1**

After the transformation, return the array sorted in **non-decreasing order**.

**Example:**
```
Input: nums = [4, 3, 2, 1]
Transformed: [0, 1, 0, 1]
Output: [0, 0, 1, 1]

Input: nums = [1, 5, 2, 4]
Output: [0, 0, 1, 1]

```

**Solution:**

1. Traverse each element of the array.  
2. If the number is **even**, replace it with ***0***.  
3. If the number is **odd**, replace it with ***1***.  
4. Sort the transformed array using ***Arrays.sort()***.  
5. Return the final sorted array.
