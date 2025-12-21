## Problem: ***Stable Mountains*** (LeetCode ***#2864***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Iteration***

**Problem Statement:**  
You are given an integer array `height` representing mountain heights and an integer `threshold`.  

A mountain at index `i` (where `i > 0`) is considered **stable** if the height of the **previous mountain** (`height[i-1]`) is **strictly greater** than `threshold`.

Return a list of all such indices `i`.

**Example:**
```
Input: height = [1, 2, 3, 4, 5], threshold = 2
Output: [3, 4]

Input: height = [5, 1, 4, 2], threshold = 3
Output: [1, 3]
```
**Solution:**

1. Initialize an empty list to store stable mountain indices.  
2. Iterate from index ***1*** to the end of the array.  
3. For each index `i`, check if ***height[i - 1] > threshold***.  
4. If the condition is satisfied, add index ***i*** to the result list.  
5. Return the final list of stable mountain indices.
