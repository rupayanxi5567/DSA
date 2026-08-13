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
    public ListNode partition(ListNode h, int x) {
        if(h==null || h.next==null) return h;
        ListNode ld=new ListNode(0);
        ListNode gd=new ListNode(0);
        ListNode r1=ld;
        ListNode r2=gd;
        ListNode p=h;

        while(p!=null){
            if(p.val<x){
                r1.next=p;
                r1=r1.next;
            }else{
                r2.next=p;
                r2=r2.next;
            }
            p=p.next;
        }
        r1.next=gd.next;
        r2.next=null;
    return ld.next;
    }
}