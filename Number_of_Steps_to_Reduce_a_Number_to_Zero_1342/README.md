## Problem: Number of Steps to Reduce a Number to Zero (LeetCode #1342)

**Difficulty:** Easy
**Language:** Java
**Topic:** Math / Simulation

**Problem Statement:**

Given an integer num, return the number of steps to reduce it to zero.
In one step:

If the number is even, divide it by 2.

If the number is odd, subtract 1 from it.

**Example:**
```
Input: num = 14  
Output: 6  
Explanation:
Step 1 → 14 → 7  
Step 2 → 7 → 6  
Step 3 → 6 → 3  
Step 4 → 3 → 2  
Step 5 → 2 → 1  
Step 6 → 1 → 0
```

**Solution :**

1.Initialize a counter step = 0.

2.While num is not zero, check whether it’s even or odd.

3.If even → divide it by 2.

4.If odd → subtract 1.

5.Increment step after each operation.

6.Return the total number of steps when num becomes zero.
