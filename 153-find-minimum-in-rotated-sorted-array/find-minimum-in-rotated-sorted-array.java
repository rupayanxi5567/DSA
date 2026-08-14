class Solution {
    public int findMin(int[] a) {
        int n=a.length;
        if(n==1)return a[0];
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(m>0 && m<n-1 && a[m]>a[m+1] && a[m]>a[m-1])return a[m+1];
            else if((m>0 && m<n-1 && a[m]<a[m+1] && a[m]<a[m-1]) || (a[l]==a[m] && a[r]==a[m]))return a[m];
            else if(a[l]>a[m]){ //ok
                r=m;
            }else if(a[m]>a[r]){
                l=m+1;
            }else if(a[m]>=a[l] && a[m]<a[r]) return a[0];
        }
        return -1;
    }
}