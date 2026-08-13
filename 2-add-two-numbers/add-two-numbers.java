class Solution {
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        if(h2 == null && h1 == null) return h1;

        ListNode p = h1;
        ListNode q = h2;

        while(p != null && q != null) {
            p.val += q.val;
            
            if(p.val >= 10) {
                p.val -= 10;
                if(p.next==null){
                    ListNode tep2=new ListNode(1);
                    p.next=tep2;
                }else{
                    p.next.val += 1;
                }
            }
            
            if(q.next == null) {
                q.next = p.next;
                p = p.next;
                while(p != null && p.val >= 10) {
                    if(p.next == null) {
                        p.val = 0;
                        ListNode tep = new ListNode(1);
                        p.next = tep;
                        tep.next = null;
                        break;
                    } else {
                        p.val -= 10;
                        p.next.val += 1;
                        p = p.next;
                    }
                }
                return h1;
            }
            
            if(p.next == null) {
                p.next = q.next;
                q = q.next;
                while(q != null && q.val >= 10) {
                    if(q.next == null) {
                        q.val = 0;
                        ListNode tep1 = new ListNode(1);
                        q.next = tep1;
                        tep1.next = null;
                        break;
                    } else {
                        q.val -= 10;
                        q.next.val += 1;
                        q = q.next;
                    }
                }
                return h1;
            }

            p = p.next;
            q = q.next;
        }
        
        return h1;
    }
}