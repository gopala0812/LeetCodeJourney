## Problem: ***Perfect Number*** (LeetCode ***#507***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Number Theory***

**Problem Statement:**  
A positive integer is called a **perfect number** if it is equal to the **sum of all its positive divisors** except itself.  
You must determine whether a given integer `num` is a perfect number.

**Example:**

```
Input: num = 28
Divisors = 1, 2, 4, 7, 14
Sum = 28
Output: true


Input: num = 7
Divisors = 1
Sum = 1
Output: false
```


**Solution:**

1. Return ***false*** for numbers ≤ 1, since they cannot be perfect.  
2. Start with ***sum = 1*** (1 is always a divisor).  
3. Loop from ***2 to sqrt(num)*** to find divisors efficiently.  
4. For each divisor `i`:
   - Add `i` to sum.  
   - Add the paired divisor ***num / i*** (only if it’s different from `i`).  
5. After collecting all divisors, check if ***sum == num***.  
6. If yes → the number is a perfect number; otherwise → not perfect.
