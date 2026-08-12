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
    public void reorderList(ListNode h) {
        if(h==null || h.next==null) return ;
        ListNode s=h,f=h;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        ListNode pv=null,crr=s;
        while(crr!=null){
            ListNode nxt=crr.next;
            crr.next=pv;
            pv=crr;
            crr=nxt;
        }
        


        ListNode p=h,q=pv;
        ListNode p1=p.next,q1=q.next;
        while(q!=null && q.next!=null){
            p.next=q;
            p=p1;
            if(q.next!=null){q.next=p;q=q1;}
            else q=q.next; //com if--------------------
            if(p1!=null)p1=p1.next;
            if(q1!=null)q1=q1.next; //null check
        }
        // s.next=null;
    }
}