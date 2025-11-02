## Problem: Excel Sheet Column Title (LeetCode #168)

**Difficulty:** Easy
**Language:** Java
**Topic:** Math / String

**Problem Statement:**

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

**For example:**

```
A -> 1  
B -> 2  
C -> 3  
...  
Z -> 26  
AA -> 27  
AB -> 28
```


**Solution :**

1.Excel column titles follow a base-26 system, where A–Z represent 1–26.

2.To handle this properly, subtract 1 before finding the remainder to make it 0-based.

3.Take remainder = columnNumber % 26 and convert it to a character using 'A' + remainder.

4.Append the letter to the result and divide the number by 26.

5.Repeat until the number becomes 0, then reverse the string since letters are added backward.
