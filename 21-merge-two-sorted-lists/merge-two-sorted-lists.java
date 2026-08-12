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
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if(h1==null && h2==null) return null;
        if(h1==null) return h2;
        if(h2==null) return h1;

        ListNode d=new ListNode(0);
        ListNode r=d;

        ListNode p=h1;
        ListNode q=h2;

        while(p!=null && q!=null){
            if(q.val>p.val){
                r.next=p;
                p=p.next;
            }else{
                r.next=q;
                q=q.next;
            }
            r=r.next;
        }
        while(p!=null){
            r.next=p;
            r=r.next;
            p=p.next;
        }
        while(q!=null){
            r.next=q;
            r=r.next;
            q=q.next;
        }
        return d.next;
    }
}