## Problem: Missing Number (LeetCode #268)

**Difficulty:** Easy
**Language:** Java
**Topic:** Array / Math / Bit Manipulation

**Problem Statement:**
Given an array nums containing n distinct numbers taken from the range [0, n], return the one number that is missing from the range.

**Example:**
```
Input: nums = [3,0,1]
Output: 2
Explanation: The numbers in the range [0,3] are [0,1,2,3].
The missing number is 2.
```

**Solution **

1.Find the total sum of the first n natural numbers using the formula n × (n + 1) / 2.

2.Calculate the sum of all numbers present in the given array.

3.Subtract the array sum from the total sum — the result will be the missing number.

4.Return that missing number.
