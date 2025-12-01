## Problem: ***Third Maximum Number*** (LeetCode ***#414***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting / Set***

**Problem Statement:**  
Given an integer array `nums`, return the **third distinct maximum number**.  
If it does not exist, return the **maximum** number.

**Example:**
```
Input: nums = [3, 2, 1]
Output: 1
Explanation: Third distinct maximum is 1


Input: nums = [1, 2]
Output: 2
Explanation: No third distinct maximum, return highest which is 2


Input: nums = [2, 2, 3, 1]
Output: 1
Explanation: Distinct numbers are [1, 2, 3]; third max = 1

```

**Solution:**

1. Use a ***HashSet*** to store only **distinct** numbers.  
2. Convert the set into a list and sort it in ascending order.  
3. If the number of unique elements is **less than 3**, return the **last element** (maximum).  
4. Otherwise, return the element at index ***size - 3*** → the third largest element.
