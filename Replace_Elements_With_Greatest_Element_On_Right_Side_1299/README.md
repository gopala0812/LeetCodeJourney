## Problem: ***Replace Elements with Greatest Element on Right Side*** (LeetCode ***#1299***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Reverse Traversal***

**Problem Statement:**  
Given an array `arr`, replace every element with the **greatest element** among the elements to its **right side**.  
Replace the **last element** with `-1`.

**Example:**
```
Input: arr = [17, 18, 5, 4, 6, 1]
Output: [18, 6, 6, 6, 1, -1]

```
**Solution:**

1. Start from the **rightmost** element and track the current ***maximum*** seen so far.  
2. Replace the current element with `max`.  
3. Update the `max` if the original element is larger.  
4. Continue moving left until the start of the array.  
5. Return the modified array as the result.
