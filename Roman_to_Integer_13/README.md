## Problem: ***Roman to Integer*** (LeetCode ***#13***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***HashMap / String / Simulation***

**Problem Statement:**  
Roman numerals consist of seven symbols, each with a fixed value.  
Given a Roman numeral string `s`, convert it into its **integer** value.

Roman numerals use both **addition** and **subtraction** rules:
- If a smaller value comes before a larger value → subtract.  
- Otherwise → add.

**Example:**

```
Input: s = "III"
Output: 3


Input: s = "MCMXCIV"
Output: 1994
Explanation:
M (1000)
CM (900)
XC (90)
IV (4)

```

**Solution:**

1. Store all Roman symbols and their values in a ***HashMap***.  
2. Loop through the string character by character.  
3. For each symbol, compare its value with the next symbol:  
   - If ***current < next*** → subtract current value.  
   - Otherwise → add current value.  
4. Continue until the end of the string.  
5. Return the accumulated integer result.
