## Problem: Remove Element (LeetCode #27)

**Difficulty:** Easy
**Language:** Java
**Topic:** Arrays / Two Pointers

**Problem Statement:**

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The relative order of the elements may be changed.

Return the number of elements in nums which are not equal to val.

It does not matter what you leave beyond the returned length.

**Example:**

```
Input: nums = [3, 2, 2, 3], val = 3  
Output: 2  

**Explanation:** 

After removing 3s, the array becomes [2, 2, _, _].  
So the length of the array without 3s is 2.
```

**Solution :**

1.Use a two-pointer approach — one pointer i scans through the array, another k keeps track of the next valid position.

2.Iterate through the array:

3.If the current element nums[i] is not equal to val, copy it to nums[k] and increment k.

4.At the end of the loop, k represents the new length of the array after removal.

5.Return k.
