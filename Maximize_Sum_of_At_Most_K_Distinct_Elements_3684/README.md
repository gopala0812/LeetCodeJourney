## Problem: ***Maximize Sum of At Most K Distinct Elements*** (LeetCode ***#3684***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / HashSet / Sorting***

**Problem Statement:**  
Given an integer array `nums` and an integer `k`, select **at most `k` distinct elements** such that their **sum is maximized**.

Return an array containing the selected elements in **descending order**.

**Example:**
```
Input: nums = [4, 2, 5, 2, 1, 5], k = 3
Distinct elements → [1, 2, 4, 5]
Pick top 3 → [5, 4, 2]
Output: [5, 4, 2]

Input: nums = [1, 1, 1], k = 2
Distinct elements → [1]
Output: [1]
```
**Solution:**

1. Use a ***HashSet*** to remove duplicate elements from the array.  
2. Convert the set into an array of unique elements.  
3. Sort the array in **ascending order**.  
4. Select the **largest `k` elements** from the end of the sorted array.  
5. Store them in descending order in the result array.  
6. Return the final array containing the selected elements.
