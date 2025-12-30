## Problem: ***Harshad Number*** (LeetCode ***#3099***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Digit Sum***

**Problem Statement:**  
A number `x` is called a **Harshad number** if it is divisible by the **sum of its digits**.

Given an integer `x`, return the **sum of its digits** if `x` is a Harshad number.  
Otherwise, return ***-1***.

**Example:**
```
Input: x = 18
Digit sum = 1 + 8 = 9
18 % 9 == 0
Output: 9

Input: x = 23
Digit sum = 2 + 3 = 5
23 % 5 != 0
Output: -1
```
**Solution:**

1. Store the original number `x` in a variable.  
2. Compute the **sum of digits** by repeatedly extracting digits using ***n % 10***.  
3. Check if `x` is divisible by the digit sum.  
4. If divisible → return the digit sum.  
5. Otherwise → return ***-1***.
