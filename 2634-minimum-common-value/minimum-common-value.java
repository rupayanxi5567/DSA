class Solution {
    public int getCommon(int[] a, int[] b) {
        int l=0,r=0;
        int m=a.length,n=b.length;
        int min=Integer.MAX_VALUE;

        while(l<m && r<n){
            if(b[r]==a[l]) {
                min=Math.min(min,a[l]);
                l++;
                r++;
            }
            else if(b[r]>a[l]){
                l++;
            }else if(b[r]<=a[l]){
                r++;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}