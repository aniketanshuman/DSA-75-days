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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list1 = new ArrayList<Integer>();
        while(head!=null){
            list1.add(head.val);
            head = head.next;
        }
        List<Integer> list3 = new ArrayList<Integer>(list1);
        Collections.reverse(list3);
        for(int i=0; i< list1.size(); i++){
            if(list1.get(i) != list3.get(i))
                return false;
        }
        return true;
    }
}