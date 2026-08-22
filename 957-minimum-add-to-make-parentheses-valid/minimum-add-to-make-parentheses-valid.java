class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character>stk=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='(')stk.push(c);
            else if(!stk.isEmpty() && c==')' && stk.peek()=='(')stk.pop();
            else if(c==')')stk.push(c);
        }
        return stk.size();
    }
}