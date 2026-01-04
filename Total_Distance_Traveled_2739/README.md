## Problem: ***Total Distance Traveled*** (LeetCode ***#2739***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Simulation / Math***

**Problem Statement:**  
A car has two fuel tanks:
- **mainTank** and **additionalTank**

For every **1 liter** of fuel used from the main tank, the car can travel **10 km**.  
After every **5 liters** of fuel consumed from the main tank, if the additional tank has fuel,  
**1 liter** is transferred from the additional tank to the main tank.

Return the **total distance traveled** by the car.

**Example:**
```
Input: mainTank = 5, additionalTank = 10
Output: 60

Input: mainTank = 1, additionalTank = 2
Output: 10
```
**Solution:**

1. Initialize a counter to track fuel usage in batches of ***5 liters***.  
2. For each liter consumed from the main tank:  
   - Add ***10 km*** to the distance.  
   - Decrease the batch counter.  
3. When ***5 liters*** are consumed and the additional tank is not empty:  
   - Transfer ***1 liter*** from additional tank to main tank.  
   - Reset the batch counter.  
4. Continue until the main tank becomes empty.  
5. Return the accumulated total distance.
