class Solution {
    public int rob(int[] a) {
        int n=a.length;
        int []dp=new int[n+1];
        return bottom_up(a,n-1,dp);
    }
    public static int bottom_up(int[] a,int n, int[]dp){
        for(int i=0;i<=n;i++){
            int take = a[i] + (i>=2 ? dp[i-2] : 0);
            int skip = (i>=1 ? dp[i-1] : 0);
            dp[i] = Math.max(take,skip);
        }
        return dp[n];
    }
}