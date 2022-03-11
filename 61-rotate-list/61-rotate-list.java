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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null) {
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode node = head;
        int size = 0;
        
        while (node != null) {
            node = node.next;
            size++;
        }
        
        k %= size;
        
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        fast.next = head;
        ListNode result = slow.next;
        slow.next = null;
        return result;
        
    }
}