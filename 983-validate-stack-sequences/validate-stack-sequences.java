class Solution {
    public boolean validateStackSequences(int[] a, int[] b) {
        int i=0,j=0;
        int n=a.length;
        Deque<Integer>stk=new ArrayDeque<>();
        for(i=0;i<n;i++){
            stk.push(a[i]);
            while(!stk.isEmpty() && stk.peek()==b[j]){
                stk.pop();
                j++;
            }
        }
        while(!stk.isEmpty()){
            if(stk.peek()!=b[j]) return false;
            stk.pop();
                j++;
        }
        return true;
    }
}