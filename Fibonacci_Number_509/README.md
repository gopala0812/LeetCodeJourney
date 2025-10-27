## Problem: Fibonacci Number (LeetCode #509)

**Difficulty:** Easy
**Language:** Java
**Topic:** Recursion / Dynamic Programming

**Problem Statement:**

The Fibonacci numbers, commonly denoted as F(n), form a sequence such that each number is the sum of the two preceding ones, starting from 0 and 1.

That is,

```
F(0) = 0, F(1) = 1  
F(n) = F(n - 1) + F(n - 2), for n > 1
```

Given n, calculate F(n).

**Example:**
```
Input: n = 4  
Output: 3

Explanation:  
F(0) = 0  
F(1) = 1  
F(2) = 1  
F(3) = 2  
F(4) = 3
```
**Solution :**

1.Use recursion to compute the Fibonacci number.

2.Define base cases for n == 0 and n == 1.

3.For all other cases, return fib(n - 1) + fib(n - 2).

4.This simple recursive approach helps understand the concept of overlapping subproblems (can later be optimized with
  memoization).
