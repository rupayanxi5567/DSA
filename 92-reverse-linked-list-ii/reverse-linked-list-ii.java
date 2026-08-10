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
    public ListNode reverseBetween(ListNode h, int l, int r) {
        if(h==null) return null;
        if(l==r) return h;

        ListNode t=h;
        ListNode b=null;
        int pos=1;

            while(pos<l){
                b=t;
                t=t.next;
                pos++;
            }
        ListNode c=t;
        ListNode p=null;
        int times=r-l+1;

        while(times>0){
           ListNode n=c.next;
           c.next=p;
           p=c;
           c=n;
           times--;
        }
        t.next=c;

        if(b!=null){
            b.next=p;
            return h;
        }else{
            return p;
        }

    }
}