## Problem: ***Check if a Number Is Divisible by the Sum and Product of Its Digits*** (LeetCode ***#2997***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Digit Manipulation***

**Problem Statement:**  
Given an integer `n`, calculate the **sum** of its digits and the **product** of its digits.  
Let `div = sum + product`.

Return ***true*** if `n` is **divisible by `div`**; otherwise, return ***false***.

**Example:**
```
Input: n = 99
Digits → 9, 9
Sum = 18
Product = 81
div = 18 + 81 = 99
Output: true

Input: n = 23
Digits → 2, 3
Sum = 5
Product = 6
div = 11
23 % 11 ≠ 0
Output: false
```
**Solution:**

1. Initialize variables to store the **sum** and **product** of digits.  
2. Extract each digit using ***n % 10*** and update sum and product.  
3. Continue until all digits are processed.  
4. Compute ***div = sum + product***.  
5. Check if the original number is divisible by ***div***.  
6. Return the boolean result.
