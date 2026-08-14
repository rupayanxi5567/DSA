class Solution {
    public int findPeakElement(int[] a) {
        int n=a.length;
        if(n==1)return 0;
        int l=0,r=n-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(a[m]<a[m+1]) l=m+1;
            else r=m;
        }
        return l;
    }
}