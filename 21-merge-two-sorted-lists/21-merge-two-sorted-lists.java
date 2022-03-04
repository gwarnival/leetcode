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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode node = new ListNode();
        ListNode result = node;
        
        while(list1 != null && list2 != null) {
            // 2,3,4 : 1,2,3
            if (list1.val >= list2.val) {
                node.next = list2;
                node = node.next;
                list2 = list2.next;
            } else {
                node.next = list1;
                node = node.next;
                list1 = list1.next;
            }
        }
        
        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }
        
        return result.next;
    }
}