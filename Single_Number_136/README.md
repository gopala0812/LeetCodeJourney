## Problem: ***Single Number*** (LeetCode ***#136***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Bit Manipulation / XOR***

**Problem Statement:**  
Given a **non-empty** array of integers `nums`, every element appears **twice** except for **one** element.  
Find and return the element that appears **only once**.

You must implement a solution with **linear runtime complexity** and **constant extra space**.

**Example:**
```
Input: nums = [4, 1, 2, 1, 2]
Output: 4

Input: nums = [2, 2, 1]
Output: 1
```
**Solution:**

1. Initialize a variable ***ans = 0***.  
2. Traverse the array and apply the ***XOR (^)*** operation with each element.  
3. Properties of XOR used:
   - `a ^ a = 0`  
   - `a ^ 0 = a`  
   - XOR is **commutative** and **associative**  
4. All duplicate numbers cancel each other out, leaving only the unique number.  
5. Return ***ans*** as the single number.
