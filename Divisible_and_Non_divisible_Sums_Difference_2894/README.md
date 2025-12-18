## Problem: ***Divisible and Non-divisible Sums Difference*** (LeetCode ***#2894***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Looping***

**Problem Statement:**  
Given two integers `n` and `m`, calculate the **difference** between:

- The **sum of numbers from 1 to n that are NOT divisible by m**  
- The **sum of numbers from 1 to n that ARE divisible by m**

Return the value:  
***nonDivisibleSum − divisibleSum***

**Example:**
```
Input: n = 10, m = 3
Divisible by 3 → [3, 6, 9] → sum = 18
Not divisible by 3 → [1, 2, 4, 5, 7, 8, 10] → sum = 37
Output: 19


Input: n = 5, m = 2
Divisible → [2, 4] → sum = 6
Not divisible → [1, 3, 5] → sum = 9
Output: 3

```

**Solution:**

1. Initialize two variables:  
   - ***num1*** → sum of numbers **not divisible** by `m`  
   - ***num2*** → sum of numbers **divisible** by `m`  
2. Loop from ***1 to n***:  
   - If `i % m == 0` → add to ***num2***  
   - Else → add to ***num1***  
3. Return ***num1 − num2*** as the final result.
