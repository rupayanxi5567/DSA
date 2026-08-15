class Solution {
    public int longestSubarray(int[] a) {
        int l=0,n=a.length;
        int mxc=0,t=0;
        for(int r=0;r<n;r++){
            if(a[r]==0)t++;
            while(t>=2){
                if(a[l]==0)t--;
                l++;
            }
            mxc=Math.max(mxc,r-l);
        }
        return mxc;
    }
}