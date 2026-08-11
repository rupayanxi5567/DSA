/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        int l1=0,l2=0;
        ListNode p=h1,q=h2;
        while(p!=null){
            p=p.next;
            l1++;
        }
        while(q!=null){
            q=q.next;
            l2++;
        }
        p=h1;
        q=h2;

        if(l2>l1){
            for(int i=1;i<=l2-l1;i++){
                if(q!=null){
                    q=q.next;
                }
            }
        }else{
            for(int i=1;i<=l1-l2;i++){
                if(p!=null){
                    p=p.next;
                }
            }
        }
        while(p!=q){
            p=p.next;
            q=q.next;
        }
        return p;
    }
}