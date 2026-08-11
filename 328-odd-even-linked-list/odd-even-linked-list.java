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
    public ListNode oddEvenList(ListNode h) {
        if(h==null || h.next==null) return h;
        
        ListNode p=h,q=h.next,s=h.next;

        while(q!=null && q.next!=null){
            p.next=q.next;
            p=p.next;
            q.next=p.next;
            q=q.next;
        }
        p.next=s;
        // q.next=null;
        return h;
    }
}