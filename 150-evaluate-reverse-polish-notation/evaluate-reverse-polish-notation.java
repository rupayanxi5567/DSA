class Solution {
    public int evalRPN(String[] str) {
        Deque<Integer>stk=new ArrayDeque<>();
        for(String s:str){
            if(s.equals("+")){
                stk.push(stk.pop() + stk.pop());
            }else if(s.equals("*")){
                stk.push(stk.pop() * stk.pop());
            }else if(s.equals("-")){
                int y=stk.pop();
                int x=stk.pop();
                stk.push(x - y);
            }else if(s.equals("/")){
                int y=stk.pop();
                int x=stk.pop();
                stk.push(x / y);
            }else{
                stk.push(Integer.parseInt(s));
            }
        }

        return stk.pop();
    }
}