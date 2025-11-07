## Problem: Fizz Buzz (LeetCode #412)

**Difficulty:** Easy
**Language:** Java
**Topic:** Loops / Conditional Statements

**Problem Statement:**

Given an integer n, return a list of strings representing the numbers from 1 to n.
But for multiples of three, output "Fizz" instead of the number, and for the multiples of five, output "Buzz".
For numbers which are multiples of both three and five, output "FizzBuzz".

**Example:**
```
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
```

**Approach:**

1.Create an empty list to store the result.

2.Loop through numbers from 1 to n.

3.For each number:

If divisible by both 3 and 5 → add "FizzBuzz".

Else if divisible by 3 → add "Fizz".

Else if divisible by 5 → add "Buzz".

Otherwise, add the number itself as a string.

4.Return the list after the loop ends.
