## Problem: ***Max Consecutive Ones*** (LeetCode ***#485***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Counting***

**Problem Statement:**  
Given a binary array `nums` (containing only 0s and 1s), return the **maximum number of consecutive 1s** in the array.

**Example:**
```

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The longest consecutive sequence of 1s is "111"

Input: nums = [1,0,1,1,0,1]
Output: 2
```

**Solution:**

1. Maintain two counters:  
   - ***count*** → current number of consecutive 1s  
   - ***max*** → maximum streak found  
2. Traverse through each element of the array:  
   - If it's ***1*** → increment ***count*** and update ***max***  
   - If it's ***0*** → reset ***count*** to 0  
3. Return the value stored in ***max*** as the final result.
