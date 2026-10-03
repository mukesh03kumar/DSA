/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;    //+1
            fast = fast.next.next;   //+2
        }

        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        // 1. find the mid node
        ListNode midNode = findMid(head);

        // 2. 2nd half reverse
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode left = head;
        ListNode right = prev;

        // 3. check 1st half with 2nd half
        while(right != null){
            if(left.val != right.val){
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }
}