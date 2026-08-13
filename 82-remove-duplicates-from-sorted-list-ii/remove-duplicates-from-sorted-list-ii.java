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
    public ListNode deleteDuplicates(ListNode h) {
        if(h==null || h.next==null) return h;
        ListNode d=new ListNode(0);
        d.next=h;

        ListNode t=d;
        ListNode p=h;
        ListNode q=p.next;

        while(q!=null){
            // if(q.next!=null && p.val==q.val && q.val==q.next.val){
            //     t.next=q.next.next;
            //     if(t.next==null) return d.next;
            //     p=t.next;
            //     q=p.next;
            // }else 
            
            
            
            if(p.val==q.val){
                // if(q.next!=null && q.val==q.next.val){
                //     t.next=q.next.next;
                //     if(t.next.val==q.val)t.next=t.next.next; 
                // }else 
                t.next=q.next;
                // if(t.next==null) return d.next;
                while(t.next!=null && t.next.val==q.val)t.next=t.next.next; 
                if(t.next==null) return d.next;
                p=t.next;
                q=p.next;
            }else{
                p=p.next;
                q=q.next;
                t=t.next;
            }
            
        }
        return d.next;
    }
}