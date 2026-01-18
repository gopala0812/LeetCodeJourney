## Problem: ***Find Closest Person*** (LeetCode ***#3516***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Absolute Difference***

**Problem Statement:**  
Three people are standing on a number line at positions `x`, `y`, and `z`.  

- Person 1 is at position `x`  
- Person 2 is at position `y`  
- Person 3 is at position `z`  

Return:
- ***1*** if Person 1 is closer to Person 3  
- ***2*** if Person 2 is closer to Person 3  
- ***0*** if both Person 1 and Person 2 are **equally distant** from Person 3  

**Example:**
```
Input: x = 2, y = 7, z = 4
Distance from x → |2 − 4| = 2
Distance from y → |7 − 4| = 3
Output: 1

Input: x = 2, y = 7, z = 4
Distances are equal
Output: 0
```
**Solution:**

1. Compute the absolute distance between ***x*** and ***z***.  
2. Compute the absolute distance between ***y*** and ***z***.  
3. Compare the two distances:  
   - If ***x*** is farther → return ***2***  
   - If ***y*** is farther → return ***1***  
4. If both distances are equal → return ***0***.

