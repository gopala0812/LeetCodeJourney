## Problem: ***Find the Highest Altitude*** (LeetCode ***#1732***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Prefix Sum***

**Problem Statement:**  
There is a biker going on a road trip.  
The biker starts at **altitude 0** and receives an integer array `gain` where `gain[i]` represents the **net gain in altitude** between point `i` and `i + 1`.

Return the **highest altitude** reached during the trip.

**Example:**
```
Input: gain = [-5, 1, 5, 0, -7]
Altitudes: [0, -5, -4, 1, 1, -6]
Output: 1

Input: gain = [-4, -3, -2, -1, 4, 3, 2]
Output: 0

```

**Solution:**

1. Start with ***currentAltitude = 0*** and ***maxAltitude = 0***.  
2. Traverse through the `gain` array:  
   - Add each value to ***currentAltitude***.  
   - Update ***maxAltitude*** with the maximum of current and previous max.  
3. Since the starting altitude is 0, include it in the comparison.  
4. Return ***maxAltitude*** as the highest altitude reached.
