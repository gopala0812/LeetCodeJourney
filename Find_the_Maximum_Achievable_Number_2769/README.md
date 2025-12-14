## Problem: ***Find the Maximum Achievable Number*** (LeetCode ***#2769***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math***

**Problem Statement:**  
Given two integers `num` and `t`, you can perform the following operation **at most `t` times**:

- Increase `num` by **1** and decrease another number by **1**, or  
- Decrease `num` by **1** and increase another number by **1**.

Return the **maximum achievable value** of `num` after performing the operations.

**Example:**
```
Input: num = 3, t = 2
Output: 7


Input: num = 4, t = 1
Output: 6

```

**Solution:**

1. Each operation can increase `num` by **1**.  
2. Since you can perform the operation ***t*** times, the maximum increase is ***2 × t***.  
3. Therefore, the maximum achievable value is:  
   ***num + 2 × t***  
4. Return the computed result.
