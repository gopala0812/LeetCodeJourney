## Problem: ***Is Subsequence*** (LeetCode ***#392***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Two Pointers / String***

**Problem Statement:**  
Given two strings `s` and `t`, check whether `s` is a **subsequence** of `t`.  
A subsequence means characters of `s` appear in `t` **in the same order**, but not necessarily continuously.

**Example:**
```
Input: s = "abc", t = "ahbgdc"
Output: true


Input: s = "axc", t = "ahbgdc"
Output: false

```
**Solution:**

1. Use two pointers:  
   - ***i*** for string `s`  
   - ***j*** for string `t`  
2. Move through both strings:  
   - If characters match → move pointer ***i*** to the next character in `s`.  
   - Always move pointer ***j*** forward in `t`.  
3. If ***i*** reaches the end of `s`, it means all characters were found in order → return ***true***.  
4. Otherwise → return ***false***.
