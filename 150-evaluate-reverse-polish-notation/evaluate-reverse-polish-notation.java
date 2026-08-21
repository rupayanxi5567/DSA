class Solution {
    public int evalRPN(String[] s) {
        Deque<String>stk=new ArrayDeque<>();
        for(int i=0;i<s.length;i++){
            if(s[i].equals("+") || s[i].equals("-") || s[i].equals("*") || s[i].equals("/")){
                int y=Integer.parseInt(stk.pop());
                int x=Integer.parseInt(stk.pop());
                if(s[i].equals("+")){
                    stk.push(String.valueOf(x+y));
                }else if(s[i].equals("-")){
                    stk.push(String.valueOf(x-y));
                }else if(s[i].equals("*")){
                    stk.push(String.valueOf(x*y));      
                }else if(s[i].equals("/")){
                    stk.push(String.valueOf(x/y));
                }
            }else{
                stk.push(s[i]);
            }
        }
        int res=Integer.parseInt(stk.pop());
        return res;
    }
}