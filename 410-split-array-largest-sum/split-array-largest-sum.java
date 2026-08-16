class Solution {
    public static int check(int[] a,int x){
        int s=0,c=0;
        for(int i=0;i<a.length;i++){
            s=s+a[i];
            if(s>x){
                c++;
                s=a[i];
            }
        }
        return ++c;
    }
    public int splitArray(int[] a, int d) {
        int s=0,mx=0,ans=0;
        for(int i=0;i<a.length;i++){
            s=s+a[i];
            mx=Math.max(mx,a[i]);
        }
        int l=mx,r=s;
        while(l<=r){
            int m=l+(r-l)/2;
            int res=check(a,m);
            if(res>d){
                l=m+1;
            }else{
                ans=m;
                r=m-1;
            }
        }
        return ans;
    }
}