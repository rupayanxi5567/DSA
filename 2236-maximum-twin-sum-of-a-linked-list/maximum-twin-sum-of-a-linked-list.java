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
    public int pairSum(ListNode h) {
        if(h==null || h.next==null) return 0;
        ListNode s=h,f=h;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        ListNode c=s;
        ListNode p=null;

        while(c!=null){
            ListNode n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        f=p;
        s=h;
        
        int mx=-1;
        while(s!=null && f!=null){
            int sum=s.val+f.val;
            mx=Math.max(mx,sum);
            s=s.next;
            f=f.next;
        }
        return mx;
    }
}