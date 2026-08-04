class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n=a.length;
        int [] res= new int[n-k+1];
        Deque<Integer> dq=new LinkedList<>();

        for(int r=0;r<n;r++){
            while(!dq.isEmpty() && dq.peekFirst()<=r-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && a[dq.peekLast()]<a[r]){
                dq.pollLast();
            }
            dq.addLast(r);
            if(r>=k-1){
                res[r-k+1]=a[dq.peekFirst()];
            }
        }

       return res;
    }
}