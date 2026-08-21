class Solution {
    public int largestRectangleArea(int[] a) {
        int n=a.length,mxa=0,area=1;
        Deque<Integer>stk=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && a[i]<a[stk.peek()]){
                int h=stk.pop();
                int nse=i;
                int pse=stk.isEmpty()?-1:stk.peek();        
                mxa=Math.max(mxa,a[h]*(nse-pse-1));
            }
                stk.push(i);
        }
        while(!stk.isEmpty()){
            int h=a[stk.pop()];
            int nse=n;
            int pse=stk.isEmpty()?-1:stk.peek();
            mxa=Math.max(mxa,h*(nse-pse-1));
        }
        return mxa;
    }
}