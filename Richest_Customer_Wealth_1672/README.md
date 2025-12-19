## Problem: ***Richest Customer Wealth*** (LeetCode ***#1672***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Matrix***

**Problem Statement:**  
You are given a 2D integer array `accounts` where `accounts[i][j]` represents the amount of money the `iᵗʰ` customer has in the `jᵗʰ` bank.  

Return the **maximum wealth** among all customers.  
A customer’s wealth is the **sum of money** in all their bank accounts.

**Example:**
```
Input: accounts = [[1,2,3],[3,2,1]]
Customer 1 wealth = 1 + 2 + 3 = 6
Customer 2 wealth = 3 + 2 + 1 = 6
Output: 6


Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
```

**Solution:**

1. For each customer, calculate the **sum** of their bank balances.  
2. Store each customer’s total wealth.  
3. Sort the wealth values to find the maximum.  
4. Return the **largest** wealth value as the answer.
