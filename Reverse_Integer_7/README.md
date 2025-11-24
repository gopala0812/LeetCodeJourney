## Problem: ***Reverse Integer*** (LeetCode ***#7***)

**Difficulty:** ***Medium***  
**Language:** ***Java***  
**Topic:** ***Math / Integer Manipulation***

**Problem Statement:**  
Given a signed 32-bit integer `x`, return the integer obtained by reversing its digits.  
If reversing `x` causes it to overflow beyond the 32-bit signed integer range  
(**[-2³¹, 2³¹-1]**), return ***0***.

**Example:**
```
Input: x = 123
Output: 321


Input: x = -123
Output: -321

Input: x = 1534236469
Output: 0
Explanation: Reversed value overflows 32-bit signed integer range.

```
**Solution:**

1. Extract digits from the number using ***x % 10***.  
2. Build the reversed number using:  
   ***rev = rev * 10 + digit***  
3. Use a ***long*** to safely detect overflow during construction.  
4. If `rev` goes beyond the valid integer range, return ***0***.  
5. Continue until all digits are processed, then return the reversed integer.
