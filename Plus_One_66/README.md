## Problem: ***Plus One*** (LeetCode ***#66***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Simulation***

**Problem Statement:**  
You are given a large integer represented as an array of digits.  
Your task is to **add 1** to this number and return the resulting array of digits.

The array stores the most significant digit at index 0, and the number contains **no leading zeros**, except for the number 0 itself.

**Example:**

```
Input: digits = [1, 2, 3]
Output: [1, 2, 4]


Input: digits = [9, 9, 9]
Output: [1, 0, 0, 0]

```

**Solution:**

1. Start from the **last digit** and add ***1***.  
2. If the digit becomes ***10***, set it to ***0*** and carry over ***1***.  
3. Continue propagating the carry leftwards until:  
   - Carry becomes ***0*** → stop, OR  
   - All digits are processed.  
4. If a carry still remains after processing the entire array, create a new array with a leading ***1***.  
5. Return the updated array as the result.
