## Problem: ***Number of Employees Who Met the Target*** (LeetCode ***#2798***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Counting***

**Problem Statement:**  
You are given an integer array `hours` where `hours[i]` represents the number of hours worked by the `iᵗʰ` employee, and an integer `target`.

Return the **number of employees** who worked **at least `target` hours**.

**Example:**
```
Input: hours = [0, 1, 2, 3, 4], target = 2
Employees meeting target → [2, 3, 4]
Output: 3

Input: hours = [5, 1, 4, 2, 2], target = 3
Output: 2
```
**Solution:**

1. Initialize a counter ***total = 0***.  
2. Traverse each value in the `hours` array.  
3. If an employee worked **greater than or equal to** the target hours, increment ***total***.  
4. Return ***total*** as the final count.
