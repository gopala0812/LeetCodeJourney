## Problem: ***Convert a Number to Hexadecimal*** (LeetCode ***#405***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Bit Manipulation / Math***

**Problem Statement:**  
Given an integer `num`, return its hexadecimal representation as a lowercase string.  
The hexadecimal digits are: 0–9 and a–f.  
For negative numbers, two’s complement representation is used.

**Example:**

```
Input: num = 26
Output: "1a"

Copy code
Input: num = -1
Output: "ffffffff"

```

**Solution:**

1. Java provides a built-in method ***Integer.toHexString(num)***.  
2. It automatically converts the integer (positive or negative) into hexadecimal.  
3. No manual bitwise processing is required.  
4. Return the resulting hex string.
