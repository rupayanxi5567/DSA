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
    public ListNode removeElements(ListNode h, int x) {
        while(h!=null && h.val==x)h=h.next;
        if(h==null||h.next==null)return h;
        ListNode p=h;
        while(p!=null && p.next!=null){
            while(p.next!=null && p.next.val==x){
                p.next=p.next.next;
            }
            p=p.next;
        }
    return h;
    }
}