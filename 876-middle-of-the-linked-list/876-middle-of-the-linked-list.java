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
    public ListNode middleNode(ListNode head) {
        // int count = 0;
        // ListNode start = new ListNode();
        // start.next = head;
        // while(head.next != null){
        //     head = head.next;
        //     count++;
        // }
        // count++;
        // int n = (count/2) + 1 ;
        // for(int i=1;i<=n;i++){
        //     start = start.next; 
        // }
        // return start;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}