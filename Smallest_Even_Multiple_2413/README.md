## Problem: ***Smallest Even Multiple*** (LeetCode ***#2413***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math***

**Problem Statement:**  
Given a positive integer `n`, return the **smallest positive integer** that is a **multiple of both `n` and 2**.

**Example:**
```
Input: n = 5
Output: 10

Input: n = 6
Output: 6
```
**Solution:**

1. If `n` is **even**, then `n` itself is already a multiple of 2 → return `n`.  
2. If `n` is **odd**, the smallest even multiple is obtained by multiplying it by **2**.  
3. Therefore:
   - Even `n` → result is ***n***  
   - Odd `n` → result is ***2 × n***  
4. Return the computed value as the smallest even multiple.
