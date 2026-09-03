class Solution {
    public double calc(double x,long n){
            if(n==0)return 1;
            if(n%2==0){
                return calc(x*x,n/2);
            }else{
                return x*calc(x,n-1);
            }
    }
    public double myPow(double x, int n) {
        long ln=n;
        if(n<0){
            x=1/x;
            ln=-ln;
        }
        return calc(x,ln);
    }
}