## Problem: ***Mirror Distance of an Integer*** (LeetCode ***#3783***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Number Manipulation***

**Problem Statement:**  
Given an integer `n`, compute its **mirror distance**.  
The mirror distance is defined as the **absolute difference** between the number and its **digit-reversed value**.

Return the mirror distance of `n`.

**Example:**
```
Input: n = 123
Reversed = 321
Output: |123 − 321| = 198

Input: n = 21
Reversed = 12
Output: |21 − 12| = 9
```
**Solution:**

1. Store the original number in a variable.  
2. Reverse the digits of `n` using modulo (`% 10`) and division (`/ 10`).  
3. Build the reversed number step by step.  
4. Compute the **absolute difference** between the original number and the reversed number.  
5. Return the final mirror distance.
