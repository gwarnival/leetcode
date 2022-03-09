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
    public ListNode deleteDuplicates(ListNode head) {
       
        ListNode result = new ListNode();
        result.next = head;
        ListNode node = result;
        
        while (node.next != null && node.next.next != null) {
            if (node.next.val == node.next.next.val) {
                int num = node.next.val;
                while (node.next != null && node.next.val == num) {
                    node.next = node.next.next;
                }
            } else {
                node = node.next;    
            }
            
        }
        return result.next;
    }
}