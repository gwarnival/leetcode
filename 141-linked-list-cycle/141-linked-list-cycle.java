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
        HashMap<ListNode, Integer> map = new HashMap<>();
        while (node != null) {
            if (map.containsKey(node.next)) {
                return true;
            }
            map.put(node.next, node.val);
            node = node.next;
        }
        return false;
    }
}