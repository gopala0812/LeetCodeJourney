## Problem: Palindrome Number (LeetCode #9)

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Math / String / Two Pointers  

**Problem Statement:**  
Given an integer `x`, determine whether it is a **palindrome**. An integer is a palindrome if it reads the same forward and backward.

**Example:**  
```java
Input: x = 121
Output: true

Input: x = -121
Output: false

Input: x = 10
Output: false
```
**Solution:**

1.Convert the integer to a string.

2.Use two pointers, left and right, starting at the beginning and end of the string.

3.Compare the characters at the two pointers:

If they are the same, move left forward and right backward.

If they are different, return false.

4.If all corresponding characters match, return true; otherwise, return false.
