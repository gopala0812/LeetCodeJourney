## Problem: ***Power of Two*** (LeetCode ***#231***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Bit Manipulation***

**Problem Statement:**  
Given an integer `n`, return ***true*** if it is a **power of two**.  
Otherwise, return ***false***.

An integer `n` is a power of two if there exists an integer `x` such that:  
`n = 2^x`

**Example:**
```
Input: n = 16
Output: true

Input: n = 18
Output: false
```
**Solution:**

1. If `n` is **less than or equal to 0**, it cannot be a power of two → return ***false***.  
2. Repeatedly divide `n` by ***2*** while `n` is greater than 1.  
3. If at any step `n` becomes **odd** (i.e., `n % 2 != 0`), return ***false***.  
4. If the loop finishes and `n` becomes ***1***, then the number is a power of two.  
5. Return ***true***.

