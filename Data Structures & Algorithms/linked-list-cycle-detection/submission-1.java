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
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ArrayList<ListNode>arr = new ArrayList<>();
        while(p!=null && !arr.contains(p)){
            arr.add(p);
            p = p.next;
        }
        if(p == null) return false;
        else return true;
    }
}
