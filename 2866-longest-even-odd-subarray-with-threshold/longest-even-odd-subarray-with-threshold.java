class Solution {
    public int longestAlternatingSubarray(int[] a, int t) {
        int c=0,mxc=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if (a[i] > t) c = 0;
            else if (c > 0 && a[i] % 2 != a[i - 1] % 2) c++;
            else if (a[i] % 2 == 0) c = 1;
            else c = 0;
            mxc=Math.max(mxc,c);
        }
        return mxc;
    }
}