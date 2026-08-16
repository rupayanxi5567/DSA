class Solution {
    
    public static int check(int[] a,int x){
        int s=0,res=0;
        for(int i=0;i<a.length;i++){
            // s=s+;
            res=a[i]/x;
            s += (a[i] + x - 1) / x;
        }
        return s;
    }

    public int smallestDivisor(int[] a, int t) {
        int s=0,mx=-1,ans=0;
        for(int i=0;i<a.length;i++){
            s=s+a[i];
            mx=Math.max(mx,a[i]);
        }
        int l=1,r=mx;
        while(l<=r){
                int m=l+(r-l)/2;
                int res=check(a,m);
                if(res>t){
                    l=m+1;
                }else{
                    ans=m;
                    r=m-1;
                }
            }
        return ans;
    }
}