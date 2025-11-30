## Problem: ***Lemonade Change*** (LeetCode ***#860***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Greedy / Simulation***

**Problem Statement:**  
At a lemonade stand, each lemonade costs **$5**.  
Customers pay with bills of **$5, $10, or $20** in the order given by the array `bills`.  
The seller must provide correct change for each transaction.

Return ***true*** if change can be provided to every customer; otherwise, ***false***.

**Example:**
```
Input: bills = [5, 5, 5, 10, 20]
Output: true


Input: bills = [5, 5, 10, 10, 20]
Output: false
Explanation: Not enough $5 bills to give change.

```

**Solution:**

1. Maintain two counters:  
   - ***five*** → number of $5 bills  
   - ***ten*** → number of $10 bills  
2. For each bill:
   - If bill is ***$5*** → increment ***five***.  
   - If bill is ***$10*** → need one ***$5*** for change.  
   - If bill is ***$20*** → give priority to one ***$10 + one $5*** for change;  
     if not possible, give ***three $5 bills***.  
3. If at any point change cannot be given → return ***false***.  
4. If all customers are served, return ***true***.
