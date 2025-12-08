## Problem: ***Robot Return to Origin*** (LeetCode ***#657***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Simulation / String***

**Problem Statement:**  
A robot moves on a 2D plane starting at position `(0,0)`.  
You are given a string `moves` where each character represents a move:

- `'U'` → move up  
- `'D'` → move down  
- `'L'` → move left  
- `'R'` → move right  

Return ***true*** if the robot returns to the **origin `(0,0)`**, otherwise return ***false***.

**Example:**
```
Input: moves = "UD"
Output: true


Input: moves = "LL"
Output: false

```

**Solution:**

1. Initialize coordinates: ***x = 0***, ***y = 0***.  
2. Traverse each move:  
   - `'U'` → `y++`  
   - `'D'` → `y--`  
   - `'L'` → `x--`  
   - `'R'` → `x++`  
3. After processing all moves, check if:  
   ***x == 0 && y == 0***  
4. If yes → robot returned to origin → return ***true***, else ***false***.
