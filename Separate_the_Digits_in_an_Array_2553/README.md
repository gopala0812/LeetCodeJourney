## Problem: ***Separate the Digits in an Array*** (LeetCode ***#2553***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Digit Manipulation***

**Problem Statement:**  
Given an array of positive integers `nums`, return an array consisting of the **digits of each number** in `nums`, in the **same order** they appear.

**Example:**
```
Input: nums = [13, 25, 83]
Output: [1, 3, 2, 5, 8, 3]

Input: nums = [7, 1, 3]
Output: [7, 1, 3]
```
**Solution:**

1. First, count the **total number of digits** across all numbers in the array.  
2. Create a result array of that total size.  
3. Traverse the input array from **right to left**.  
4. For each number, extract digits using ***num % 10*** and place them into the result array from the end.  
5. Continue until all digits are processed.  
6. Return the final array containing all separated digits in order.
