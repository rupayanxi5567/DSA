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
    public ListNode reverseList(ListNode h) {
        if (h==null) return null;
        if(h.next==null) return h;
        ListNode c=h;
        ListNode n=c.next;
        ListNode p=null;
        while(n!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;

            
        }
        return p;
    }
}