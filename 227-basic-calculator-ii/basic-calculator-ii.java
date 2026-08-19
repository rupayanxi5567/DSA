class Solution {
    public int calculate(String str) {
        int n=str.length();
        Deque<Integer>stk=new ArrayDeque<>();
        char op='+';
        int cn=0;
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                cn=cn*10+(c-'0');
            }
            if((!Character.isDigit(c) && c!=' ') ||i==n-1 ){
                if(op=='+'){
                    stk.push(cn);
                }else if(op=='-'){
                    stk.push(-cn);
                }else if(op=='*'){
                    stk.push(stk.pop()*cn);
                }else if(op=='/'){
                    stk.push(stk.pop()/cn);
                }
                cn=0;
                op=c;
            }
        }

        int res=0;
        for(int i:stk){
            res+=i;
        }
        return res;
    }
}