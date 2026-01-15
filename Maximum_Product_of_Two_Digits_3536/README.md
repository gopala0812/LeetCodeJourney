## Problem: ***Maximum Product of Two Digits*** (LeetCode ***#3536***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Digit Manipulation***

**Problem Statement:**  
Given an integer `n`, find the **maximum product** of any **two digits** present in the number.

Return the maximum possible product.

**Example:**
```
Input: n = 273
Digits → 2, 7, 3
Maximum product → 7 × 3 = 21
Output: 21

Input: n = 99
Digits → 9, 9
Output: 81
```
**Solution:**

1. Traverse through each digit of the number using modulo (`% 10`).  
2. Track the **largest digit** (***max1***) and the **second largest digit** (***max2***).  
3. Update these two values dynamically while iterating through the digits.  
4. After processing all digits, compute the product:  
   ***max1 × max2***  
5. Return the resulting product.
