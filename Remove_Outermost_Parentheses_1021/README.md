## Problem: ***Remove Outermost Parentheses*** (LeetCode ***#1021***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Stack / String***

**Problem Statement:**  
A valid parentheses string is formed by pairs of `"("` and `")"`.  
You are given such a string `s`, composed of multiple **primitive** parentheses substrings.

A **primitive** substring cannot be split into two non-empty valid parentheses strings.

Your task is to **remove the outermost parentheses** of every primitive substring.

**Example:**
```
Input: s = "(()())(())"
Output: "()()()"

Input: s = "(()())(())(()(()))"
Output: "()()()()(())"

```

**Solution:**

1. Maintain a counter ***depth*** to track nesting level.  
2. While iterating through characters:  
   - On `'('`:  
     - If ***depth > 0*** → append `'('`  
     - Then increment ***depth***  
   - On `')'`:  
     - Decrement ***depth*** first  
     - If ***depth > 0*** → append `')'`  
3. Only parentheses **inside** outermost layer get added to the result.  
4. Return the final constructed string.
