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
    public ListNode removeNthFromEnd(ListNode h, int n) {
        if(h==null || h.next==null) return null;
        ListNode tep=h,p=h;
        int len=0;
        while(tep!=null) {
            len++;
            tep=tep.next;
        }
        if(len==n) return h.next;
        int to_run=len-n;
        for(int i=1;i<to_run;i++){
            p=p.next;
        }
        ListNode q=p.next;
        p.next=q.next;
        q.next=null;
        return h;
    }
}