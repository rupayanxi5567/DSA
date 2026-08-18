class Solution {
    public int[] nextGreaterElements(int[] a) {
        int n=a.length;
        int []res=new int[n];
        Deque<Integer>stk=new ArrayDeque<>();
        for(int i=2*n-1;i>=0;i--){
            while(!stk.isEmpty() && a[i%n]>=stk.peek()){
                stk.pop();
            }
            if(i<n){
                res[i]=stk.isEmpty()?-1:stk.peek();
            }
            stk.push(a[i%n]);
        }
        return res;
    }
}