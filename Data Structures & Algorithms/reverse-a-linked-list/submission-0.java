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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode p = head;
        while(p!=null){
            s.push(p.val);
            p = p.next;
        }
        p = head;
        while(!s.isEmpty()){
           p.val = s.pop();
           p = p.next;
        }
        return head;
    }
}
