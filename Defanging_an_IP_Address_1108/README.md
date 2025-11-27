## Problem: ***Defanging an IP Address*** (LeetCode ***#1108***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***String Manipulation***

**Problem Statement:**  
Given a valid IPv4 address, return a version of the address where every **"."** is replaced by **"[.]"**.  
This process is called **defanging**, and it is commonly used for security purposes.

**Example:**
```
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"


Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

```
**Solution:**

1. Traverse each character of the input string.  
2. If the character is a **dot ( . )**, append ***"[.]"*** to the result.  
3. Otherwise, append the character itself.  
4. Use ***StringBuilder*** for efficient string creation.  
5. Return the fully defanged IP address.
