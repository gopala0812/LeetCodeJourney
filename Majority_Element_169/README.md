## Problem: ***Majority Element*** (LeetCode ***#169***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***HashMap / Counting***

**Problem Statement:**  
Given an integer array `nums`, return the **majority element**.  
The majority element is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element **always exists** in the array.

**Example:**
```
Input: nums = [3, 2, 3]
Output: 3

Input: nums = [2, 2, 1, 1, 1, 2, 2]
Output: 2
```
**Solution:**

1. Use a ***HashMap*** to store the frequency of each element.  
2. Traverse the array and update the count for each number.  
3. Compute the majority threshold as ***n / 2***.  
4. Iterate through the map to find the element whose count exceeds the threshold.  
5. Return that element as the majority element.
