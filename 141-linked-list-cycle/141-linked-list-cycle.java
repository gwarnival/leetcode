/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode faster = head;
        ListNode slower = head;
        
        while (faster != null && slower != null) {
            slower = slower.next;
            if (faster.next == null) {
                return false;
            }
            faster = faster.next.next;
            
            if (slower == faster) {
                return true;
            }
        }        
        return false;        
    }
}