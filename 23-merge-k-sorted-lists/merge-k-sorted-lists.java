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
    public static ListNode merges(ListNode h1,ListNode h2){
        if(h1==null)return h2;
        if(h2==null)return h1;
        if(h1==null && h2==null)return h2;

        ListNode res=new ListNode(0);
        ListNode t=res;
        ListNode p=h1;
        ListNode q=h2;

        while(p!=null && q!=null){
            if(p.val>q.val){
                t.next=q;
                t=t.next;
                q=q.next;
            }else{
                t.next=p;
                t=t.next;
                p=p.next;
            }
        }
        if(p==null) t.next=q;
        if(q==null) t.next=p;
        return res.next;
    }


    public ListNode mergeKLists(ListNode[] l) {
        if(l==null || l.length==0)return null;
        int n=l.length;
        ListNode r=l[0];
        for(int i=1;i<n;i++){
            r=merges(r,l[i]);
        }
        return r;
    }
}