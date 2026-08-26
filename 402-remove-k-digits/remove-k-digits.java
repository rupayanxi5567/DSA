class Solution {
    public String removeKdigits(String s, int k) {
        int n=s.length();
        if(n==k)return "0";
        Deque<Character> stk=new ArrayDeque<>();
        int sz=stk.size();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            while(!stk.isEmpty() && k>0 && stk.peek()>c){
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        while(!stk.isEmpty() && k>0){
                stk.pop();
                k--;
        }
        StringBuilder sb=new StringBuilder();
        for(char x:stk){
            sb.append(x);
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.length()==0)return "0";
        return sb.toString();
    }
}