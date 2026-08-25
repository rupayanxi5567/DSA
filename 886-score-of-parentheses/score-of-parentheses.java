class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Deque<Integer>stk=new ArrayDeque<>();
        stk.push(0);
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                stk.push(0);
            }else{
                int v=stk.pop();
                int score=Math.max(1,2*v);
                stk.push(score+stk.pop());
            }
        }
        return stk.pop();
    }
}