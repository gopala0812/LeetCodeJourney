## Problem: ***Height Checker*** (LeetCode ***#1051***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting***

**Problem Statement:**  
You are given an integer array representing students' heights.  
Your task is to determine how many students are standing **out of order** compared to how they would appear in **non-decreasing sorted order**.

**Example:**

```
Input: heights = [1, 1, 4, 2, 1, 3]
Sorted = [1, 1, 1, 2, 3, 4]
Output: 3


Input: heights = [5, 1, 2, 3, 4]
Output: 5

```

**Solution:**

1. Clone the original array to create ***expected***.  
2. Sort ***expected*** to get the correct height order.  
3. Compare each index of ***heights*** with ***expected***.  
4. Count the positions where both arrays differ.  
5. Return the final count of students out of place.
