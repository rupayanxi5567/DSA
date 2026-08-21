class Solution {
    public int[] asteroidCollision(int[] s) {
        Deque<Integer>stk=new ArrayDeque<>();
        for(int si:s){
            while(!stk.isEmpty() && si<0 && stk.peek()>0 && Math.abs(si)>stk.peek()){
                stk.pop();
            }
            if(!stk.isEmpty() && si<0 && stk.peek()>0 && Math.abs(si)==stk.peek()){
                stk.pop();
                continue;
            }
            if(!stk.isEmpty() && si<0 && Math.abs(si)<stk.peek()){
                continue;
            }
            stk.push(si);
        }
        int []res=new int [stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            res[i] = stk.pop();
        }
        return res;
    }
}