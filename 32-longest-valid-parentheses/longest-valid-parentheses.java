class Solution {
    public int longestValidParentheses(String s) {
        int mx=0;
        int n=s.length();
        Deque<Integer>stk=new ArrayDeque<>();
        stk.push(-1);
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                stk.push(i);
            }else{
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                }else{
                    mx=Math.max(mx,i-stk.peek());
                }
            }
        }
        return mx;
    }
}