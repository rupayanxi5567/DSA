class Solution {
    public int maxFrequency(int[] a, int k) {
        Arrays.sort(a);
        int l=0,mxc=-1;
        long s=0;
        int n=a.length;
        for(int r=0;r<n;r++){
            s=(long)s+a[r];
            while ((long) a[r] * (r - l + 1) - s > k){
                s=(long)s-a[l];
                l++;
            }
            mxc=Math.max(mxc,r-l+1);
        }
        return mxc;
    }
}