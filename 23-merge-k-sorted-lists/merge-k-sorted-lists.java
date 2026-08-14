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

    public static ListNode dAndC(ListNode[] l ,int s,int e){
        if(s==e) return l[s];
        if(s>e) return null;
        int mid=s+(e-s)/2;

        ListNode lm=dAndC(l,s,mid);
        ListNode rm=dAndC(l,mid+1,e);

        return merges(lm,rm);
    }


    public ListNode mergeKLists(ListNode[] l) {
        if(l==null || l.length==0)return null;
        int n=l.length;
        return dAndC(l,0,n-1);
    }
}