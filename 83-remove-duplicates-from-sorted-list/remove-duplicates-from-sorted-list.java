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
        ListNode p=h;
        ListNode q=p.next;

        while(p!=null && q!=null){
            if(p.val==q.val){
                p.next=q.next;
            }else{
                p=p.next;
            }
            q=q.next;
        }
        return h;
    }
}