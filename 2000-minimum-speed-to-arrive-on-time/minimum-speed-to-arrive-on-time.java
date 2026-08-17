class Solution {
    public double check(int[] a,int x){
        double s=0;
        for(int i=0;i<a.length-1;i++){
            s += (a[i] + x - 1) / x;
        }
        s+= (double) a[a.length-1]/x;
        return s;
    }
    public int minSpeedOnTime(int[] a, double h) {
        int ans=-1, l=1,r = 10_000_000; 
        while(l<=r){
            int m=l+(r-l)/2;
            double res=check(a,m);
            if(res<=h){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}