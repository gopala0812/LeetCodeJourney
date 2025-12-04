## Problem: ***Longest Common Prefix*** (LeetCode ***#14***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***String / Prefix Matching***

**Problem Statement:**  
Write a function to find the **longest common prefix** among an array of strings.  
If no common prefix exists, return an empty string `""`.

**Example:**
```
Input: strs = ["flower", "flow", "flight"]
Output: "fl"

Input: strs = ["dog", "racecar", "car"]
Output: ""
Explanation: No common prefix among the input strings.

```

**Solution:**

1. Assume the first string as the initial ***prefix***.  
2. Compare this prefix with each string in the array.  
3. While the current string does **not** start with the prefix:  
   - Shorten the prefix by removing the last character.  
   - If the prefix becomes empty → return `""`.  
4. After checking all strings, return the remaining prefix as the answer.
