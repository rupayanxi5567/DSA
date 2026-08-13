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
    public ListNode removeNodes(ListNode h) {
        if (h == null || h.next == null)return h;
        
        ListNode c=h;
        ListNode prev=null;
        while(c!=null){
            ListNode n=c.next;
            c.next=prev;
            prev=c;
            c=n;
        }

        ListNode d=new ListNode(0);
        d.next=prev;
        ListNode t=d;

        ListNode p=d.next;
        int mx=-1;
        while(p!=null){
            if(p.val>=mx){
                mx=p.val;
                t.next=p;
                t=t.next;
            }
           p=p.next;
        }
        t.next=p;

        c=d.next;
        prev=null;

        while(c!=null){
            ListNode n=c.next;
            c.next=prev;
            prev=c;
            c=n;
        }
        return prev;
    }
}