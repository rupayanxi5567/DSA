class Solution {
    public int largestRectangleArea(int[] a) {
        int n=a.length,mx=0;
        Deque<Integer>stk=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && a[stk.peek()]>a[i]){
                int h=stk.pop();
                int nse=i;
                int pse=stk.isEmpty()?-1:stk.peek();

                int area=a[h]*(nse-pse-1);
                mx=Math.max(mx,area);
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int h=stk.pop();
            int nse=n;
            int pse=stk.isEmpty()?-1:stk.peek();
            int area=a[h]*(nse-pse-1);
            mx=Math.max(mx,area);
        }
        return mx;
    }
}