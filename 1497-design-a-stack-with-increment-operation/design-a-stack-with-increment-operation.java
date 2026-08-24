class CustomStack {

    int []a;
    int t;
    int mxs;

    public CustomStack(int mxs) {
        this.mxs=mxs;
        this.a=new int[mxs];
        this.t=0;        
    }
    
    public void push(int x) {
        if(t<mxs) a[t++]=x;
    }
    
    public int pop() {
        if(t==0) return -1;
        t--;
        return a[t];
    }
    
    public void increment(int k, int val) {
        if(t-1>=k){
            for(int i=0;i<k;i++){
                a[i]+=val;
            }
        }else{
            for(int i=0;i<t;i++){
                a[i]+=val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */