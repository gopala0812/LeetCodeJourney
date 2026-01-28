## Problem: ***Matrix Diagonal Sum*** (LeetCode ***#1572***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Matrix***

**Problem Statement:**  
Given a **square matrix** `mat`, return the **sum of the matrix diagonals**.

The sum includes:
- All elements on the **primary diagonal**
- All elements on the **secondary diagonal**

⚠️ If an element lies on **both diagonals** (the center element in an odd-sized matrix), it should be counted **only once**.

**Example:**
```
Input:
mat = [
[1, 2, 3],
[4, 5, 6],
[7, 8, 9]
]

Primary diagonal → 1 + 5 + 9
Secondary diagonal → 3 + 5 + 7
Center element (5) counted once

Output: 25

Input:
mat = [
[7, 3, 1],
[2, 4, 6],
[9, 8, 5]
]

Output: 28
```
**Solution:**

1. Initialize ***sum = 0*** and store matrix size `n`.  
2. Traverse the matrix using index `i`:  
   - Add ***mat[i][i]*** (primary diagonal).  
   - Add ***mat[i][n - 1 - i]*** (secondary diagonal).  
3. If both diagonals point to the **same element**, add it only once using the condition:  
   ***i != n - 1 - i***  
4. Return the final diagonal sum.
