class Solution {
    public int z(int n,int c){
        if(n==0)return c;
        if(n%2==0){
            c++;
            return z(n/2,c);
        }
        c++;
        return z(n-1,c);
    }
    public int numberOfSteps(int n) {
        return z(n,0);
    }
}