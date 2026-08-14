class Solution {
    public int[] searchRange(int[] a, int x) {
        int n=a.length;
        int l=0,r=n-1,ans1=-1,ans2=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(x>a[m]) l=m+1;
            else if(x==a[m]) {ans1=m;r=m-1;}
            else r=m-1;
        }
        l=0;
        r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(x<a[m]) r=m-1;
            else if(x==a[m]){ans2=m;l=m+1;}
            else l=m+1;
        }
        return new int[]{ans1,ans2};
    }
}