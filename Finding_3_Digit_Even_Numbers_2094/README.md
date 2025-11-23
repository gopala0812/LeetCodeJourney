## Problem: ***Finding 3-Digit Even Numbers*** (LeetCode ***#2094***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Counting / Brute Force***

**Problem Statement:**  
You are given an array of digits (0–9). Using **exactly three digits** from the array (each digit can be used only as many times as it appears), form all possible **unique 3-digit even numbers** and return them in **sorted order**.  
A 3-digit number cannot start with 0.

**Example:**
```
Input: digits = [2, 1, 3, 0]
Output: [102, 120, 130, 132]

Copy code
Input: digits = [2, 2, 8, 8, 2]
Output: [228, 282, 288, 822, 828, 882]

```

**Solution:**

1. Count the frequency of each digit (0–9).  
2. Loop through every 3-digit even number from ***100 to 998***, stepping by ***2*** (only even numbers).  
3. Split the number into digits (**hundreds**, **tens**, **units**) and check if each digit is available using the frequency count.  
4. If all required digits are available, add the number to the result list.  
5. Convert the list to an array and return it in sorted order.
