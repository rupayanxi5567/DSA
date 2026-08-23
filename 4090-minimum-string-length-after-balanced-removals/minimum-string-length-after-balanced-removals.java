class Solution {
    public int minLengthAfterRemovals(String s) {
        int n=s.length();
        Deque<Character>stk=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(!stk.isEmpty() && c!=stk.peek()){
                stk.pop();
                continue;
            }
            stk.push(c);
        }
        return stk.size();
    }
}