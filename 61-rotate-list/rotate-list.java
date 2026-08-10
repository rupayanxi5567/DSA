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
    public ListNode rotateRight(ListNode h, int k) {
        if(h==null || h.next==null) return h;
        int cout=0;
        ListNode counter_node=h;
        while(counter_node!=null){
            cout++;
            counter_node=counter_node.next;
        }
        k=k%cout;
        int to_move=cout-k;
        ListNode p=h,p2=h;
        for(int i=1;i<to_move;i++){
            p=p.next;
        }
        while(p2.next!=null){
            p2=p2.next;
        }

        // p.next=null;
        p2.next=h;
        h=p.next;
        p.next=null;
        return h;

    }
}