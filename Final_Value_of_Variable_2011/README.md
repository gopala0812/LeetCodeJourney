## Problem: ***Final Value of Variable After Performing Operations*** (LeetCode ***#2011***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Simulation / String***

**Problem Statement:**  
You are given a variable `x` starting at **0** and an array of operations where each operation is one of the following:

- `"++X"` → increment before using  
- `"X++"` → increment after using  
- `"--X"` → decrement before using  
- `"X--"` → decrement after using  

Return the **final value of `x`** after performing all operations.

**Example:**
```
Input: operations = ["--X","X++","X++"]
Output: 1

```

**Solution:**

1. Initialize ***x = 0***.  
2. Iterate through each operation:  
   - If it contains `"++"` → ***increment x***  
   - If it contains `"--"` → ***decrement x***  
3. Return `x` after processing all operations.
