## Problem: Length of Last Word (LeetCode #58)

**Difficulty:** Easy
**Language:** Java
**Topic:** String Manipulation

**Problem Statement:**
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is defined as a maximal substring consisting of non-space characters only.

**Example:**

```
Input: s = "Hello World"
Output: 5
```

**Approach:**

1.Use trim() to remove extra spaces at the start and end of the string.

2.Split the string using " " (space) as a delimiter.

3.Access the last word and return its length.
