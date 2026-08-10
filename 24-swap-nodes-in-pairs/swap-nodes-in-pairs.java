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
    public ListNode swapPairs(ListNode h) {
        if(h==null) return h;
        ListNode d=new ListNode(0);
        d.next=h;
        ListNode p=d;

        while(p.next!=null && p.next.next!=null){
            ListNode f=p.next;
            ListNode s=p.next.next;

            f.next=s.next;
            s.next=f;
            p.next=s;

            p=p.next.next;

        }
        return d.next;

    }
}