## Problem: ***How Many Numbers Are Smaller Than the Current Number*** (LeetCode ***#1365***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting / HashMap***

**Problem Statement:**  
Given the array `nums`, for each element `nums[i]`, find how many numbers in the array are **strictly smaller** than it.

Return the result as an array.

**Example:**
```
Input: nums = [8, 1, 2, 2, 3]
Output: [4, 0, 1, 1, 3]

Input: nums = [6, 5, 4, 8]
Output: [2, 1, 0, 3]
```
**Solution:**

1. Create a sorted copy of the original array.  
2. Use a ***HashMap*** to store the **first index** of each unique value in the sorted array.  
   - This index represents how many numbers are smaller than that value.  
3. Traverse the original array and replace each element with its mapped count.  
4. Return the final result array.
