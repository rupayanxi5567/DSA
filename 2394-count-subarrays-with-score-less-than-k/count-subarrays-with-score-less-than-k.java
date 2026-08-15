class Solution {
    public long countSubarrays(int[] a, long k) {
        int l=0,n=a.length;
        long c=0,s=0,skore=0;
        for(int r=0;r<n;r++){
            s=s+a[r];
            skore=s*(r-l+1);
            while(skore>=k){
                s=s-a[l];
                l++;
                skore=s*(r-l+1);
            }
            c=c+(long)(r-l+1);
        }
        return c;
    }
}