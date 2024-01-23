package blind75.datastructures;

/**
 * Reverse a Linked List
 * Definition for singly-linked list.
 *
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class A_Easy_ReverseALinkedList {

    //Time Complexity O(n)
    //Space complexity O(1)
    public ListNode A_Easy_ReverseALinkedList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
