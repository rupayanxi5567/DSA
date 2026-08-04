class Solution {
    public int numSubarrayProductLessThanK(int[] a, int k) {
        int l=0,r=0,n=a.length,c=0;
        long p=1;
        for(r=0;r<n;r++){
            p=p*a[r];
            while(l<=r && p>=k){
                p=p/a[l];
                l++;
            }
            if(l<=r && p<k){
                c=c+r-l+1;
            }
        }
        return c;
    }
}