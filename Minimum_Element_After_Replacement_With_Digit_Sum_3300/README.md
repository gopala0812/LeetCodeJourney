## Problem: ***Minimum Element After Replacement With Digit Sum*** (LeetCode ***#3300***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Arrays***

**Problem Statement:**  
You are given an integer array `nums`.  
For each element, replace it with the **sum of its digits**.  

After performing the replacement for all elements, return the **minimum value** in the resulting array.

**Example:**
```
Input: nums = [10, 21, 30]
Digit sums → [1, 3, 3]
Output: 1

Input: nums = [99, 12, 5]
Digit sums → [18, 3, 5]
Output: 3

```

**Solution:**

1. Create a new array to store digit sums.  
2. For each number, repeatedly extract digits using ***num % 10*** and add them to a sum.  
3. Store each digit sum in the result array.  
4. Sort the result array.  
5. Return the **first element**, which is the minimum digit sum.
