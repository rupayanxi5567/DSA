class Solution {
    public int maxProfit(int[] a) {
        int l=0,n=a.length,p=0,mxp=0,min=Integer.MAX_VALUE;
        for(int r=1;r<n;r++){
            if(a[r]>a[l]){
                p=a[r]-a[l];
                mxp=Math.max(mxp,p);
            }else {
                l=r;
            }
        }
        
        return mxp;
    }
}