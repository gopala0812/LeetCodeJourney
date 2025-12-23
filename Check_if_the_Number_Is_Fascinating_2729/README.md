## Problem: ***Check if the Number Is Fascinating*** (LeetCode ***#2729***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / HashSet***

**Problem Statement:**  
A number `n` is called **fascinating** if, after concatenating `n`, `2 × n`, and `3 × n`, the resulting string contains **all digits from 1 to 9 exactly once** (no zeros allowed).

Given an integer `n`, return ***true*** if it is fascinating, otherwise return ***false***.

**Example:**
```
Input: n = 192
Concatenation → "192384576"
Output: true


Input: n = 100
Concatenation → "100200300"
Output: false
```
**Solution:**

1. Concatenate the values ***n***, ***2 × n***, and ***3 × n*** into a string.  
2. If the resulting string length is **not 9**, return ***false***.  
3. Use a ***HashSet*** to track unique digits.  
4. If any digit is `'0'`, return ***false*** immediately.  
5. Add each digit to the set.  
6. If the set size becomes ***9***, all digits from 1 to 9 are present exactly onc
