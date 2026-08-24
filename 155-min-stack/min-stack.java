class MinStack {

    Deque<Integer>stk;
    Deque<Integer>minStk;

    public MinStack() {
        stk=new ArrayDeque<>();
        minStk=new ArrayDeque<>();
    }
    
    public void push(int x) {
        stk.push(x);
        if(minStk.isEmpty()){
            minStk.push(x);
        }else{
            if(x<=minStk.peek()){
                minStk.push(x);
            }
        }
    }
    
    public void pop() {
        int y=stk.pop();
            if(y==minStk.peek()){
                minStk.pop();
            }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.size()==0?-1:minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */