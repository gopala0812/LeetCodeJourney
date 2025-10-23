## Problem: Reverse String (LeetCode #344)

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Two Pointers / String Manipulation  

**Problem Statement:**  
Write a function that reverses a string. The input string is given as an array of characters `char[] s`. You must do this by modifying the input array in-place with O(1) extra memory.

**Example:**  
```java

Input: s = ['h','e','l','l','o']
Output: ['o','l','l','e','h']
```

**Solution:**

1.We use the two-pointer approach:

2.Initialize two pointers: left at the start and right at the end of the array.

3.Swap the characters at left and right.

4.Move left forward and right backward.

5.Repeat until left >= right.
