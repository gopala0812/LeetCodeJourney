## Problem: Running Sum of 1D Array (LeetCode #1480)

**Difficulty:** Easy
**Language:** Java
**Topic:** Array / Prefix Sum

**Problem Statement:**
Given an array nums, return the running sum of nums.
The running sum of an array is defined as runningSum[i] = sum(nums[0]…nums[i]).

**Example:**

```
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]

```
**Approach :**

1.Initialize an array runningSum of the same length as nums.

2.Set runningSum[0] = nums[0].

3.or each index i from 1 to len-1:

Add the current number nums[i] to the previous running sum runningSum[i-1].

Store the result in runningSum[i].

4.Return the runningSum array.
