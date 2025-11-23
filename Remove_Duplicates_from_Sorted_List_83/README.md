## Problem: ***Remove Duplicates from Sorted List*** (LeetCode ***#83***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Linked List***

**Problem Statement:**  
Given the head of a **sorted linked list**, remove all duplicate nodes so that each element appears **only once**.  
Return the head of the modified list.

**Example:**

```
Input: head = [1, 1, 2]
Output: [1, 2]

Copy code
Input: head = [1, 1, 2, 3, 3]
Output: [1, 2, 3]

```

**Solution:**

1. Traverse the linked list using a pointer ***curr***.  
2. For each node, compare ***curr.val*** with ***curr.next.val***.  
3. If both values are equal → skip the next node by updating:  
   ***curr.next = curr.next.next***  
4. If they are not equal → simply move the pointer forward.  
5. Continue until all duplicates are removed.  
6. Return the modified head of the list.
