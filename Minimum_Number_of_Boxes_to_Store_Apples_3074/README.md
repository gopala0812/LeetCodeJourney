## Problem: ***Minimum Number of Boxes to Store Apples*** (LeetCode ***#3074***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Greedy / Sorting***

**Problem Statement:**  
You are given two integer arrays `apple` and `capacity`.  
- `apple[i]` represents the number of apples in the `iᵗʰ` pile.  
- `capacity[j]` represents the capacity of the `jᵗʰ` box.

You must store **all apples** using the **minimum number of boxes**.  
Each box can store apples up to its capacity.

Return the **minimum number of boxes required**.

**Example:**
```
Input:
apple = [1, 3, 2]
capacity = [4, 3, 1, 5]

Total apples = 6
Output: 2
```
**Solution:**

1. Calculate the ***total number of apples***.  
2. Sort the `capacity` array in **ascending order**.  
3. Start filling apples using boxes with the **largest capacity first** (greedy approach).  
4. Subtract each box’s capacity from the total apples and increment the box count.  
5. Stop once all apples are stored.  
6. Return the number of boxes used.
