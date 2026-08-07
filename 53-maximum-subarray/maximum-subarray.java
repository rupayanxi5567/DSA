class Solution {
    public int maxSubArray(int[] a) {
        int n=a.length;
        int be=a[0];
        int ans=be;

        for(int i=1;i<n;i++){
            be=Math.max(be+a[i],a[i]);
            ans=Math.max(ans,be);
        }
        return ans;
    }
}