## Problem: ***Strong Password Checker II*** (LeetCode ***#2299***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***String / Validation***

**Problem Statement:**  
A password is considered **strong** if it meets all of the following conditions:

1. Length is **at least 8**.  
2. Contains **at least one lowercase** letter.  
3. Contains **at least one uppercase** letter.  
4. Contains **at least one digit**.  
5. Contains **at least one special character** from:  
   `!@#$%^&*()-+`  
6. Does **not** contain two identical characters **next to each other**.

Given a string `password`, determine whether it is **strong**.

**Example:**

```
Input: password = "IloveJava123!"
Output: true

Copy code
Input: password = "aaBB12!!"
Output: false
Explanation: Contains adjacent identical characters ('a', 'B', '!').

```

**Solution:**

1. Check if the length is ***≥ 8***.  
2. Use boolean flags to track:  
   - ***hasLower***  
   - ***hasUpper***  
   - ***hasDigit***  
   - ***hasSpecial***  
3. Loop through each character and update flags accordingly.  
4. Ensure no two adjacent characters are the same.  
5. At the end, return ***true*** only if **all** conditions are satisfied.
