## Problem: ***Find Numbers with Even Number of Digits*** (LeetCode ***#1295***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / String***

**Problem Statement:**  
Given an array of integers `nums`, return how many numbers contain an **even number of digits**.

**Example:**
```
Input: nums = [12, 345, 2, 6, 7896]
Output: 2
Explanation: 12 (2 digits), 7896 (4 digits)

Input: nums = [555, 901, 482, 1771]
Output: 1

```

**Solution:**

1. Loop through each number in the array.  
2. Convert the number to a string using ***Integer.toString()***.  
3. Check if the ***length*** of the string is **even**.  
4. If yes, increment the count.  
