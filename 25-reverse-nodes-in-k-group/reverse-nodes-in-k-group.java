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
    public ListNode reverseKGroup(ListNode h, int k) {
        if(h==null || k==1) return h;
        ListNode d = new ListNode(0);
        d.next=h;
        ListNode st=d;
        while(true){
            ListNode kth = st;
            for(int i=1;i<=k && kth!=null;i++){
                kth=kth.next;
            }
            if(kth==null) break;
            ListNode grn=kth.next;
            ListNode p=grn;
            ListNode crr=st.next;
            
            while(crr!=grn){
                ListNode nxt=crr.next;
                crr.next=p;
                p=crr;
                crr=nxt;
            }
            ListNode tep=st.next;
            st.next=kth;
            st=tep;

        }
        return d.next;

    }
}