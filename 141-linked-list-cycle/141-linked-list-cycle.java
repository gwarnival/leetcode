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
        ListNode node = head;
        HashSet<ListNode> set = new HashSet<>();
        while (node != null) {
            if (set.contains(node.next)) {
                return true;
            }
            set.add(node.next);
            node = node.next;
        }
        return false;
    }
}