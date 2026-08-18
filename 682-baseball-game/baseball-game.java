class Solution {
    public int calPoints(String[] s) {
        Deque<Integer>stk=new ArrayDeque<>();
        int sums=0;
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals("+") && !s[i].equals("D") && !s[i].equals("C")) {
                int nums=Integer.parseInt(s[i]);
                stk.push(nums);
            }else if(!stk.isEmpty() && s[i].equals("C")){
                stk.pop();
            }else if(s[i].equals("D")){
                stk.push(2*stk.peek());
            }else if(!stk.isEmpty() && s[i].equals("+")){
                int x=stk.pop();
                int y=stk.pop();
                int z=x+y;
                stk.push(y);
                stk.push(x);
                stk.push(z);
            }
        }
        while(!stk.isEmpty()){
            sums=sums+stk.pop();
        }
        return sums;
    }
}