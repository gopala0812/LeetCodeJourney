## Problem: Move Zeroes (LeetCode #283)

**Difficulty:** Easy  
**Language:** Java  
**Topic:** Two Pointers / Array Manipulation  

**Problem Statement:**  
Given an integer array `nums`, move all `0`'s to the **end** of the array **while maintaining the relative order of the non-zero elements**. You must do this **in-place** without making a copy of the array and with O(1) extra space.

**Example:**  
```java
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Input: nums = [0,0,1]
Output: [1,0,0]
```

**Solution:**

1.Use the two-pointer approach:

One pointer (lastNonZeroFoundAt) keeps track of the position to place the next non-zero element.

The other pointer (current) iterates through the array.

2.Loop through the array:

If nums[current] is non-zero, swap it with nums[lastNonZeroFoundAt].

Increment lastNonZeroFoundAt.

3.After the loop, all non-zero elements are at the front, and all zeros are pushed to the end.

