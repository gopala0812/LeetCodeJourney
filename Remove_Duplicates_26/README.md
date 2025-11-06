## Problem: Remove Duplicates from Sorted Array (LeetCode #26)

**Difficulty:** Easy
**Language:** Java
**Topic:** Arrays / Two Pointers

**Problem Statement:**
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
Return the number of unique elements in nums. The relative order of the elements should be kept the same.

**Example:**

```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
```

**Approach:**

1.Use two pointers — one (i) for tracking the last unique element, and another (j) for scanning the array.

2.If nums[j] differs from nums[i], increment i and update nums[i] = nums[j].

3.Continue until all elements are processed.

4.Return i + 1 as the count of unique elements.
