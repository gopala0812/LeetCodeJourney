## Problem: Power of Three (LeetCode #326)

**Difficulty:** Easy
**Language:** Java
**Topic:** Math / Recursion

**Problem Statement:**

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three if there exists an integer x such that n == 3^x.

**Examples:**
```
Input: n = 27  
Output: true  

Input: n = 45  
Output: false  
```

**Solution:**

1.The idea is to continuously divide n by 3 as long as it is divisible.

2.If at the end, n becomes 1, it means n was originally a power of 3.

3.If n becomes less than or equal to 0, or not divisible by 3 at some point, then it’s not a power of 3.

4.This can be implemented using either an iterative or recursive approach.
