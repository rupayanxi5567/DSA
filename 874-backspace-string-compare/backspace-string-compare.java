class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character>stk1=new ArrayDeque<>();
        Deque<Character>stk2=new ArrayDeque<>();
        int m=s.length();
        int n=t.length();

        for(int i=0;i<m;i++){
            if(s.charAt(i)!='#'){
                stk1.push(s.charAt(i));
            }else if(s.charAt(i)=='#' && !stk1.isEmpty()){
                stk1.pop();
            }
        }

        for(int i=0;i<n;i++){
            if(t.charAt(i)!='#'){
                stk2.push(t.charAt(i));
            }else if(t.charAt(i)=='#' && !stk2.isEmpty()){
                stk2.pop();
            }
        }

        if(stk1.size() != stk2.size()) return false;

        while(!stk2.isEmpty() && !stk1.isEmpty()){
            if(stk1.pop() != stk2.pop()){
                return false;
            }
        }
        return true;
    }
}