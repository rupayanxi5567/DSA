class Solution {
    public int minLength(String s) {
        int n=s.length();
        Deque<Character>stk=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            if(stk.isEmpty()){
                stk.push(c);
            }else{
                if((c=='B' && stk.peek()=='A')  || (c=='D' && stk.peek()=='C') ){
                    stk.pop();
                }else{
                    stk.push(c);
                }
            }
        }
        return stk.size();
    }
}