## Problem: ***Count of Matches in Tournament*** (LeetCode ***#1688***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Simulation / Math***

**Problem Statement:**  
In a single-elimination tournament, every match eliminates **one** team.  
Given the number of teams `n`, return the **total number of matches** played until **one winner** remains.

**Example:**
```
Input: n = 7
Output: 6

Input: n = 14
Output: 13

```
**Solution:**

1. Initialize ***m = 0*** to count matches.  
2. While more than one team remains:  
   - If `n` is **even** → each team plays → eliminate `n/2` teams  
   - If `n` is **odd** → one team gets a bye → eliminate `(n-1)/2` teams  
3. Add eliminated teams to ***m***.  
4. Update `n` to the number of remaining teams.  
5. Continue until `n == 1`.  
6. Return ***m*** as the final match count.

> Simplified logic: the number of matches is always ***n - 1***
