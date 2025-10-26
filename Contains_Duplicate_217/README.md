## Problem: Contains Duplicate (LeetCode #217)

**Difficulty:** Easy
**Language:** Java
**Topic:** Array / HashSet / Hashing

**Problem Statement:**
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example:**
java
```
Input: nums = [1,2,3,4]
Output: false

Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```


**Solution:**

1.Create a HashSet to store unique numbers.

2.Iterate through each element in the array:

Add the number to the set.

Duplicates are automatically ignored.

3.Compare the length of the array with the size of the set:

If they are equal → no duplicates → return false.

If they are not equal → duplicates exist → return true.

4.Return the result.
