## Problem: ***N Repeated Element in Size 2N Array*** (LeetCode ***#961***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***HashSet / Arrays***

**Problem Statement:**  
You are given an integer array `nums` of size `2N` where exactly **one element is repeated N times**, and all other elements appear only once.

Return the element that is repeated **N times**.

**Example:**
```
Input: nums = [1, 2, 3, 3]
Output: 3

Input: nums = [5, 1, 5, 2, 5, 3, 5, 4]
Output: 5
```
**Solution:**

1. Use a ***HashSet*** to keep track of elements already seen.  
2. Traverse the array element by element.  
3. If an element is already present in the set, it is the repeated element → return it immediately.  
4. Otherwise, add the element to the set and continue.  
5. This works because only one element appears more than once.
