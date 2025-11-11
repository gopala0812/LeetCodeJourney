package Remove_Duplicates_from_Sorted_List_83;



class ListNode {
 int val;
 ListNode next;

 ListNode(int val) {
     this.val = val;
     this.next = null;
 }
}

public class RemoveDuplicatesFromSortedList {

 // Function to remove duplicates
 public static ListNode deleteDuplicates(ListNode head) {
     ListNode curr = head;

     while (curr != null && curr.next != null) {
         if (curr.val == curr.next.val) {
             // Skip the duplicate node
             curr.next = curr.next.next;
         } else {
             curr = curr.next;
         }
     }
     return head;
 }

 // Helper function to print the linked list
 public static void printList(ListNode head) {
     ListNode temp = head;
     while (temp != null) {
         System.out.print(temp.val);
         if (temp.next != null) System.out.print(" -> ");
         temp = temp.next;
     }
     System.out.println();
 }

 // Main method
 public static void main(String[] args) {
     // Creating a sorted linked list with duplicates: 1 -> 1 -> 2 -> 3 -> 3
     ListNode head = new ListNode(1);
     head.next = new ListNode(1);
     head.next.next = new ListNode(2);
     head.next.next.next = new ListNode(3);
     head.next.next.next.next = new ListNode(3);

     System.out.println("Original Linked List:");
     printList(head);

     // Remove duplicates
     head = deleteDuplicates(head);

     System.out.println("After Removing Duplicates:");
     printList(head);
 }
}
