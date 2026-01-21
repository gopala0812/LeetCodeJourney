## Problem: ***Reverse Prefix*** (LeetCode ***#3794***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***String / Simulation***

**Problem Statement:**  
Given a string `s` and an integer `k`, reverse the **first `k` characters** of the string and keep the remaining characters unchanged.

Return the resulting string after reversing the prefix.

**Example:**
```
Input: s = "abcdef", k = 3
Output: "cbadef"

Input: s = "leetcode", k = 4
Output: "teelcode"
```
**Solution:**

1. Traverse the string from index ***k - 1*** down to ***0*** and append characters to build the reversed prefix.  
2. Append the remaining characters from index ***k*** to the end of the string.  
3. Combine both parts to form the final string.  
4. Return the resulting string after reversing the prefix.
