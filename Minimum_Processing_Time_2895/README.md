## Problem: ***Minimum Processing Time*** (LeetCode ***#2895***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Matrix / Sorting***

**Problem Statement:**  
You are given a 2D integer array `tasks`, where each row represents a set of tasks assigned to a processor.  
Each value denotes the **time required** to complete a task.

Return the **minimum total processing time**, i.e., the smallest sum of task times among all processors.

**Example:**
```
Input: tasks = [[1, 2, 3], [3, 1, 1], [2, 2, 2]]
Row sums → [6, 5, 6]
Output: 5

Input: tasks = [[5, 1], [2, 2], [4, 3]]
Row sums → [6, 4, 7]
Output: 4
```
**Solution:**

1. Create an array to store the **sum of each row** in the matrix.  
2. For each row, calculate the total processing time by summing its elements.  
3. Store each row sum in the array.  
4. Sort the array of sums.  
5. Return the **smallest value**, which represents the minimum processing time.
