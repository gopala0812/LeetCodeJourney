## Problem: ***Sum Multiples*** (LeetCode ***#2652***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Looping***

**Problem Statement:**  
Given a positive integer `n`, return the **sum of all integers** from `1` to `n` (inclusive) that are divisible by **3**, **5**, or **7**.

**Example:**
```
Input: n = 7
Numbers divisible by 3, 5, or 7 → [3, 5, 6, 7]
Output: 21


Input: n = 10
Numbers → [3, 5, 6, 7, 9, 10]
Output: 40

```
**Solution:**

1. Initialize ***result = 0***.  
2. Loop from ***1 to n***:  
   - If a number is divisible by ***3*** or ***5*** or ***7*** → add it to result.  
3. After the loop finishes, return the final value stored in ***result***.
