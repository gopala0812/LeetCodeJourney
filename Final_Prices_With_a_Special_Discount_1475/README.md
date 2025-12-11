## Problem: ***Final Prices With a Special Discount in a Shop*** (LeetCode ***#1475***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Stack / Simulation***

**Problem Statement:**  
You are given an array `prices` where `prices[i]` is the price of an item.  
For each item `i`, you must find the **first** item `j > i` such that `prices[j] <= prices[i]`.  
If such an item exists, the discount equals `prices[j]`, otherwise no discount applies.

Return the array of **final prices** after applying discounts.

**Example:**

```
Input: prices = [8, 4, 6, 2, 3]
Output: [4, 2, 4, 2, 3]


Input: prices = [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]

```

**Solution:**

1. For each item at index ***i***, look ahead to find the first price ***j > i*** where `prices[j] <= prices[i]`.  
2. If found → reduce `prices[i] -= prices[j]`.  
3. If no such `j` exists → price stays the same.  
4. Use nested loops (brute force approach) to check each future price.  
5. Return the modified `prices` array.
